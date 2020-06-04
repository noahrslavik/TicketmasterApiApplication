package co.grandcirucs.TicketmasterApiApp.Entities;

import java.util.List;

public class Embedded {

	private List<Events> events;

	public List<Events> getEvents() {
		return events;
	}

	public void setEvents(List<Events> events) {
		this.events = events;
	}

	@Override
	public String toString() {
		return "Embedded [events=" + events + "]";
	}
	

}
