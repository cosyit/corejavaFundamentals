package functional01.InterfaceAndCallBack;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class MainTest {
    public static void main(String[] args) {

        //(event) 可省略小括弧，因为方法参数只有一个。
        ActionListener mylistener=c -> System.out.println("时间"+new Date());


/*        new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                ///。。。。。。
            }
        }.actionPerformed();

        */

        //用一个接口去引用一个实现类的对象。接口对象
        ActionListener listener = new TimerPrinter();//某种事件事件监听器对象。

        //构造出每3秒后，就调用事件动作监听器的定时器对象。
       Timer timer = new Timer(3000,listener);
       timer.start();

       JOptionPane.showMessageDialog(null,"退出程序");
       System.exit(0);
       // listener.actionPerformed();
    }
}
//时间打印器。
class TimerPrinter implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent event) {
        System.out.println("At the tone,the time is :"+new Date());//打印时间
        Toolkit.getDefaultToolkit().beep();//响一次
    }
}