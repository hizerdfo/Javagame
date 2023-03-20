package com.javacoding.game;

public class Kinoko {
    private final int LEVEL = 10;
    
    private int hp = 50;
    protected char suffix;
    
    public Kinoko(char suffix) {
        this.suffix = suffix;
    }
    
    public void attack(Hero hero) {
        System.out.println("키노코" + this.suffix + " 의 공격");
        System.out.println("10의 데미지");
        hero.setHp(hero.getHp() - 10);
    }
    public Kinoko(){
        
    }
    public Kinoko(int hp){
        this.setHp(hp);
    }
    public void run() {
        System.out.println("괴물 버섯 " + this.suffix + "는 도망갔다!");
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
