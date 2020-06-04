package co.grandcirucs.TicketmasterApiApp.Dao;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import co.grandcirucs.TicketmasterApiApp.Entities.TicketMaster;

@Service
public class TicketmasterApiService {

	private final String ticketId ="IJ14NIqaNP96GM7IupubEkesIwp6QG3A";
	private RestTemplate rest = new RestTemplate();
	
	public TicketMaster searchByKeyword(String keyword){
		String url = "https://app.ticketmaster.com/discovery/v2/events?apikey={ticketId}&keyword={keyword}";
	
		
		TicketMaster response = rest.getForObject(url, TicketMaster.class, ticketId, keyword);
		System.out.println(response);
		return response;
	
	}
	
	
	
}