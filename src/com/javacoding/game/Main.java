package com.javacoding.game;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    int num = 10;
    public static void solution() {
}
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        //용사 생성
//        Hero hero = new Hero(); //같은 패키지므로 import 필요하지 않음, 보통 소문자로 정의하는 편
//        //생성된 용사에게 최초의 HP와 이름 설정
//        hero.name = "준석";
//        hero.hp = 100;
//        System.out.println("용사 " + hero.name + "를 생성했습니다!");
//        //용사에게 5초 앉기, 넘어지기, 25초 앉기, 도망을 지시
//        hero.sit(5);
//        hero.slip();
//        hero.sit(25);
//        hero.run();
//        
//        //버섯 등장
//        Kinoko kinoko1 = new Kinoko();
//        kinoko1.hp = 50;
//        kinoko1.suffix = 'A';
//        
//        Kinoko kinoko2 = new Kinoko();
//        kinoko2.hp = 50;
//        kinoko2.suffix = 'A';
//        
//        // 성직자
//        Cleric cleric1 = new Cleric();
//        cleric1.hp = 30;
//        cleric1.mp = 10;
//        
//        //selfAid
//        cleric1.selfAid();
//        System.out.println("몇 초 기도하시겠습니까? :");
//        
//        int time = sc.nextInt();
//        cleric1.pray(time);
//        Hero hero = new Hero ();

        
        Sword sword = new Sword();
        sword.name = "불의 검";
        sword.damage = 10;
        
        Hero hero1 = new Hero();
        hero1.name = "김영웅";
        hero1.hp = 100;
        hero1.sword = sword;
        
        Hero hero2 = new Hero();
        hero2.name = "스랄";
        hero2.hp = 10;
        
        Wizard wizard = new Wizard();
        wizard.name = "제이나";
        wizard.hp = 50;
        
        wizard.heal(hero1);
        wizard.heal(hero2);
        wizard.heal(hero2);
        
       Hero.money = 100;
       Hero.money = 50;
       
        System.out.println("현재의 무기는" + hero1.sword.name);
        
//        System.out.println(hero1.money);
//        System.out.println(hero1.money);
        
//        Person person = new Person();
//        person.name = "홍길동";
//
//        List<Person> personList = new ArrayList<>();
//        personList.add(person);
//        person.name = "한석봉";
//
//        System.out.println(personList.get(0).name);
    
    }
  
}
