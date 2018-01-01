package algorithm1.选择排序;

import java.util.Arrays;

import org.junit.Test;

/**
 * 选择排序，selectionSort 
 * 冒泡排序，bubbleSort 
 * 插入排序，insertionSort
 * 
 * @author Mumu
 *
 *         外层循环是轮数，内部循环就来模仿次数。
 */
public class Algorithm1 {
	

	/**
	 * 
	 * 冒泡排序：
	 * a[0]和a[1]比较，a[1]和a[2],a[2]和a[3],a[3]和a[4],a[4]和a[5]........一路扫过去。这一路扫完，在一端就会有极大或极小
	 * 
	 * 比如，我们还按照从小到大的顺序来进行排序，那么就挑最大的去过五关斩六将。 一路排下来，最后最远的元素，是最大 的。
	 * 
	 * 那么第二轮比较就不要需要再比较那么远的元素了。
	 * 
	 * 
	 * @param a
	 */
	public void bubbleSort(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {// 不符合我的心意，那么就改变它。进行调换。
					int t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
			}
		}
	}

	/**
	 * 选择排序 a[0] a[1] a[2] a[3] a[4] 从小到大排序。 第一次a[0]和a[1]比较，如果大，交换，把大的放后面。小的放入a[0]
	 * 第二次a[0]和a[2]比较，同样这样做，小的放入a[0]中。 第三次a[0]和a[3]比较，小的放入a[3] ... 最后一次是：
	 * a[0]和a[a.length-1]进行比较，如果大则交换。
	 * 
	 * a[0] 已经是最小的了。达到目的。进行下一个。 ---------------------------------------
	 * 拿a[1]来做上面类似的操作。 拿a[2]来做上面类似的操作。 . . . 拿a[a.length-2]和a[a.length-1]来做上面类似的操作。
	 * 
	 * 类似操作做arr.length-1轮。
	 * 
	 * @param intArray
	 */
	private void selectionSort(int[] arr) {
		// arr.length-1就是数组的最大index,i在这范围中进行变化。
		int rounds轮数 = arr.length - 1;

		for (int i = 0; i < rounds轮数; i++) {

			// j在数组个数中变化。
			for (int j = i + 1; j < arr.length; j++) {
				// 如果arr[i]>arr[j]就交换。 前一个数的index比后一个数的index小1.
				// 所以i就是前一个数，j就是后一个数。
				if (arr[i] > arr[j]) {
					// 满足上个条件就交换
					int t = arr[i];// 先存住一个数据后，那么这个数据可以任意的抹除了。
					arr[i] = arr[j];
					arr[j] = t;
				}
			}
		}
	}

	public static void reversePosition1(Integer a, Integer b) {
		Integer t = a;
		a = b;
		b = t;
		System.out.println(a + "<--:-->" + b);
	}

	public static void main(String[] args) {
		Integer a = 1;
		Integer b = 2;
		reversePosition1(a, b);
		System.out.println(a);
		// 有的同学问，我把公共交换位置的代码抽取为方法，为什么上面的方法不能用呢？
	}

	@Test
	public void testAlgorithm1() {
		int[] a = { 12, 114, 2, 9, 8, 78, 23 };

		// selectionSort(a);
		// bubbleSort(a);
		//insertionSort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
