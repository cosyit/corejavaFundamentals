package thead01;

/**
 *  必备常识：main函数是主线程。
 *
 *  Create Thread mode 01 :
 *  任务类实现Runnable接口，创建任务类对象，作为Thread 类的构造函数的参数。
 *  即：实现类Runnable接口的实例作为Thread的构造函数的参数。
 *
 *  Create Thread mode 01 :
 *  创建一个类继承Thread类并重写Thread类中的run方法。创建子类的对象，即可成为一个线程宝宝了。
 *  即：创建一个继承Thread的类，重写run方法后，该类实例即为一个线程宝宝。
 *
 */
public class CreateThread01 {
    public static void main(String[] args) {

        TaskA taskA=new TaskA();
        Thread thread1=new Thread(taskA);
        thread1.start();//不要用thread1直接调用run()，那就不是线程做的事情了。

        /**
         * 观察运行结果整体来看，2个线程在同时运行。
         */

        TaskB taskB=new TaskB();

        Thread thread_B=new Thread(taskB);

        //设置优先级
       // tread_B.setPriority(5);

        thread_B.start();

        for(;;){
            System.out.println("我是主线程。");
        }
    }

}


//任务a->say : hello
class TaskA implements Runnable{

    @Override
    public void run() {
        for(;;){
            System.out.println("hello");
        }
    }

}

//任务B -> say : world? no,来点复杂滴！
class TaskB implements Runnable{

    @Override
    public void run() {
        for(;;){
            System.out.println("B任务：数数JVM中可用的CPU个数"+Runtime.getRuntime().availableProcessors());
        }

    }

}
