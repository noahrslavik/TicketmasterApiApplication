package co.grandcirucs.TicketmasterApiApp.Entities;

public class Dates {

	Start start;
	String timezone;
	
	public Start getStart() {
		return start;
	}
	public void setStart(Start start) {
		this.start = start;
	}
	public String getTimezone() {
		return timezone;
	}
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
	@Override
	public String toString() {
		return "Dates [start=" + start + ", timezone=" + timezone + "]";
	}
	
	
	
}
