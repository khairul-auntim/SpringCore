package autowire;

public class Address {
	private String road;
	private int zipcode;
	private int houseno;
	
	public String getRoad() {
		return road;
	}
	
	public void setRoad(String road) {
		this.road = road;
	}
	public int getZipcode() {
		return zipcode;
	}
	
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	public int getHouseno() {
		return houseno;
	}
	
	public void setHouseno(int houseno) {
		this.houseno = houseno;
	}

	@Override
	public String toString() {
		return "Address [road=" + road + ", zipcode=" + zipcode + ", houseno=" + houseno + "]";
	}
	

}
