package functional03;

import java.util.function.BiFunction;

//认识java8中，函数式接口
public class Demo1 {

    //如果想用lambda表达式做某些处理，那么记住表达式的用途后，根据用途建立特定的FunctionInterface;
    //最好把lambda表达式看作为一个函数，而非对象。
    BiFunction<String,String ,Integer> comparator=(p1,p2)->p1.length()-p2.length();
}
