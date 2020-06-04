package co.grandcirucs.TicketmasterApiApp.Entities;

public class Classifications {

	Genre genre;

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Classifications [genre=" + genre + "]";
	}
	
	
	
	
}
