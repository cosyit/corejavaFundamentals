package tool01;

public class DebugFunction {

    public static void main(String[] args) {
        foo1();
        foo2();
    }

    /**
        1.在for所在行设置断点:选定要设置断点的代码行，在行号的区域后面单击鼠标左键即可
        2.运行小虫子按钮，或快捷键F9h或shift+alt+F9
        3.在Frames窗口中，会出现 当前debug调试程序所在的代码行位置，ps:老外确定位置都是从小到大？。
        4.可以向variables中的变量拖拽到watches中进行查看。
        5.F5和F6和Eclipse是一样的。
     *
     */
    public static void foo2(){
        for(char ch = 0; ch < 128 ; ch++){
            if(Character.isLowerCase(ch)){
                System.out.println("value : "+ (int)ch + " character: " + ch);
            }
        }
    }

    public static void foo1(){
        System.out.println("hello");
        System.out.println("world");
        System.out.println("weChat vs aliPay");

    }
}
