package co.grandcirucs.TicketmasterApiApp.Entities;

import java.time.LocalDate;
import java.time.LocalTime;

public class ConcertInfo {
	
    private String artistName;
    private String urlIn;
	private String locale;
	private String timezone;
	private LocalDate localDate;
	private LocalTime localTime;
	private String image;
	private String classifications;
	
		public ConcertInfo() {
			
		}
	
	public ConcertInfo(String artistName, String urlIn, String locale, String timezone, LocalDate localDate,
			LocalTime localTime, String image, String classifications) {
		super();
		this.artistName = artistName;
		this.urlIn = urlIn;
		this.locale = locale;
		this.timezone = timezone;
		this.localDate = localDate;
		this.localTime = localTime;
		this.image = image;
		this.classifications = classifications;
	}
	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}
	public String getUrlIn() {
		return urlIn;
	}
	public void setUrlIn(String urlIn) {
		this.urlIn = urlIn;
	}
	public String getLocale() {
		return locale;
	}
	public void setLocale(String locale) {
		this.locale = locale;
	}
	public String getTimezone() {
		return timezone;
	}
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

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

	public String getArtistName() {
		return artistName;
	}

	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getClassifications() {
		return classifications;
	}
	public void setClassifications(String classifications) {
		this.classifications = classifications;
	}
	
	
	
	
	
}
