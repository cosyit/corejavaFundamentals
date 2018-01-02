package functional01.LambdaExpression;

public class Demo1 {

    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run() {
                for(;;){
                    System.out.println("studying");
                }
            }
        }.start();


        new WorkTaskThread().start();

        new Thread(){

        }.start();




        new Thread(
                () -> {
                        while (true){System.out.println("lambda hello world");}
                }
        ).start();





      /* run方法本尊：
        {
        ()->{
            while (true){System.out.println("lambda hello world");}
        }}

        */

    }

}

class WorkTaskThread extends Thread{
    @Override
    public void run() {
        while(true){
            System.out.println("working");
        }
    }
}
