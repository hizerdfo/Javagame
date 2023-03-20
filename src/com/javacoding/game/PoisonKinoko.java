package com.javacoding.game;

public class PoisonKinoko extends Kinoko {
    private int attackNumber = 5;
    
    public PoisonKinoko(char suffix) {
        this.suffix = suffix;
    }
    
    @Override
    public void attack(Hero hero) {
        // TODO Auto-generated method stub
        super.attack(hero);
        if(attackNumber != 0) {
            System.out.println("추가로, 독 포자를 살포했다!");
            hero.setHp(hero.getHp() - hero.getHp() / 5);
            System.out.println(hero.getHp() / 5 + "포인트의 데미지");
            attackNumber--;
        }
        
    }
}
