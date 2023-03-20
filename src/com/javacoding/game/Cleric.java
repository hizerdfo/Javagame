package com.javacoding.game;
import java.util.Random;

public class Cleric {
    // field variable
    // global variable
    // member variable
    // default 값이 NULL
    private String name;
    private int hp;
    private int mp;
    
    public static int MAXHP = 50;
    public static int MAXMP = 10;
    
   
    Cleric(String name){
        this(name, MAXHP, MAXMP);
    }
    Cleric(String name,int hp){
        this(name, hp, Cleric.MAXMP);
    }
    
    
    public String getname() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    Cleric(String name, int hp, int mp){
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }
    
    void selfAid() {
        System.out.println("셀프 에이드 마법을 사용하였습니다");
        mp = mp - 5;
        hp = MAXHP;
    }
    void pray(int t) {
        if(t != 0) {
            if(mp != MAXMP) {
                int time = (new Random().nextInt(2)) + t;
                mp = mp + time;
            } else {
                System.out.println("maxMP입니다.");
            }
        } else {
            System.out.println("회복 실패");
        }
    }
}
