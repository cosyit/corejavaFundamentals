package alorithm4;
/**
 * 学习二分法查找。二分法没有排序，只有查找。
 * 这里面用了一个递归。
 * @author Administrator
 *
 */
public class BinarySearch {
	public static void main(String[] args) {
		
		int [] arr = new int[10_0000];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=i+1;
		}
		System.out.println(rank(55555, arr));
	}
	
	/**
	 * @param key 	查找对象 --->字
	 * @param a		查找的数组--->字典
	 * @return 		数组中的位置--->在哪里
	 */
	public static int rank(int key ,int [] a) {
		return rank(key,a,0,a.length-1);
	}
	
	
	/**
	 *  33 -> 1 -  50  - 100  
	 *  找到33所在的位置。
	 */
	
	public static int rank(int 查找元素,int [] a,int 传递过来的低位索引lowIndex,int 传递过来的高位索引highIndex) {
		if(传递过来的低位索引lowIndex>传递过来的高位索引highIndex) { new Exception("无法查找，因为传递的最大值，最小值不符合逻辑！");return -1;}
		
		int 中间索引midIndex = 传递过来的低位索引lowIndex + (传递过来的高位索引highIndex-传递过来的低位索引lowIndex)/2 ;
		//比较中间索引上的值。
		if(查找元素 < a[中间索引midIndex] ) {
			return rank(查找元素, a, 传递过来的低位索引lowIndex, 中间索引midIndex-1);}
		else if(查找元素 > a[中间索引midIndex]) {
			return rank(查找元素, a, 中间索引midIndex+1,传递过来的高位索引highIndex);
		}
		else {
			//只有当查找元素=a[中间索引midIndex]
			return 中间索引midIndex;
		}
	}
	
}
