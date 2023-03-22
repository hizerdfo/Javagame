package class0322;

import java.util.Scanner;

//1. run() 쓴 후 코드 입력
class PrintingThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
class PrintingProcess implements Runnable{
    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
public class ThreadMain {
    public static void main(String[] args) {
        System.out.println("아무거나 입력");
        Scanner sc = new Scanner(System.in);
        System.out.println(Thread.currentThread().getName());
        Thread thread = new Thread(new PrintingProcess());
        
        new Thread(() -> {
            for (int i =0; i<3; i++) {
                try {
                    Thread.sleep(50);
                    System.out.println(Thread.currentThread().getName() + " " + i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        
        new Thread(() -> {
            for (int i =0; i<3; i++) {
                try {
                    Thread.sleep(50);
                    System.out.println(Thread.currentThread().getName() + " " + i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        
        
        thread.start();
        
        new Thread(() -> System.out.println("ggg")).start();
        
        new Thread(() -> {
            System.out.println("ggg");
        }).start();
        
        sc.nextLine();
    }
}
