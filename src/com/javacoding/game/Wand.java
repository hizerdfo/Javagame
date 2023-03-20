package com.javacoding.game;

public class Wand {
    private String name;
    public double power;
    
    //name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("이름 오류(null값)");
        }
        if (name.length() <= 3) {
            throw new IllegalArgumentException("이름 오류(3글자 이상)");
        }
        this.name = name;
    }
    //power
    public double getPower() {
        return power;
    }
    public void setPower(double power) {
        if (power < 0.5 || power > 100) {
            throw new IllegalArgumentException("마력 오류(지팡이)");
        }
        
        this.power = power;
    }
}
