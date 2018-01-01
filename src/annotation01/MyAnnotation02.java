package annotation01;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = {ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation02 {

    String valueM();//如果你的注解中只有一个参数的话，一般定义为value

    /**
    参考 Retention 注解中只有一个参数：
        RetentionPolicy value();
     也是把唯一属性名定义为value的。
     但是类型任意。
     在注解中的方法一样的存在，我们叫他属性。使用的时候也是属性赋值。
     *
     */
}
