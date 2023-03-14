package com.javacoding.game;

public class Kinoko {
    int hp;
    final int LEVEL = 10;
    char suffix; //구분을 위하여 사용한다.
    Kinoko(){
        
    }
    Kinoko(int hp){
        this.hp = hp;
    }
    void attack() {}
    void run() {
        System.out.println("괴물 버섯 " + this.suffix + "는 도망갔다!");
    }
}
