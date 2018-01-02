package functional02;

import java.util.ArrayList;
import java.util.List;

public class DemoTest {

    public static void main(String[] args) {

        //组合式函数编程

        //容器中字符超过5个字符，就砍掉。然后变大写。 写这样的函数。
        List<String> list =new ArrayList<String>();
        list.add("helloworld");
        list.add("superman");
        list.add("areyouok");
        list.add("functionalProgramming");
        //Arrays.asList("helloworld","superman","areyouok");

        //函数1：砍5个长。
        Function f1 = new Function() {
            @Override
            public String apply(String input) {
                return input.length()>5 ? input.substring(0,5):input;
            }
    };

        //这个函数，转成大写。
        Function f2 = new Function() {
            @Override
            public String apply(String input) {
                return input.toUpperCase();
            }
        };

        //组合一起使用。
       // f2(f1(String))

        for (String str:list
             ) {
            System.out.println(f2.apply(f1.apply(str)));
        }
}
}
