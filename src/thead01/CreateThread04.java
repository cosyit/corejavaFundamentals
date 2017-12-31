package thead01;

//分析优先级，问题：2个run()方法，会用那个run()方法呢。
public class CreateThread04 {
    public static void main(String[] args) {
        //我们可以这样：new Thread的子类
        new Thread(){
            public void run(){
                for(;;){
                    System.out.println("mumu");
                }
            }
        }.start();


        //打印hello还是world呢？
        new Thread(new Runnable() {

            @Override
            public void run() {
                for(;;){
                    System.out.println("hello");
                }
            }
        }){
            public void run(){
                for(;;){
                    System.out.println("world");
                }
            }
        }.start();

    }
}
