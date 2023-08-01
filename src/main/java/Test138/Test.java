package Test138;


public class Test {

    static Lanhanshi l1 = null;
    static Lanhanshi l2 = null;
    public static void main(String[] args) {


        Thread t1 = new Thread(){

            @Override
            public void run() {
                /*try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }*/
                l1 = Lanhanshi.getInstance();
            }
        };


        Thread t2 = new Thread(){
            @Override
            public void run() {
                l2 = Lanhanshi.getInstance();
            }
        };

        t1.start();

        t2.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l1 == l2);


    }

}

