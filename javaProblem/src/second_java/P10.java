package second_java;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class P10 {

	public static void main(String[] args) {
		AllProblem ap = new AllProblem();
		ap.isCorrect();
	}

}

class AllProblem {
	void isCorrect() {
		Scanner sc = new Scanner(System.in);
		
		try {
			String id = sc.nextLine();
			WorngInputException ex = new WorngInputException("WorngInputException in try catch 21");
			EmptyArrayException ex2 = new EmptyArrayException("EmptyArrayException in try catch 22");
			
			if(id.trim().isEmpty()) {
				throw ex2;
			}

			for(char a : id.toCharArray()) {
				if(!((a >= 'a' && a <= 'z') || (a >= 'A' && a <= 'Z'))) {
					throw ex;
				}
			}
			
			System.out.println("환영함다");
		} 
		catch (WorngInputException e) {
			System.out.println("오타 났다 함다");
			e.printStackTrace();
		}
		catch (EmptyArrayException e) {
			System.out.println("엔터 잘 못 눌렀다 함다");
			e.printStackTrace();
		}
		catch (NoSuchElementException e) {
			System.out.println("입력을 찾는 알고리즘이 해당 입력이 없다고 함다");
			e.printStackTrace();
		}
		catch (IllegalStateException e) {
			System.out.println("스캐너가 장사를 접어다 함다");
			e.printStackTrace();
		}		
		catch (Exception e) {
			System.out.println("프로그래머도 예상 못한 예외가 발생했다고 함다");
			e.printStackTrace();
		}
	}
	
	
	void InpBirthDay() {
		Scanner sc = new Scanner(System.in);
		
		try {
			int birthDay = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("your input is outOfRange or not IntType");
			e.printStackTrace();
		}
		catch (NoSuchElementException e) {
			System.out.println("no input in this line");
			e.printStackTrace();
		}
		catch (IllegalStateException e) {
			System.out.println("the Scanner is closed now");
			e.printStackTrace();
		}
	}
}

class WorngInputException extends Exception {
	public WorngInputException(String message) {
		super(message);
	}
}

class EmptyArrayException extends Exception {
	public EmptyArrayException(String message) {
		super(message);
	}
}
