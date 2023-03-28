package instenceAndClass;

import java.util.Scanner;

public class phoneInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		contect ct = new contect();
		
		System.out.println("이름>");
		ct.setName(sc.next());
		
		System.out.println("주소>");
		ct.setAddress(sc.next());
	
		System.out.println("생일>");
		ct.setBirthday(sc.next());
		
		System.out.println("전화번호>");
		ct.setPhoneNum(sc.next());
		
		System.out.println("그룹>");
		ct.setGroup(sc.next());
		
		System.out.println("이메일>");
		ct.setEmail(sc.next());
		
		ct.print();
	}
}
