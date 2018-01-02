package functional03;


import javax.swing.*;

public class MethodReference {

    public static void main(String[] args) {

        //Object::instanceMethod
        Timer timer = new Timer(1000, System.out::println);

        //Class::staticMethod  Math::pow(x,y)
        //Class::instanceMethod
    }
}