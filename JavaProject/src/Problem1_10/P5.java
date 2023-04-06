package Problem1_10;

public class P5 {	
	public static void main(String[] args) {
		mamber mb = new mamber("변의찬", "010-1234-1234", "none", 1000, "chanymi....", "11-20", "some where in incheon");
		mamber mb2 = new mamber("변의찬", "010-1234-1234", "none", 1000, "chanymi....");
		mb.print();
		mb2.print();
		
		dataPrint(mb);
	}
	
	static void dataPrint(mamber Mamber) {
		Mamber.print();
	}
}

class mamber {
	private String name;
	private String phoneNumber;
	private String major;
	private int grade;
	private String email;
	private String birthday;
	private String address;
	
	public mamber(String name, String phoneNumber, String major, int grade, String email, String birthday,
			String address) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.major = major;
		this.grade = grade;
		this.email = email;
		this.birthday = birthday;
		this.address = address;
	}


	public mamber(String name, String phoneNumber, String major, int grade, String email) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.major = major;
		this.grade = grade;
		this.email = email;
		this.birthday = null;
		this.address = null;
	}


	void print() {
		System.out.printf("name : %s / phoneNumber : %s / major : %s / grade : %d / email : %s / birthday : %s / address  : %s \n",
						   name, phoneNumber, major, grade, email, birthday, address);
	}
}
