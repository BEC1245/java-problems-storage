

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

    @Override
    public int hashCode() {
    	return name.charAt((name.length() - 1));
    }
    
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
