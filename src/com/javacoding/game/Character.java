package com.javacoding.game;

public abstract class Character implements Life{
    private String name;
    private int hp;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
            
    public Character(String name) {
        this.name = name;
        setHp(100);
    }
    
    public abstract void attack(Kinoko kinoko);
   
    public void run() {
        System.out.println(name + "은 도망쳤다.");
    }
    
    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
}
