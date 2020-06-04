package co.grandcirucs.TicketmasterApiApp.Entities;

import java.time.LocalDate;
import java.time.LocalTime;

public class Start {

	LocalDate localDate;
	//time from API heirarachy
	LocalTime localTime;
	String dateTime;
	
	public LocalDate getLocalDate() {
		return localDate;
	}
	public void setLocalDate(LocalDate localDate) {
		this.localDate = localDate;
	}
	public LocalTime getLocalTime() {
		return localTime;
	}
	public void setLocalTime(LocalTime localTime) {
		this.localTime = localTime;
	}
	public String getDateTime() {
		return dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	
	@Override
	public String toString() {
		return "Start [localDate=" + localDate + ", localTime=" + localTime + ", dateTime=" + dateTime + "]";
	}
	
	
	
}
