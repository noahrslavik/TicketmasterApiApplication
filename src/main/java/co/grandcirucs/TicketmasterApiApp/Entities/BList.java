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
	 // private String bperformance;
	    private String bdatetime;
		private String bgenre;
		private String btimezone;
		private String burl;
		private String blocale;
		private String bratio;
		private String burlimage;
		private Integer bwidth;
		private Integer bheight;
		
		@ManyToOne
		private User user;
	    
	    public BList() {
	    
	    }

		public String getBname() {
			return bname;
		}

		public void setBname(String bname) {
			this.bname = bname;
		}

		public String getBdatetime() {
			return bdatetime;
		}

		public void setBdatetime(String bdatetime) {
			this.bdatetime = bdatetime;
		}

		public String getBgenre() {
			return bgenre;
		}

		public void setBgenre(String bgenre) {
			this.bgenre = bgenre;
		}

		public String getBtimezone() {
			return btimezone;
		}

		public void setBtimezone(String btimezone) {
			this.btimezone = btimezone;
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

		public String getBratio() {
			return bratio;
		}

		public void setBratio(String bratio) {
			this.bratio = bratio;
		}

		public String getBurlimage() {
			return burlimage;
		}

		public void setBurlimage(String burlimage) {
			this.burlimage = burlimage;
		}

		public Integer getBwidth() {
			return bwidth;
		}

		public void setBwidth(Integer bwidth) {
			this.bwidth = bwidth;
		}

		public Integer getBheight() {
			return bheight;
		}

		public void setBheight(Integer bheight) {
			this.bheight = bheight;
		}

		@Override
		public String toString() {
			return "BList [bname=" + bname + ", bdatetime=" + bdatetime + ", bgenre=" + bgenre + ", btimezone="
					+ btimezone + ", burl=" + burl + ", blocale=" + blocale + ", bratio=" + bratio + ", burlimage="
					+ burlimage + ", bwidth=" + bwidth + ", bheight=" + bheight + "]";
		}
}
