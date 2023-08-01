package Test138.LockTest;

public class Test {
    public static void main(String[] args) {
        SleTicket sleTicket = new SleTicket();
        Thread thread1 = new Thread(sleTicket,"1号");
        Thread thread2 = new Thread(sleTicket,"2号");
        Thread thread3 = new Thread(sleTicket,"3号");
        thread1.start();
        thread2.start();
        thread3.start();



    }
}
