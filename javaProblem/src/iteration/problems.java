package iteration;

public class problems {
	public static void main(String[] args) {
		ContinueBasic ir = new ContinueBasic();
		ir.missProblem();
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
		
		switch(num / 100) {
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
	
	// problem 7
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
	
	// problem 8
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
	
	// problem 9
	void problem6() {
		int multiply = 1;
		for(int i = 1; i <= 10; i++) {
			multiply *= i;
		}
		System.out.println(multiply);
	}
	
	// problem 10
	void problem7() {
		for(int i = 0, j = 5; i < 9; i++, j += 5) {
			System.out.println(j);
		}
	}
}

class ContinueBasic {
	
	// problem 11
	void problem() {
        int count=0;
        for(int num = 1; num < 100; ++num){
            if(num%5!=0 || num%7!=0)
            continue;
            count++;
            System.out.println(num);
        }
        System.out.println("count: " + count);
	}
	
	// problem 12
	void problem2() {
		int num = 0, count = 0;
		while(true) {
			count++;
			if(count % 3 == 0 || count % 2 == 1) {
				num += count;
				if(num > 1000) {
					System.out.println(count + " / " + num);
					return;
				}
			}
		}
	}

	//problem 13
	void missProblem(){
		for(int i = 2; i != 16; i *= 2){
			for(int j = 1; j <= 9; j++){
				if(i % 2 == 0 && i != 6 && i == j){
					System.out.println(i + " * " + j + " = " + (i * j));
					break;
				}
				System.out.println(i + " * " + j + " = " + (i * j));
			}
		}
	}

	// problem 14
	void problem3() {
		for(int i = 10; i <= 90; i += 10) {
			for(int j = 10; j <= 90; j += 10) {
				if((i + i / 10) + (j + j / 10) == 99) {
					System.out.print(i + " | " + j + "\n");
				}
			}
		}
	}
	
	// problem 15
	void problem4() {
		int n = 4;
		if(n > 3) {
			System.out.println("현재 많은 사람이 있습니다");
		}
		else {
			System.out.printf("현제 인원은 %d명 입니다 \n", n);
		}
		
		switch(n) {
			case 3, 2, 1 : System.out.printf("현제 인원은 %d명 입니다 \n", n); break;
			default : System.out.println("현재 많은 사람이 있습니다 \n"); break;
		}
	}
	
	// problem 16
	void problem5() {
		int num = 1, output = 0;
		while(num <= 99) {
			output += num++;
		}
		System.out.printf("process in while output = %d \n", output);
		
		output = 0;
		for(int i = 1; i <= 99; i++) {
			output += i;
		}
		System.out.printf("process in for output = %d \n", output);
		
		num = output = 0;
		do {
			output += num++;
		}
		while(num <= 99);
		System.out.printf("process in do-while output = %d \n", output);
	}
}
	
