package annotation01;

public class DemoTest01 {

    //顺序随意，定义之后我们就可以用其他的程序进行读取你在注解中定义的数据。
    //所以注解的编写一定：有注解的编写声明 ，使用，和解析程序 三个动作组合 才能体现价值。
    @MyAnnotation01(name = "吴秀波",age = 40,teachers = "木木老师",id = 001)
    @MyAnnotation02(valueM ="ccc")//不是value省略不了，如果定义为value就可以省略。
    public void sayHello(){

    }
}
