package com.javacoding.logics;

public class Word {
    private String letters;
    public Word(String letters) {
        this.letters = letters;
    }
    
    public boolean isVowel(int i) {
        
        return letters.substring(i,i+1).equalsIgnoreCase("A") ||
               letters.substring(i,i+1).equalsIgnoreCase("E") ||
               letters.substring(i,i+1).equalsIgnoreCase("i") ||
               letters.substring(i,i+1).equalsIgnoreCase("O") ||
               letters.substring(i,i+1).equalsIgnoreCase("U") ;
    }
    
    public boolean isConsonant(int i) {
       
        return !isVowel(i);
    }
}
