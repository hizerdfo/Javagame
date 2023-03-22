package class0322;

public class Counter {
    int num = 0;
    public static void main(String[] args)throws Exception{
        Counter counter = new Counter();
        for (int i = 0; i < 1000; i++) {
            new Thread(() -> {
                try {
                    Thread.sleep(10);
                    synchronized (counter) {
                        counter.num++;
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
        Thread.sleep(1000);
        System.out.println(counter.num);
    }
}
