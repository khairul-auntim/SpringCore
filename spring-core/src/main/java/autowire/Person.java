package autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Person {
	@Autowired
	@Qualifier("address")
	private Address address;

	public Address getAddress() {
		return address;
	}
	
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Person(Address address) {
		super();
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [address=" + address + "]";
	}

}
