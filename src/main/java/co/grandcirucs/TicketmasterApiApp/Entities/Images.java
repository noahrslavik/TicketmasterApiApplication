package co.grandcirucs.TicketmasterApiApp.Entities;

public class Images {
	private String ratio;
	private String url;
	private Integer width;
	private Integer height;

	public String getRatio() {
		return ratio;
	}

	public void setRatio(String ratio) {
		this.ratio = ratio;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Integer getWidth() {
		return width;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Images [ratio=" + ratio + ", url=" + url + ", width=" + width + ", height=" + height + "]";
	}

}
