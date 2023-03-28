package instenceAndClass;

import java.io.IOException;

public class exacuteMain {
	public static void main(String[] args) throws IOException {;
		contect ct = new contect("010-1234-1234");
		System.out.println(ct.getAddress());
		System.out.println(ct.getBirthday());
		System.out.println(ct.getEmail());
		System.out.println(ct.getGroup());
		System.out.println(ct.getName());
		System.out.println(ct.getPhoneNum());
		
		ct.print();
		ct.setAddress("a");
		ct.setBirthday("b");
		ct.setEmail("c");
		ct.setGroup("d");
		ct.setName("e");
		ct.setPhoneNum("f");
		
		ct.print();
		
		ct.getUserInput();
		ct.print();
	}
}
