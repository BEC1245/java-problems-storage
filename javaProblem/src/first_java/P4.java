package first_java;

import java.util.Scanner;

public class P4 {
	public static void main(String[] args) {
		Member m = new Member();
		Scanner in = new Scanner(System.in);
		m.medicalExamination(2001);
	}
}

class Member {
	
	void canHaveFluVaccine(int getyear) {
		int year = 2023 - getyear - 1;
		if(year < 13 || 65 >= year) {
			System.out.println("무료예방접종이 가능합니다");
		}
		else {
			System.out.println("무료접종 대상이 아닙니다");
		}
	}
	
	void medicalExamination(int getyear) {
		int year = 2023 - getyear - 1;
		if(year >= 20 && ((getyear+2023) % 2 == 0)) {
			System.out.println("짝수 해에 태어난 사람은 올해가 짝수년이라면 검사 대상이 됩니다");
			System.out.println("대한민국 성인( 20세 )의 경우 무료로 2년마다 건강검진을 받을 수 있습니다");
			if(year >= 40) {
				System.out.println("40이상의 경우는 암 검사도 무료로 검사를 할 수 있습니다");
			}
		} else {
			System.out.println("올해는 무료 검진대상자가 아뉩니다");
		}
	}
}
