package syntax002.test;

import syntax002.entity.Student;

public class TestStaticMemory {

    /**
     * 关于JVM方法区中静态域的数据被instance实例引用的问题。
     * 本测试证明了徒弟提出的一个问题：其实我方法区是需要拷贝还是指向就可以了？这个我没有搞清楚。
     * 答案是：引用指向。
     * @param args
     */
    public static void main(String[] args) {
       Student jay= new Student();
       jay.setName("周杰伦");
        System.out.println(jay.getName());

        jay.javaClass="中央戏剧学院歌唱9班";
        System.out.println(jay.javaClass+","+Student.javaClass);


        Student sunwukong=new Student();
        sunwukong.setName("齐天大圣");

        System.out.println(sunwukong.getName()+","+Student.javaClass);

    }
}
