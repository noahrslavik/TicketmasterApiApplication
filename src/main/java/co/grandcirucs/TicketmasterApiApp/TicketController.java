package co.grandcirucs.TicketmasterApiApp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import co.grandcirucs.TicketmasterApiApp.Dao.TicketMasterDao;
import co.grandcirucs.TicketmasterApiApp.Dao.TicketmasterApiService;
import co.grandcirucs.TicketmasterApiApp.Entities.BList;
import co.grandcirucs.TicketmasterApiApp.Entities.ConcertInfo;

@Controller
public class TicketController {

	@Autowired
	private TicketmasterApiService service;
	
	@Autowired TicketMasterDao repository;
	
	@RequestMapping("/")
	public String search(@RequestParam(required=false) String keyword,@RequestParam(required=false) String classificationName,
			@RequestParam(required=false) String local,
			@RequestParam(required=false) Integer pageNumber, Model model) {
		
		if(local == null) {
			local = "en-us";
					}
		List<BList> bucket = repository.findAll();
		model.addAttribute("bucket",bucket);
		
		model.addAttribute("local", local);
		model.addAttribute("name", classificationName);
		model.addAttribute("keyword", keyword);
		model.addAttribute("pageNumber", pageNumber);

		List<ConcertInfo> tickets = service.searchByKeyword(keyword,classificationName, local,pageNumber);
		System.out.println(tickets);
		if(tickets == null) {
		return "index";	
		}
		else {
		model.addAttribute("tickets",tickets);
		return "index";
		}
	}
	
	@PostMapping("/addtofavoriteslist")
  public String newBList(@RequestParam (value = "artistName", required = false) String bname,
	        @RequestParam(value = "localDate", required = false) String bdate,
	        @RequestParam(value = "localTime", required = false) String btime,
	        @RequestParam(value = "classifications", required = false) String bgenre,
	        @RequestParam(value = "urlIn", required = false) String burl,
	        @RequestParam(value = "locale", required = false) String blocale,
	        @RequestParam(value = "image", required = false) String burlimage, 
	        @RequestParam(value = "pageNumber", required = false) Integer pageNumber,
	        @RequestParam(value = "keyword", required = false) String keyword,
	        Model model){
		
            BList blist = new BList(bname, bdate, btime, bgenre, burl, blocale, burlimage);
            if (pageNumber ==  null) {pageNumber = 0;}
            System.out.print(pageNumber + keyword);
            model.addAttribute("pageNumber",pageNumber); 
            model.addAttribute("keyword",keyword);
            model.addAttribute("classificationName",bgenre);
            repository.save(blist);  
            String url = ("redirect:/?keyword="+ keyword + "&classificationName=" + bgenre + "&pageNumber=" + pageNumber);
            System.out.print(url);
	      return url;
}
	
	@RequestMapping("/favorites")public String fav(Model model){
		
		List<BList> bucket = repository.findAll();
		model.addAttribute("bucket",bucket);
		
		return "favorites";
		
	}
	@RequestMapping("/delete")
	public String delete(@RequestParam("bid") Long bid, Model model) { 
		repository.deleteById(bid);
		return "redirect:/favorites";
	}
	
}