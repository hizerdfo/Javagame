package com.javacoding.game;
import java.util.Random;

public class Cleric {
    // field variable
    // global variable
    // member variable
    // default 값이 NULL
    String name;
    int hp;
    int mp;
    
    static int maxhp = 50;
    static int maxmp = 10;
    
   
    Cleric(String name){
        this(name,maxhp,maxmp);
    }
    Cleric(String name,int hp){
        this(name,hp,maxmp);
    }
    Cleric(String name, int hp, int mp){
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }
    
    void selfAid() {
        System.out.println("셀프 에이드 마법을 사용하였습니다");
        mp = mp - 5;
        hp = maxhp;
    }
    void pray(int t) {
        if(t != 0) {
            if(mp != maxmp) {
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
