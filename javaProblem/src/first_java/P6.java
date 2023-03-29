package first_java;

public class P6 {
	public static void main(String[] args) {		
		/* mulitdimesionArray in reference type */
				
		// the length of score array and name array has to be same
		String name[] = {"a", "b", "c", "d", "e", "f", "g"};
		int all[] = {1,2,3,4,5,6,7};
		int Score[][] = new int[3][];
		
		for(int i = 0; i < Score.length; i++) {
			Score[i] = all;
		}
		
		student st = new student(Score, name);
		for(int i = 0; i < 7; i++) {
			System.out.println(st.all(i) + " / " + st.average(i));
		}
	}
}


/* class part */

class student {
	private static int allScore[];
	private int Score[][] = new int[3][];
	private String name[];
	
	student(int Score[][], String name[]) {
		this.Score = Score;
		this.name = name;
		
		allScore = new int[Score[0].length];
		for(int i = 0; i < Score[0].length; i++) {
			addall(i, this.Score);
		}
	}
	
	double average(int cursor) {
		return (double)allScore[cursor] / Score.length;
	}
	
	int all(int cursor) {
		return allScore[cursor];
	}
	
	void printinfo(int cursor) {
		System.out.println(name[cursor] + " / " + Score[0][cursor] + " / " + Score[1][cursor] + " / " + Score[2][cursor]);
	}
	
	private static void addall(int cursor, int array[][]) {
		int all = 0;		
		for(int i = 0; i < array.length; i++) {
			all += array[i][cursor];
		}
		
		System.out.println(all);
		allScore[cursor] = all;
	}

	
	/* getter setter */
	
	public int[][] getScore() {
		return Score;
	}

	public void setScore(int[][] score) {
		Score = score;
	}

	public String[] getName() {
		return name;
	}

	public void setName(String[] name) {
		this.name = name;
	}
	
	
}
