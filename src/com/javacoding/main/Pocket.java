package com.javacoding.main;

public class Pocket<T> {
      

    public static void main(String[] args) {
        Pocket<String> pocket = new Pocket<String>();
        pocket.setData("김하영");
        
    }
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
    
    

}
