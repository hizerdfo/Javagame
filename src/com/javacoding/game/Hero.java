package com.javacoding.game;

public class Hero {
    // field variable
    // global variable
    // member variable
    //default 값이 NULL
    String name;
    int hp = 100;
    static int money;
    
    static void setRandomMoney() {
        Hero.money = (int) (Math.random() * 1000);
    }
    //기본 생성자 primary constructor
    Hero(String name, int hp){
        this.hp = 100;
        this.name = "noname"; //this로 가르킴
    }
    Hero(String name){
        this.name = name;
        this.hp = 100;
    }
    Hero(int hp){
        this.name = "noname";
        this.hp = hp;
    }
    Hero(){
        this.name = "noname";
        this.hp = 100;
    }
    Sword sword;
    //2개 칼 차기 
    //Sword sword2;
    void attack() {}
    void run() {}
    void sit(int sec) {}
    void slip() {}
    void sleep() {
        this.hp = 100; //this 있어도 되고 없어도 됨
        System.out.println(this.name + "는 잠을 자고 회복했다!"); //this 있어도 되고 없어도 됨
    }
}
