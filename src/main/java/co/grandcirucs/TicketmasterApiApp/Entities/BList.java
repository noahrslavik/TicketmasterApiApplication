package co.grandcirucs.TicketmasterApiApp.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "blist")
public class BList {

		@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long bid;
	    private String bname;
	    private String bdate;
	    private String btime;
		private String bgenre;
		private String burl;
		private String blocale;
		private String burlimage;
		
		@ManyToOne
		private User user;
	    
	    public BList() {
	    
	    }
	    
		public BList(String bname, String bdate, String btime, String bgenre, String burl, String blocale,
				String burlimage) {
			super();
			this.bname = bname;
			this.bdate = bdate;
			this.btime = btime;
			this.bgenre = bgenre;
			this.burl = burl;
			this.blocale = blocale;
			this.burlimage = burlimage;
		}


		public String getBdate() {
			return bdate;
		}

		public void setBdate(String bdate) {
			this.bdate = bdate;
		}

		public String getBtime() {
			return btime;
		}

		public void setBtime(String btime) {
			this.btime = btime;
		}

		public String getBname() {
			return bname;
		}

		public void setBname(String bname) {
			this.bname = bname;
		}

		public String getBgenre() {
			return bgenre;
		}

		public void setBgenre(String bgenre) {
			this.bgenre = bgenre;
	
		}

		public String getBurl() {
			return burl;
		}

		public void setBurl(String burl) {
			this.burl = burl;
		}

		public String getBlocale() {
			return blocale;
		}

		public void setBlocale(String blocale) {
			this.blocale = blocale;
		}

		public String getBurlimage() {
			return burlimage;
		}

		public void setBurlimage(String burlimage) {
			this.burlimage = burlimage;
		}
}
