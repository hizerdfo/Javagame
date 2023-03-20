package com.javacoding.game;

public class Student implements Comparable<Student>{
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    //Ctrl + 1
    //String에 이미 compare 정의. name - string - compare 확인 후 return변경
    public int compareTo(Student o) {
        // TODO Auto-generated method stub
        
        //return (id < o.id)? -1 : ((id == o.id)? 0 : 1);\
        return this.name.compareTo(o.name);
        //뒤집으려면
        //return - this.name.compareTo(o.name);
    }
    
}
