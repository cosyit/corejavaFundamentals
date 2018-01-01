package algorithm3;

import org.junit.Test;

import java.util.Arrays;

public class insertionSort {
	
	
	/*
	 * 在做插入排序之前，先完成一个代码即：从一个从小到大排列好的数组中，如何插入元素，插入后该数组还是从小到大的排序。 以更容易理解插入排序算法。
	 * 
	 * @param arr 被插入的数组
	 * 
	 * @param insertObj 插入的元素 ↓ a[0] a[1] a[2] a[3] a[4] a[5] a[扩容]
	 * 插入元素找地方插入。需要比较，从尾部比较。 如果插入元素，比 比较的元素小，那么比较元素，往前挪动一个index。
	 * 
	 * 总结：从最后一个元素开始和insertObj进行比较，如果比较的元素比insertObj大，那么这些元素都后移。
	 * 一直到insertObj大于数组的某个元素，那么插入元素就放在这个元素之后。
	 * @param arr
	 * @param insertObj
	 */
	public static int[] testInsert(int[] arr, int insertObj) {
		// 插入一个元素，首先肯定要扩容。我查看源码，发现这个用了本地方法。
		arr = Arrays.copyOf(arr, arr.length + 1);
		// 挨个比较，从尾部比较，这样，插入时，挤入偏移发生的数据会少一点。

		/**
		 * 因为从高位向下比较，所以i--, i为什么是arr.length-2，而不是arr.length-1呢？ 因为扩了一个容，所以后面的一位是尚没有元素的。
		 */

		int i;// 循环出来还要将i保留住。
		for (i = arr.length - 2; i >= 0; i--) {
			if (insertObj < arr[i]) {
				// 值后移动。
				arr[i + 1] = arr[i];
			} else {
				// 否则的话，相反情况，就是插入元素不比 对比元素小了 ，就别往下循环i了。因为i已经找到了。
				break;
			}
		}
		// 值都已经后移动了。当前的i不动，把它后一个覆盖掉，它的后一个在i值变化前已经后移了。
		arr[i + 1] = insertObj;

		return arr;
	}

	@Test
	public void testInsertionSort() {
		int[] a = { 1, 2, 4, 5, 6, 7 };
		a = testInsert(a, 3);
		System.out.println(Arrays.toString(a));
	}
	
	
	//接下来我们正式做插入排序。
	
	/**
	 *  a[0] a[1] a[2] a[3] a[4] a[5]
	 *  
	 *  a[0]做为被插入数据，a[1]作为插入数据
	 *  a[0],a[1]做为被插入数据，a[2]作为插入数据
	 *  a[0],a[1],a[2]做为被插入数据，a[3]作为插入数据
	 *  a[0],a[1],a[2],a[3]做为被插入数据，a[4]作为插入数据
	 *  a[0],a[1],a[2],a[3],a[4]做为被插入数据，a[5]作为插入数据
	 *  
	 *
	 */
	public static void insertionSort(int[] a) {
		
		int insertObj ;
		int j;

		//外层循环做多少次插入的。
		for(int i=1;i<a.length;i++) {
			
			insertObj=a[i];//第一次拿a[1]插入，第2次a[2]插入。
			
			/**
			 * 第一次拿出a[0],
			 * a[1]插入1个元素。
			 * a[2]插入2个元素。
			 * a[3]插入3个元素。
			 * n个元素就是数组长度的变化。
			 */
			
/*			for(j=i-1;j>=0;j--) { //插入次数
				if(insertObj<a[j]) {
					a[j+1]=a[j];//往后挪动
				}else {
					break;
				}
			}
			*/
		
			//优化，else就break了，循环就不做了，我把条件挪到for中的条件中来。
			
			for(j=i-1;j>=0&&insertObj<a[j];j--)a[j+1]=a[j];//往后挪动
			//a[j+1]=insertObj; j的变量作用域做一下提升。
			a[j+1]=insertObj;
		}
	}

}
