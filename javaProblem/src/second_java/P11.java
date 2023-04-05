package second_java;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Stack;

public class P11 {
    public static void main(String[] args) throws Exception {
        FootballPlayer fbp = new FootballPlayer("player", 3, "P.O.W.E.R", 69);
        Func func = new Func();
        func.chack(fbp);
        func.print(0);
        func.save(fbp, 0);

        FootballPlayer fbp2 = new FootballPlayer("player", 3, "P.O.W.E.R", 69);
        func.chack(fbp2);
    }
}

class FootballPlayer {
    String name;
    int number;
    String team;
    int age;

    public FootballPlayer(String name, int number, String team, int age) {
        this.name = name;
        this.number = number;
        this.team = team;
        this.age = age;
    }

    String chacking(){
        return name + team + age;
    }

        /* getter setter */

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public String getTeam() {
        return team;
    }

    public int getAge() {
        return age;
    }
}

class Func {
    Stack<FootballPlayer> FBP = new Stack<>(); // nomal save
    LinkedList<FootballPlayer> CHFBP = new LinkedList<>(); // chack overlap
    HashMap<Integer, FootballPlayer> THFBP = new HashMap<>(); // save info through
    ArrayList<ArrayList<Object>> STFBP = new ArrayList<>(); // sort

    Func(){
        for(int i = 0; i < 4; i++){
            STFBP.add(new ArrayList<>());
        }
    }

    void save(FootballPlayer inp, int cursor){
        FBP.set(cursor, inp);
    }

    void print(int cursor) throws Exception {
        if(cursor >= FBP.size()){
            throw new Exception("error oqurd");
        }

        FootballPlayer fbp = FBP.get(cursor);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(fbp.getAge() + " " + fbp.getNumber() + " " + fbp.getTeam() + " " + fbp.getName());
    }

    void chack(FootballPlayer fpb){
        for(var a : CHFBP){
            String inp[] = {a.chacking(), fpb.chacking()};
            if(inp[0].equals(inp[1])){
                System.out.println("this player is already seved");
                return;
            }
        }
        
        System.out.println("wealcom!");
        FBP.add(fpb);
        CHFBP.add(fpb);
        THFBP.put(fpb.getNumber(), fpb);
        sorting(fpb);
    }

    void sorting(FootballPlayer fpb){
        for(int i = 0; i < 4; i++){
            switch (i) {
                case 0: STFBP.get(i).add(fpb.getTeam()); break;
                case 1: STFBP.get(i).add(fpb.getName()); break;
                case 2: STFBP.get(i).add(fpb.getNumber()); break;
                case 3: STFBP.get(i).add(fpb.getAge()); break;
            }
        }
    }   
}


