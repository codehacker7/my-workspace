
public class Person {
private String name;
private String address;
private String phone;
private String email;
	private static int count;
	public Person() {
		count++;
	}
	
	public Person(String name,String address,String phone,String email) {
	setName(name);
	setAddress(address);
	setPhone(phone);
	setEmail(email);
	count++;
	}

	
	
	
	public static int getCount() {
		return count;
	}
	
	
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
		return "Name: "+getName()+" Address: "+getAddress()+" Phone: "+getPhone()+"Email: "+getEmail();
	}
	
}
