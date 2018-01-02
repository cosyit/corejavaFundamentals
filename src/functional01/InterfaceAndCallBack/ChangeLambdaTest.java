package functional01.InterfaceAndCallBack;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.Date;

public class ChangeLambdaTest {
        public static void main(String[] args) {

/*        new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                ///。。。。。。
            }
        }.actionPerformed();

        */

            //用一个接口去引用一个实现类的对象。接口对象
            ActionListener listener = new functional01.InterfaceAndCallBack.TimerPrinter();//某种事件事件监听器对象。

            //构造出每3秒后，就调用事件动作监听器的定时器对象。
            Timer timer = new Timer(3000,event->{
                System.out.println("At the tone,the time is :"+new Date());//打印时间
                Toolkit.getDefaultToolkit().beep();//响一次
            });
            timer.start();

            JOptionPane.showMessageDialog(null,"退出程序");
            System.exit(0);
            // listener.actionPerformed();



        }
    }
