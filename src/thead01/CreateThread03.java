package thead01;

/**
 * 花式创建法：
 *
 * 另外：融合lambda表达式的语法方式：如果想分析更复杂更迷糊的创建Thread语法 -->请移步至04
 */
public class CreateThread03 {
    public static void main(String[] args) {

        //注意语法技巧:Thread构造器参数：new一个现实了接口的instance作为参数。
        new Thread( new Runnable() {
            @Override
            public void run() {
                for(;;){
                    System.out.println("hello");
                }
            }
        }).start();


        new Thread(){
            public void run(){
                while(true){
                    System.out.println("world");
                }
            }
        }.start();



        //目标一：用Java8 lambda表达式进行改造：

        new Thread(()->{while (true){System.out.println("lambda hello world");}}).start();
    }
}
