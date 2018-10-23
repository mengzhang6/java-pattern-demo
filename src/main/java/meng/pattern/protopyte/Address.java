package meng.pattern.protopyte;

public class Address implements Cloneable{
	private String province;
	private String city;
	private String county;

	public Address(String province, String city, String county) {
		super();
		this.province = province;
		this.city = city;
		this.county = county;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}
	
	public Address clone() {
		try {
			return (Address) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String toString() {
		return "Address [province=" + province + ", city=" + city + ", county="
				+ county + "]";
	}

}
