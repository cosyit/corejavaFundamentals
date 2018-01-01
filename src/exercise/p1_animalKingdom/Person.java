package com.cosyit;

//person is a Object ：继承关系。
public class Person {

    {
        System.out.println("今天心情不错！");
    }

    private Glass glass;// 聚合关系（组合关系）
    private String name;
    private String email;

    public Person(){

        System.out.println("无参数的构造函数");
    }

    public Person(String name){

        this.name = name;
        System.out.println("有参数构造函数");
    }

    public Person(String name, String email) {

        this.name = name;
        this.email = email;
    }

    void write(String content){
        System.out.println("写的内容是"+ content);

    }

    //对象之间的关系
    /**
        is-a 继承关系  动物类  -- > 猴子类   猴子 is a 动物
        has-a 聚合关系 一个类组合了另外一个类的属性  人 ---> 眼镜
        user-a  依赖
     */

    void fire(){
        System.out.println( new Gun(name).name+"BOM!");//依赖关系use-a
    }
}
