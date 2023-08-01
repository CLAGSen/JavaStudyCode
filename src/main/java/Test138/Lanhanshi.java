package Test138;

public class Lanhanshi{

    private static volatile Lanhanshi instance = null; //避免指令重拍
    private Lanhanshi(){

    }

    //不安全的
    /*public static Lanhanshi getInstance(){    //使用静态方法，用类名调用方法

        if (instance == null){
            instance = new Lanhanshi();
            return instance;
        }else {
            return null;

        }
    }*/

    //法1
    /*
    public static synchronized Lanhanshi getInstance(){    //同步监视器默认为类名.class

        if (instance == null){
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            instance = new Lanhanshi();
        }
        return instance;
    */

    //法2
    /*
    public static Lanhanshi getInstance(){    //同步监视器默认为类名.class

        synchronized (Lanhanshi.class) {
            if (instance == null){
    //            try {
    //                Thread.sleep(1000);
    //            } catch (InterruptedException e) {
    //                e.printStackTrace();
    //            }
                instance = new Lanhanshi();
            }

        }
        return instance; //return放在外面
    }
 */
    //法3优化
    public static Lanhanshi getInstance(){    //同步监视器默认为类名.class

        //优化，不用判断了
        if(instance == null){
        synchronized (Lanhanshi.class) {
            if (instance == null){
                //            try {
                //                Thread.sleep(1000);
                //            } catch (InterruptedException e) {
                //                e.printStackTrace();
                //            }
                instance = new Lanhanshi();
            }

         }
        }
        return instance; //return放在外面
    }
}
