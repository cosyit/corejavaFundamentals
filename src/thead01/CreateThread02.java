package thead01;

/**
 * 练习1：
 */
public class CreateThread02 {
        public static void main(String[] args) {

            MyThread myThread=new MyThread();
            myThread.start();

            //主线程
            for(;;){
                System.out.println("world");
            }

        }
    }

    //线程instance，需要线程类 模板。可以先定义出类对象或使用匿名对象的方式。
    class MyThread extends Thread{
        //因为class Thread implements Runnable接口，所以它获得了run方法。
        @Override
        public void run() {
            for(;;){
                System.out.println("hello");
            }
        }
    }

    class YouThread extends Thread{
        @Override
        public void run() {
            System.out.println("world");
        }

}
