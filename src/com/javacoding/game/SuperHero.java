package com.javacoding.game;

public class SuperHero extends Hero {
    
    private boolean flying; //필드 추가
    
    public SuperHero() {
        System.out.println("SuperHero 생성자");
    }
    // 추가한 메소드
    public void fly() {
        setFlying(true);
        System.out.println("날았다!");
    }
    //추가한 메소드 
    public void land() {
        setFlying(false);
        System.out.println("착지했다!");
    }
    
    @Override
    public void attack(Kinoko enemy) {
        
        System.out.println("준비운동");
        // TODO Auto-generated method stub
        super.attack(enemy);
    }
    
    @Override
    public void run() {
        // TODO Auto-generated method stub
        super.run();
    }
    public boolean isFlying() {
        return flying;
    }
    public void setFlying(boolean flying) {
        this.flying = flying;
    }
    
}
