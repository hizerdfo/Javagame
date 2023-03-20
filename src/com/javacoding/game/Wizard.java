package com.javacoding.game;

public abstract class Wizard extends Character {
    
    
    //private String name;
    private int hp;
    private int mp;
    
    private Wand wand;
    
    public void heal(Hero hero) {
        int basePoint = 10;
        int recovPoint = (int) (basePoint * this.wand.power);
        hero.setHp(hero.getHp() + recovPoint);
        hero.hp += 10;
        System.out.println(hero.name + "의 HP를 10 회복했다!");
    }
    
    //wand
    public Wand getwand() {
        return wand;
    }
    public void setwand(Wand wand) {
     if (wand == null) {
         throw new IllegalArgumentException("Null");
     }
     this.wand = wand;
    }
    
    //name
//    public String getName() {
//        return name;
//    }
//    public void setName(String name) {
//        if (name == null) {
//            throw new IllegalArgumentException("이름 오류");
//        }
//        if (name.length() <= 3) {
//            throw new IllegalArgumentException("이름 오류");
//        }
//        this.name = name;
//    }
    
   //hp얻기
   public int getHp() {
       return hp;
    }
   public void setHp(int hp) {
       if (hp < 0) {
           hp = 0;
       }
       this.hp = hp;
    }
   
   //mp
   public int getMp() {
       return mp;
    }
   public void setMp(int mp) {
       if (mp < 0) {
           throw new IllegalArgumentException("최소 MP 도달");
       }
       this.mp = mp;
    }
}
