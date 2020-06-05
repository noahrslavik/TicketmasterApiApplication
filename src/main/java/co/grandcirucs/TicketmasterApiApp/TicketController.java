package co.grandcirucs.TicketmasterApiApp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import co.grandcirucs.TicketmasterApiApp.Dao.TicketmasterApiService;
import co.grandcirucs.TicketmasterApiApp.Entities.ConcertInfo;
import co.grandcirucs.TicketmasterApiApp.Entities.TicketMaster;

@Controller
public class TicketController {

	@Autowired
	private TicketmasterApiService service;
	
	@RequestMapping("/")
	public String search(@RequestParam(required=false) String keyword,
			@RequestParam(required=false) Integer pageNumber, Model model) {

		
		model.addAttribute("keyword", keyword);
		model.addAttribute("pageNumber", pageNumber);
		List<ConcertInfo> tickets = service.searchByKeyword(keyword, pageNumber);
		model.addAttribute("tickets",tickets);
		System.out.println(tickets);
		return "index";
	}
	
	
	
	
	
	
}
