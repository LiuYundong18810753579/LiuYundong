public class ArrayReverse{
	// 数组的反转
	// 自己的解体思路 逆序赋值的方式
	public static void main(String[] args) {
		// int arry1[] = {11, 22, 33, 44, 55, 66};
		// int arry2[] = new int[arry1.length];
		// for (int i = 5; i>=0 ;i--) {
		// 	arry2[arry1.length-1 - i] = arry1[i];
  //           System.out.print(arry2[arry1.length-1-i]+"\t");
		// }
		int arr[] = {66, 55, 44, 33, 22, 11};
	// 老师的解题思路
	// 把 arr[0] 和arr[5] 交换
	// 把 arr[1] 和arr[4] 交换
	// 把 arr[2] 和arr[3] 交换
	// 一共交换 3 次， 
       int temp = 0;
       for (i=0;i<=arr.length/3 ;i++ ) {
       	   temp = arr[arr.length-1-i];
       	   arr[arr.length-1-i] = arr[i];
       	   arr[i] = temp;
       	
   }
	}

}