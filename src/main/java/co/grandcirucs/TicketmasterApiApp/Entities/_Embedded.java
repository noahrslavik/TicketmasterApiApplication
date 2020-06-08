package co.grandcirucs.TicketmasterApiApp.Entities;

import java.util.List;

public class _Embedded {

	private List <Venues> venues;

	public List<Venues> getVenues() {
		return venues;
	}

	public void setVenues(List<Venues> venues) {
		this.venues = venues;
	}

	@Override
	public String toString() {
		return "_Embedded []";
	}

}
