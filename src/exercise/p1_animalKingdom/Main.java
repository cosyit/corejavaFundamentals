package com.cosyit;

/**
 * 在Java中所有的类，都继承Object类。
 * 继承：成为了Object，我还可以在Object的基础之上进行一些自己的改变。
 */
public class Main extends Object{

    public static void main(String[] args) {
/*        Person me=new Person();
        me.write("今天是2017年12月29号");
        me.write("明天是30号");
        me.getClass();
        System.out.println(me.getClass().getName());*///全限定名fully-qualified name

        Animal animal=new Animal();
        //对象的初始化：给对象赋值的过程。
        //对象的初始化有很多种方式：1.getter,setter 2.构造器，3.反射也可以赋值。
        animal.setName("小强");
        animal.setWeight(10);

        System.out.println(animal.getName());

        new Animal().field1="xxx";
        int a =100;
    }
}
