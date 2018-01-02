package functional01;

//接口可以继承接口。
public interface MyInterface extends DJInterface {

    //接口中的方法默认是public abstract的。方法没有实现。就是一组需求，或者你可以当做是
    //接口的实现类。必须满足我的需求。我发号指令，你去实现这个指令。
    //所有的方法你可以看作为一组需求指令。而指令的实现，由我的实现类去完成。

    //接口是一组需求的描述。
   default void work(){}
    void eat();
    default void shopping(){}
    default void drink(){
        System.out.println("接口的drinking");
    }
    default void song(){}

   default void makemovies(){
       song();
   }

   //AbstractMethodError.
}
