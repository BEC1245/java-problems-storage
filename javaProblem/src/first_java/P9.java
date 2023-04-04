package first_java;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class P9 {
	public static void main(String[] args) throws IOException {
		Person3 ps = new Person3();		
		LocalDate ld = LocalDate.of(1972,11,21);
		ps.StringChack("!@#$@$@!#$@!fdfafsadfsdfasd@$#$@!$@!$@!$");
		ps.chackBirthDay(ld);
	}
}

class Person3 {
	long startTime;
	
	String name;
	String personNumber;
	
	@Override
	public boolean equals(Object obj) {
		Person3 PS = null;
		if(obj != null && obj instanceof Person3) {
			PS = (Person3)obj;
		}
		
		return PS.personNumber == this.personNumber;
	}
	
	void StartTime() {
		if(startTime != 0) {
			System.out.println("the StartTime is still runing");
			return;
		}
		
		this.startTime = System.nanoTime();
	}
	
	void EndTime() {
		if(startTime == 0) {
			System.out.println("you have to run StartTime Before runing this method");
			return;
		}
		
		long endTime = System.nanoTime();
		System.out.printf("the startTime was l% and endTime is l& \n so the result is this l% ", 
							startTime, endTime, endTime - startTime);
	}
	
	// 비교 연산자가 지나길때 char은 정수형을 문자로 반환해서 아스키 코드 쓸 핑요가 없었음
	void StringChack(String name) throws IOException {		
		char array[] = name.toCharArray();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		boolean hasNonChar = false;
		
		if(name.trim().isEmpty()) {
			System.out.println("you have to input at least one character");
			return;
		}
		
		for(int i = 0; i < name.length(); i++) {
			int inp = (int)array[i];
			if((inp >= 'a' && inp <= 'z') || (inp >= 'A' && inp <= 'Z')) {
				continue;
			}
			
			bw.write(i + " / " + inp + "\n");
			hasNonChar = true;
		}
		
		if(hasNonChar == true) {
			System.out.println("this is the result that output the nonCharTypes location");
			bw.flush();
			bw.close();
			return;
		}
		System.out.println("there is no nonCharTypes");
	}
	
	void chackBirthDay(LocalDate days) {
		LocalDate now = LocalDate.now();
		System.out.println("to day : " + now);
		System.out.println("birthday : " + days);
		
		long day = ChronoUnit.DAYS.between(days, now);
		System.out.println(day);
	}
}











