package com.javacoding.logics;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Main {

    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        
        System.out.print("파일 이름:");
        String name = sc.next();
        String copyName = "copy.text";
        
        copy(name,copyName);
        compress(name,copyName);
       
    }
    
    public static void compress(String name,String copyName) throws IOException {
        File file1 = new File(name);
        File file2 = new File(copyName);
        
        List<File> files = new ArrayList<>();
        
        files.add(file1);
        files.add(file2);
        
        File zipFile = new File("압축파일.zip");
        byte[] buf = new byte[4096];
        
        try(ZipOutputStream out = new ZipOutputStream(new FileOutputStream(zipFile))) {
            for(File file : files) {
                try(FileInputStream in = new FileInputStream(file)){
                    ZipEntry zip = new ZipEntry(file.getName());
                    out.putNextEntry(zip);
                    
                    int len;
                    while((len = in.read(buf)) > 0) {
                        out.write(buf, 0, len);
                    }
                    out.closeEntry();
                }
            }
        }
        System.out.println("Zip complete");
    }
    public static void copy(String name, String copyName) throws IOException{
        
        FileOutputStream fos = new FileOutputStream(name,true);
        FileOutputStream fos2 = new FileOutputStream(copyName,true);
        
        FileInputStream fis = new FileInputStream(name);
        String text = "Hello My name is hayoung";
        
        fos.write(text.getBytes());
        fos.flush();
        fos.close();
           try {
               int i = 0;
               while((i = fis.read()) != -1) {
                   System.out.print((char)i);
                   fos2.write((char)i);
               }
               fis.close();
               fos2.close();
           } catch (Exception e) {
               System.out.println(e);
       }
        
    }
    
    
    public static void FileOutputStream(String text) throws IOException{
        FileOutputStream fos = new FileOutputStream("hello.txt",true);
        fos.write(text.getBytes());
        fos.flush();
        fos.close();
    }
    public static void FileReader() throws IOException{
        FileReader fr = new FileReader("data.txt");
        
        int i = fr.read();
        while(i != -1) {
            char ch = (char) i;
            System.out.println(ch);
            i = fr.read();
        }
        fr.close();
    }
    public static void fileWriteCode() throws IOException {
        FileWriter fw = new FileWriter("data.txt",true);
        fw.write("Hello world");
        fw.flush(); //실제로 쓰기
        fw.close();
    }
}
