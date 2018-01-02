package functional01.LambdaExpression;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Demo2 {

    /**
     * lambda表达式形式：(参数可以没有，小括弧必须有-->如果有且只有一个参数的时候可省略），箭头，表达式
     * @param args
     */
    public static void main(String[] args) {
        String [] arr={"DAMUMU","XIAOMUMU","ZHONGMUMU","zzzzzzzzzzzzzzzzzzz"};
        Arrays.sort(arr,(o2, o1) ->o1.length()-o2.length());

        Arrays.sort(arr,
                ( first,  second) -> {
                    if (first.length() < second.length()) return -1;
                    else if (first.length() > second.length()) return 1;
                    return 0;
                    }
                );
        System.out.println(Arrays.toString(arr));
    }
}






















class Worker implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        //做事情，做业务,反复执行的事情。希望将来做事情的代码重点：自由变量lambda！
    }
}

