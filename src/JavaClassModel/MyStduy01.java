package JavaClassModel;

import java.util.Arrays;

public class MyStduy01 {
    //假设我们希望按照长度递增的顺序对字符串进行排序。
    public static void main(String[] args) {
        //来点数据结构
        String[] arr = new String[4];
        //数据初始化。
        // (new String[4])[0]="OLLEH";
        arr[0] = "HESSDFSDFSDO";
        arr[1] = "worldSDFSD";
        arr[2] = "JavaClSDFSDFSDFSDFSDFSDass";
        arr[3] = "HTML5";
        //处理数据
        Arrays.sort(arr, new LengthComparator());
        //测试，查看 处理的效果。
        System.out.println(Arrays.toString(arr));

/*  如果你要按照字典比较的话，你可以使用String类的代码。
           if (arr[i].compareTo(arr[i])>0) */

    }
}
