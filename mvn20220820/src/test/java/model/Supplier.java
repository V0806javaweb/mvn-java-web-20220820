package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="suppliers")
public class Supplier {
	
	@Id
	//rename SUP_ID to supId
	@Column(name="SUP_ID")
    int supId;
	
	//rename SUP_Name to supName
	@Column(name="SUP_Name")
	String supName;
	
	String street;
	String city;
	char state;
    char zip;
    public Supplier() {} //empty constructor
    
	public Supplier(int supId, String supName, String street, String city, char state, char zip) {
		super();
		this.supId = supId;
		this.supName = supName;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	public int getSupId() {
		return supId;
	}

	public void setSupId(int supId) {
		this.supId = supId;
	}

	public String getSupName() {
		return supName;
	}

	public void setSupName(String supName) {
		this.supName = supName;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public char getState() {
		return state;
	}

	public void setState(char state) {
		this.state = state;
	}

	public char getZip() {
		return zip;
	}

	public void setZip(char zip) {
		this.zip = zip;
	}

	@Override
	public String toString() {
		return "Supplier [supId=" + supId + ", supName=" + supName + ", street=" + street + ", city=" + city
				+ ", state=" + state + ", zip=" + zip + "]";
	}
    
    
}
