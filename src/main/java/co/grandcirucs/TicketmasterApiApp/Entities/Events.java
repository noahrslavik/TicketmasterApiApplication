package co.grandcirucs.TicketmasterApiApp.Entities;

import java.util.List;

public class Events {

	
	private String name;
	private String url;
	private String locale;
	private List<Images> images;
	private Dates dates;
	private List <Classifications> classifications;
	private _Embedded _embedded;
	
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getLocale() {
		return locale;
	}
	public void setLocale(String locale) {
		this.locale = locale;
	}
	public List<Images> getImages() {
		return images;
	}
	public void setImages(List<Images> images) {
		this.images = images;
	}
	public Dates getDates() {
		return dates;
	}
	public void setDates(Dates dates) {
		this.dates = dates;
	}
	public List<Classifications> getClassifications() {
		return classifications;
	}
	public void setClassifications(List<Classifications> classifications) {
		this.classifications = classifications;
	}
	public _Embedded get_embedded() {
		return _embedded;
	}
	public void set_embedded(_Embedded _embedded) {
		this._embedded = _embedded;
	}
	@Override
	public String toString() {
		return "Events [name=" + name + ", url=" + url + ", locale=" + locale + ", images=" + images + ", dates="
				+ dates + ", classifications=" + classifications + ", _embedded=" + _embedded + "]";
	}
	
	
	
	
}
