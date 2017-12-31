package syntax01;

public class Modifier {

    //不管属性什么修饰符，都遵守本类下的成员，都可以访问。

    String modifierNothing;//java默认同包访问，同包下所有方法，因为都可以访问。

    private String modefierPrivate;//只属于类成员，类成员直接访问。

    protected String modifierProtected;//同包和子类可以访问。[本类当然可以访问，如此明显就不写了]

    //public 共有。不同包下都可以访问，如此简单。不写了。



}
