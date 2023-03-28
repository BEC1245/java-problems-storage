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
		ct.setAddress("모");
		ct.setBirthday("불");
		ct.setEmail("아");
		ct.setGroup("위");
		ct.setName(null);
		ct.setPhoneNum(null);
		
		ct.print();
		
		ct.getUserInput();
		ct.print();
	}
}
