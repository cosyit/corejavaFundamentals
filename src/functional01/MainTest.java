package functional01;

public class MainTest {
    public static void main(String[] args) {
        //编译时 接口引用声明变量   =  new runtime确定了它具体的class.  ===>JVM 内存模型
        MyInterface mmm= new MyInterfaceImpl_MumuMachine();
        mmm.makemovies();

        MyInterface zlm=new MyInterface_ZhanlingMachine();
        zlm.makemovies();



        new MyInterface(){
            @Override
            public void eat() {
                System.out.println("这里是eating工作，其他的的现实一定有，使用的是接口默认的实现。");
            }
        }.eat();
    }
}
