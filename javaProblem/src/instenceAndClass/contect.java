package instenceAndClass;

import java.io.IOException;
import java.util.Scanner;

//맴버가 너무 많아....
//노가다야...
public class contect {
	private String name, phoneNum, email, address, birthday, group;
	
	contect(String name, String phoneNum, String email, String address, String birthday, String group) {
		this.name = name;
		this.phoneNum = phoneNum;
		this.email = email;
		this.address = address;
		this.birthday = birthday;
		this.group = group;
	}
	
	contect(String phoneNum) {
		this(null, phoneNum, null, null, null, null);
	}
	
	contect() {
		this(null, null, null, null, null, null);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}
	
	public void getUserInput() throws IOException {
		Scanner sc = new Scanner(System.in);
		this.name = sc.next();
		this.phoneNum = sc.next();
		this.email = sc.next();
		this.address = sc.next();
		this.birthday = sc.next();
		this.group = sc.next();
	}
	
	public void print() {
		System.out.println(name);
		System.out.println(phoneNum);
		System.out.println(email);
		System.out.println(address);
		System.out.println(birthday);
		System.out.println(group);
	}
}
