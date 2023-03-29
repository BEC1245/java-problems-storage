package first_java;

public class P6 {
	public static void main(String[] args) {		
		/* mulitdimesionArray in reference type */
				
		// the length of score array and name array has to be same
		int mulitple[] = {1,2,3,4,5,6,7};
		String mulitple2[] = {"a","b","c","d","e","f","g"};
		student st = new student(mulitple2, mulitple, mulitple, mulitple);
		
		for(int i = 0; i < mulitple.length; i++) {
			st.printinfo(i);
		}
		System.out.println(st.all(0) + " / " + st.average(0));
	}
}


/* class part */


class student {
	private static int testStudent[] = new int[3];
	private static int allScore[] = new int[3];
	private int mathScore[];
	private int scienseScore[];
	private int languageScore[];
	private String stName[];
		
	public student(String stName[], int[] mathScore, int[] scienseScore, int[] languageScore) {
		super();
		this.mathScore = mathScore;
		this.scienseScore = scienseScore;
		this.languageScore = languageScore;
		this.stName = stName;
		
		addall(0, this.mathScore);
		testStudent[0] = mathScore.length;
		
		addall(1, this.scienseScore);
		testStudent[1] = scienseScore.length;
		
		addall(2, this.languageScore);
		testStudent[2] = languageScore.length;
	}

	public void setStName(String[] stName) {
		this.stName = stName;
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
	
	public String[] getStName() {
		return stName;
	}

	double average(int cursor) {
		return (double)allScore[cursor] / testStudent[cursor];
	}
	
	int all(int cursor) {
		return allScore[cursor];
	}
	
	void printinfo(int cursor) {
		System.out.println(stName[cursor] + " / " + mathScore[cursor] + " / " + scienseScore[cursor] + " / " + languageScore[cursor]);
	}
	
	private static void addall(int cursor, int array[]) {
		int all = 0;
		for(var a : array) {
			all += a;
		}
		
		allScore[cursor] = all;
	}
}