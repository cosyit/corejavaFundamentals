package annotation01;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 * 务必记住：注解自身是没有意义的，必须用其他程序处理注解才有意义。
 * 如何自定义注解：
 * 1).使用 @interface 声明你的注解类。
 * 2).添加相应的元注解：注解 注解的annotation
            @Target() ：指定修饰那里。
            @Retention() :保留在源码阶段有效，class文件中有效，runTime运行时有效[可以通过反射读取，这个注解数据。]。
    通常编译器和加载器喜欢使用SOURCE，CLASS属性。如果你使用了RUNTIME，那么其他2个级别都有效。
            @Documented  纯标记注解没有成员。
            @Inherited

 详解：@Target 描述使用范围。
 */

@Target(value = {ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME) //意味着将来只要加载此类，就可通过反射可以读取到。
public @interface MyAnnotation01 {

    //在使用的地方保存不动，删掉default "";看看效果。如果此时你没有传入参数就会报错。
    String name() default "";//如果你在使用的时候，没有传入参数的话，默认给你传入一个空字符串。

    int age() default 0; //使用注解是，不传入参数，默认给参数。

    int id() default -1;//如果你不给我传入id，值就是-1，表示id值不存在的含义。

    String [] teachers() default {"木木"};//默认设为空数组。通过{}初始化。

}
