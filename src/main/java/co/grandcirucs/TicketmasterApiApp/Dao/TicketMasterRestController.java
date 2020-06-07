package co.grandcirucs.TicketmasterApiApp.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import co.grandcirucs.TicketmasterApiApp.Entities.BList;

@RestController
public class TicketMasterRestController {

	@Autowired
	private TicketMasterDao repository;

	@GetMapping("/favoriteslist")
	public String list(Model model) {
		model.addAttribute("favorites", repository.findAll());
		return "favoriteslist";
	}

	@PostMapping("/addtofavoriteslist")
        public String newBList(@RequestParam (value = "artistName", required = false) String bname,
		        @RequestParam(value = "classifications", required = false) String bgenre,
		        @RequestParam(value = "localTime", required = false) String btime,
		        @RequestParam(value = "localDate", required = false) String bdate,
		        @RequestParam(value = "locale", required = false) String blocale,
		        @RequestParam(value = "urlIn", required = false) String burl,
		        @RequestParam(value = "image", required = false) String burlimage, Model model) {
                
              BList bList = new BList(bname, bgenre, btime, bdate, blocale, burl, burlimage);
                 repository.save(bList);

		return "index";
	}

//	 Single item
//
//	@GetMapping("/")
//	Blist one(@PathVariable Long id) {
//		return repository.findByField("");
//				.orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "No such Product."));
//	}
//
//	@DeleteMapping("/")
//	void deleteBList(@PathVariable Long "") {
//		repository.deleteBy("");
//	}


	
	
	
	
	
	
}
