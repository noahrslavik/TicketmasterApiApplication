package co.grandcirucs.TicketmasterApiApp.Dao;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import co.grandcirucs.TicketmasterApiApp.Entities.Classifications;
import co.grandcirucs.TicketmasterApiApp.Entities.ConcertInfo;
import co.grandcirucs.TicketmasterApiApp.Entities.Embedded;
import co.grandcirucs.TicketmasterApiApp.Entities.Events;
import co.grandcirucs.TicketmasterApiApp.Entities.Images;
import co.grandcirucs.TicketmasterApiApp.Entities.TicketMaster;

@Service
public class TicketmasterApiService {

	private final String ticketId ="IJ14NIqaNP96GM7IupubEkesIwp6QG3A";
	private RestTemplate rest = new RestTemplate();
	public List<ConcertInfo> searchByKeyword(String keyword, String name, Integer pageNumber){
		
	    if(pageNumber == null || pageNumber< 0) { pageNumber = 0;}

		String url = "https://app.ticketmaster.com/discovery/v2/events?apikey={ticketId}&keyword={keyword}&classificationName={name}&page={pageNumber}";
		TicketMaster response = rest.getForObject(url, TicketMaster.class, ticketId, keyword, name,pageNumber);
	
		Embedded embed = response.get_embedded();
		List<ConcertInfo>concertArray = new ArrayList<ConcertInfo>();
		List<Events> listOfEvents = embed.getEvents();
		for(int i = 0; i < listOfEvents.size(); i++ ) {
			String artistName = listOfEvents.get(i).getName();
			String urlIn = listOfEvents.get(i).getUrl();
			String locale = listOfEvents.get(i).getLocale();
			String timezone = listOfEvents.get(i).getDates().getTimezone();
			LocalDate localDate = listOfEvents.get(i).getDates().getStart().getLocalDate();
			LocalTime localTime = listOfEvents.get(i).getDates().getStart().getLocalTime();
			
			String image = listOfEvents.get(i).getImages().get(2).getUrl();
			String classifications  = listOfEvents.get(i).getClassifications().get(0).getGenre().getName();
			
			
			ConcertInfo concert = new ConcertInfo(artistName, urlIn, locale, timezone, localDate, 
					localTime, image, classifications);
			
			concertArray.add(concert);
		}
		return concertArray;
	}
	}
	
	
	
