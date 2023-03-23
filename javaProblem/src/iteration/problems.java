package iteration;

public class problems {
	public static void main(String[] args) {
		IfReit ir = new IfReit();
		ir.problem7();
	}
}

class IfReit {
	
	//problem 1 & 2 
	void problem() {
        int num=300;
        if(num>0 && (num%2)==0) {
        	System.out.println("양수이면서 짝수");
        }
        
        int sideOf = (int)((num / 100) * 100);
        if(sideOf >= 3) {
            System.out.println(300 + "이상");
            return;
        }
        System.out.println(sideOf + "이상 " + (sideOf + 100) + "미만");
	}
	
	//problem 5 
	void problem2() {
		int num=300;
		if(num < 100) {
			System.out.println("0이상 100이하");
			return;
		}
		
		switch((int)(num / 100) * 100) {
			case 1 : System.out.println("100이상 200이하"); break;
			case 2 : System.out.println("200이상 300이하"); break;
			default : System.out.println("300이상"); break;
		}
	}
	
	//problem 6
	void problem3() {
		int num = 0, plus = 1;
		while(plus < 100) {
			System.out.println(num + " / " + plus);
			num += plus++;
		}
		
		System.out.println(num);
	}
	
	void problem4() {
		int num = 0;
		while(num < 100) {
			System.out.println(++num);
		}
		
		do {
			System.out.println(num--);
		}
		while(num > 0);
	}
	
	void problem5() {
		int num = 1, result = 0;
		
		while(num <= 1000) {
			if(num % 2 == 0 || num % 7 == 0) {
				result += num;
				System.out.println(num);
			}
			++num;
		}
		System.out.println(result);
	}
	
	void problem6() {
		int multiply = 1;
		for(int i = 1; i <= 10; i++) {
			multiply *= i;
		}
		System.out.println(multiply);
	}
	
	void problem7() {
		for(int i = 0, j = 5; i < 9; i++, j += 5) {
			System.out.println(j);
		}
	}
}


class CondOp {
	
	// problem 3
	void problem() {
        int num1=50, num2=100;
        int big, diff;
        if(num1>num2) { big = num1; }
        else { big = num2; }
        System.out.println(big);
        
        
        if(num1>num2) { diff = num1-num2; }
        else { diff = num2-num1; }
        System.out.println(diff);
	}
	
	// problem 4
	void problem2() {
        int n=3;        
        if(n == 1) { System.out.println("Simple Java"); }
        else if(n == 2) { System.out.println("Funny Java"); }
        else if(n == 3) { System.out.println("Fantastic Java"); }
        else { System.out.println("The best programming language"); }
        System.out.println("Do you like coffee?");
	}
}