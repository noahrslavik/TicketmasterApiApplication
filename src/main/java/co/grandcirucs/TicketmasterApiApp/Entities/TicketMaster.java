package co.grandcirucs.TicketmasterApiApp.Entities;

public class TicketMaster {

	private Embedded _embedded;
	private Links _links;
	private Page page;
	
	public Embedded get_embedded() {
		return _embedded;
	}
	public void set_embedded(Embedded _embedded) {
		this._embedded = _embedded;
	}
	public Links get_links() {
		return _links;
	}
	public void set_links(Links _links) {
		this._links = _links;
	}
	public Page getPage() {
		return page;
	}
	public void setPage(Page page) {
		this.page = page;
	}
	@Override
	public String toString() {
		return "TicketMaster [_embedded=" + _embedded + ", _links=" + _links + ", page=" + page + "]";
	}
	
	
	
	
}
