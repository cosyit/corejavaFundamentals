package JavaClassModel;

import java.util.Comparator;

//实现接口，成为一个接口实现类，就是数据模板。
// new了之后，拿这个数据的方法体中的实现代码。
public class LengthComparator implements Comparator<String> {
    @Override
    public int compare(String second, String first) {
        return first.length() - second.length();
    }
}
