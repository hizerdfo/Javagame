package com.javacoding.game;

public class Hero {
    // field variable
    // global variable
    // member variable
    // default 값이 NULL
    String name;
    int hp = 100;
    static int money;
    
    //기본 생성자 primary constructor
    public Hero(String name, int hp){
        this.hp = 100;
        this.name = "noname"; //this로 가르킴
    }
    public Hero(String name){
        this.name = name;
        this.hp = 100;
    }
    public Hero(int hp){
        this.name = "noname";
        this.hp = hp;
    }
    public Hero(){
        this.name = "noname";
        this.hp = 100;
    }
    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    
    Sword sword;
    //2개 칼 차기 
    //Sword sword2;
    //싸우기
    public void attack(Kinoko enemy) {
        System.out.println(this.name + "의 공격!");
        this.hp -= 5;
        System.out.println("5포인트의 데미지를 주었다!");
    }
    //도망
    public void run() {
        System.out.println(this.name + " 는 도망쳤다!");
    }
    static void setRandomMoney() {
        Hero.money = (int) (Math.random() * 1000);
    }
    public void sit(int sec) {}
    public void slip() {}
    public void sleep() {
        this.hp = 100; //this 있어도 되고 없어도 됨
        System.out.println(this.name + "는 잠을 자고 회복했다!"); //this 있어도 되고 없어도 됨
    }
    
}
