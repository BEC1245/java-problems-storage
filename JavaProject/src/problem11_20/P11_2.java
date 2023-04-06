package problem11_20;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class P11_2 {

	public static void main(String[] args) {
		FootballPlayer fp = new FootballPlayer("이름", 31, "red", 12);
		FootballPlayer fp2 = new FootballPlayer("이름", 36, "red", 12);
		FootballPlayer fp3 = new FootballPlayer("이름2", 32, "blue", 13);
		FootballPlayer fp4 = new FootballPlayer("이름3", 34, "green", 14);

        HashSet<FootballPlayer> fbp = new HashSet<>();
        fbp.add(fp);
        fbp.add(fp2);
        fbp.add(fp3);
        fbp.add(fp4);

        fbp.stream().forEach(System.out::println);

        TreeSet<FootballPlayer> fbp2 = new TreeSet<>();
        fbp2.add(fp);
        fbp2.add(fp2);
        fbp2.add(fp3);
        fbp2.add(fp4);

        fbp2.stream().forEach(System.out::println);

        HashMap<Integer, FootballPlayer> fbp3 = new HashMap<>();
        fbp3.put(fp.getNumber(), fp);
        fbp3.put(fp2.getNumber(), fp2);
        fbp3.put(fp3.getNumber(), fp3);
        fbp3.put(fp4.getNumber(), fp4);
	}
}

class FootballPlayer implements Comparable<FootballPlayer> {
    private String name;
    private Integer number;
    private String team;
    private Integer age;

    public FootballPlayer(String name, int number, String team, int age) {
        this.name = name;
        this.number = number;
        this.team = team;
        this.age = age;
    }

    @Override
    public String toString() {
        return "FootballPlayer [name=" + name + ", number=" + number + ", team=" + team + ", age=" + age + "]";
    }

/*
    hashset의 검색 기준을 사용하려면
    hashCode를 사용해야하는 건 알고 있을 것이다

    아래의 코드는 그 식별의 예시로

    만약 “이름”과 “이름”을 넣으면
    heshcode는 여기서 끝 문자의 유니코드 값을 반환하고 -> 름의 유니코드 (47492)

    "모든" 저장된 데이터중 name의 끝 유니코드 값이 같으면 equals가 실행되는 형식이다 -> 0 이"름" == 이"름" / X 이"름" == 이"ㄹ"
    그럼 “이름.equals(o.getName)”을 자동적으로 사용하게 되고 이 둘은 똑같기에

    true를 반환 / set는 같은 데이터를 저장 안 하기 때문에 add 메소드를 취소하는
    순으로 돌아간다.
 */

    @Override
    public int hashCode() {
    	return name.charAt((name.length() - 1));
    }
    
/* set은 같은 데이터는 저장을 안하기 때문에
 * equals가 true일 경우 저장이 안된다
 * 
 * 아래의 코드는 chack 이 만약 null이 아니고 FootballPlayer의 인스턴스이며
 * 3개의 갑중 하나라도 다르다면 false로 돌아가 저장이 되는 형식이다
 */

    @Override
    public boolean equals(Object obj) {
    	boolean chack = true;
    	if(obj != null && obj instanceof FootballPlayer) {
    		FootballPlayer fbp = (FootballPlayer)obj;
    		if(!(name.equals(fbp.getName()) && team.equals(fbp.getTeam()) && age.equals(fbp.getAge()))){
    			chack = false; 
    		}
    	}
    	
    	return chack;
    }

/* 아래의 코드는 저장된 모든 데이터를 대상으로 하기에
 * 데이터를 비교하면서 만약 if안의 코드의 값이 true이고
 * 똑같은 선상의 데이터이기 때문에 바로 리턴을 해 주면 된다 
 */

    @Override
    public int compareTo(FootballPlayer o){
        if(!team.equals(o.getTeam())){
            return team.compareTo(o.getTeam());
        }

        if(!name.equals(o.getName())){
            return name.compareTo(o.getName());
        }

        return number.compareTo(o.number);
    }

        /* getter setter */

    public String getName() {
        return name;
    }

    public Integer getNumber() {
        return number;
    }

    public String getTeam() {
        return team;
    }

    public Integer getAge() {
        return age;
    }
}
