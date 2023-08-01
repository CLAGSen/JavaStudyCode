package Test136;

public class SleTicket implements Runnable{

    int ticket=100;
    Object object = new Object();
    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (object) {
                if(ticket>0){
                    System.out.println
                            (Thread.currentThread()
                             .getName()
                             + "售票,票号为："
                             + ticket);
                    ticket--;
                }else {
                    break;
                }
            }

        }
    }
}
