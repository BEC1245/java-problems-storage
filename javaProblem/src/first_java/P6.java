package first_java;

public class P6 {
	public static void main(String[] args) {		
		/* mulitdimesionArray in reference type */
		
		int mulitple[] = {1,2,3,4,5,6,7};
		
		student[] array = new student[10];
		for(student inp : array) {
			inp = new student(mulitple, mulitple, mulitple);
			System.out.println(inp.all(0) + " / " + inp.average(0));
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
