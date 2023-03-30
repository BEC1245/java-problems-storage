package first_java;

public class P7 {
	public static void main(String[] args) {
		Male ml = new Male("변의찬", "191120-000000", "69", false);
		Female fml = new Female("수지", "200520-000000", "96", null);
		
		ml.print();		
		ml.chackDiv();
		fml.print();
		fml.chackLocation();
	}
}

class person {
	String name;
	String residentNumber;
	final String birthday;
	
	public person(String name, String residentNumber, String birthday) {
		super();
		this.name = name;
		this.residentNumber = residentNumber;
		this.birthday = birthday;
	}

	void print() {
		System.out.printf("안녕하세요. 저는 %s입니다. %s살 입니다", name, birthday);
	}
}

class Male extends person {
	boolean isDeveloper;
	
	public Male(String name, String residentNumber, String birthday, boolean isDeveloper) {
		super(name, residentNumber, birthday);
		this.isDeveloper = isDeveloper;
	}

	@Override 
	void print() {
		System.out.printf("안녕하세요. 저는 %s입니다. %s살이며 남자 입니다 \n", name, birthday);
	}
	
	void chackDiv() {
		if(isDeveloper) {
			System.out.println("그리고 그는 IT쪽 개발자이기도 합니다 \n");
		}
		else {
			System.out.println("그리고 그는 IT분야에 관심 있어 합니다 \n");
		}
	}
	
}

class Female extends person {
	String HouseLocation;
	
	public Female(String name, String residentNumber, String birthday, String houseLocation) {
		super(name, residentNumber, birthday);
		HouseLocation = houseLocation;
	}

	@Override 
	void print() {
		System.out.printf("안녕하세요. 저는 %s입니다. %s살이며 여자 입니다 \n", name, birthday);
	}
	
	void chackLocation() {
		if(HouseLocation != null) {
			System.out.printf("그리고 그녀는 %s위치에 거주하고 있습니다 \n", HouseLocation);
		}
		else {
			System.out.println("아쉽게도 위치에 대한 정보는 포함 되여있지 않네요 \n");
		}
	}
	
}
