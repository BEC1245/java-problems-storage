package first_java;

public class P6 {
	public static void main(String[] args) {		
		int allScore[] = {1,2,3,4,5,6,7,8,9,10,12,16,28};
		int otherScore[] = {10,10,10,10,10,10,10};
		student st = new student(allScore, allScore, allScore);
		
		System.out.println(st.average(0) + " / " + st.average(1));
		System.out.println(st.all(0) + " / " + st.all(1));
		
		st.setLanguageScore(otherScore);
		
		System.out.println(st.all(2) + " / " + st.average(2)); // print all and average in otherScore
		System.out.println(st.all(3) + " / " + st.average(3)); // cursors limit <= 2 causing error
		
		/* 2d array part */
		
		int newArray[][] =  {
				{1,2,3},
				{12,34,56},
				{123,456,789}
		};
		
		inMulitdimansionArray imsa = new inMulitdimansionArray(newArray);
		for(int i = 0; i < 3; i++) {
			System.out.println(imsa.all(i) + " / " + imsa.average(i));
		}		
	}
}


/* class part */


class student {
	private static int testStudent[] = new int[3];
	private static int allScore[] = new int[3];
	private int mathScore[];
	private int scienseScore[];
	private int languageScore[];
		
	public student(int[] mathScore, int[] scienseScore, int[] languageScore) {
		super();
		this.mathScore = mathScore;
		this.scienseScore = scienseScore;
		this.languageScore = languageScore;
		
		addall(0, this.mathScore);
		testStudent[0] = mathScore.length;
		
		addall(1, this.scienseScore);
		testStudent[1] = scienseScore.length;
		
		addall(2, this.languageScore);
		testStudent[2] = languageScore.length;
	}


	public void setMathScore(int[] mathScore) {
		this.mathScore = mathScore;
		addall(0, this.mathScore);
		testStudent[0] = mathScore.length;
	}
	
	public void setScienseScore(int[] scienseScore) {
		this.scienseScore = scienseScore;
		addall(1, this.scienseScore);
		testStudent[1] = scienseScore.length;
	}
	
	public void setLanguageScore(int[] languageScore) {
		this.languageScore = languageScore;
		addall(2, this.languageScore);
		testStudent[2] = languageScore.length;
	}

	public int[] getMathScore() {
		return mathScore;
	}

	public int[] getScienseScore() {
		return scienseScore;
	}

	public int[] getLanguageScore() {
		return languageScore;
	}
	
	double average(int cursor) {
		if(cursor > 2) {
			System.out.println("this is not correct input");
			return 0;
		}
		return (double)allScore[cursor] / testStudent[cursor];
	}
	
	int all(int cursor) {
		if(cursor > 2) {
			System.out.println("this is not correct input");
			return 0;
		}
		return allScore[cursor];
	}
	
	private static void addall(int cursor, int array[]) {
		int all = 0;
		for(var a : array) {
			all += a;
		}
		
		allScore[cursor] = all;
	}
}



class inMulitdimansionArray {
	private static int testStudent[] = new int[3];
	private static int allScore[] = new int[3];
	private int score[][] = new int[3][];
	
	inMulitdimansionArray(int score[][]) {
		this.score = score;
		for(int i = 0; i < 3; i++) {
			addall(i, this.score);
			testStudent[i] = score[i].length;
		}
	}
	
	public int[][] getScore() {
		return score;
	}

	public void setScore(int[][] score, int cursor) {
		this.score = score;
		addall(cursor, this.score);
		testStudent[cursor] = score[cursor].length;
	}

	double average(int cursor) {
		if(cursor > 2) {
			System.out.println("this is not correct input");
		}
		return (double)allScore[cursor] / testStudent[cursor];
	}
	
	int all(int cursor) {
		if(cursor > 2) {
			System.out.println("this is not correct input");
		}
		return allScore[cursor];
	}
	
	private static void addall(int cursor, int array[][]) {
		int all = 0;
		for(int i = 0; i < array[cursor].length; i++) {
			all += array[cursor][i];
		}
		
		allScore[cursor] = all;
	}
}
