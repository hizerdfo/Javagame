package com.javacoding.question;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Reader;
import java.util.Properties;

public class Main {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        //android.useAndroidX
        /*
        Reader fr = new FileReader("gradle.properties");
        Properties prop = new Properties();
        prop.load(fr);
        String name = prop.getProperty("android.useAndroidX");
        System.out.println(name);*/
        Employee employee = new Employee("홍길동", 41);
        
        FileOutputStream fos = new FileOutputStream("save.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(employee);
        oos.flush();
        oos.close();
        
    }

}
