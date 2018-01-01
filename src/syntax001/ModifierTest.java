package syntax001;

public class ModifierTest {
    //public属性测试，略了,如若不懂，请自我解决。
    public static void main(String[] args) {

        String noModifier=new Modifier().modifierNothing="默认";
        String modifierProtected= new Modifier().modifierProtected="受保护";

        System.out.println(noModifier+" & "+modifierProtected);

        //然后请按shift+alt+F10在IDEA中运行[shift+F10我这里也可以]。DeBug shift+alt+F9[或直接F9]
    }

    //介绍一下IntelliJ IDEA中。
}
