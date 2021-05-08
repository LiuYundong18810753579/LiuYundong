public class array_04{
	public static void main(String[] args) {
		// char arry[] = new char[26];
		// for (int  i = 0;i <  arry.length ;i++ ) {
		// 	arry[i] = (char)('A' + i);	// 'A' + i 是int类型
		// }
		// for (int i = 0; i< arry.length; i++) {
		// 	System.out.print(arry[i]+" ");
			
		// }

		// 自己的解题思路
		// int array[] = {4, 1000, 9, 10, 23};
  //       int a = 0;
  //       int b = 0;
		// for (int i = 0;i < array.length ;i++ ) {
			
		// 	if (array[i] >= a) {
		// 		a = array[i];
		// 		b = i;
				
		// 	}
	 //     else{
	 //     	   a = a;
	    
	 //     }
		// }
		// System.out.println("最大的值为=" + a);
		// System.out.println("对应的索引为="+ b);

		//老师的解体思路
		int arr[] = {0, 4, -5, 88};
		int max = arr[0];
		int maxindex = 0;
		for (int i = 1;i < arr.length ; i++) {
			if(max < arr[i]){
				max = arr[i];
				maxindex = i;
			}
			
		}
		System.out.println("最大的值为=" + max);
		System.out.println("对应的索引为="+ maxindex);
		
	}
} 