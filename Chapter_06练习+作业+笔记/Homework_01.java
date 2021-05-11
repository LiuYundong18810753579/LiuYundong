import java.util.Scanner;
public class Homework_01{
	public static void main(String[] args) {
		// 第一题： 正确的是 B D
		// 第二题：输出 "blue"
		// 第三题：输出 1 3 5 7 
		// 第四题： 编程题
		int arr[] = {10, 12, 45, 90};
		int arr2[] = new int[arr.length+1];
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请随意输入一个整数");
		arr2[4] = myScanner.nextInt();
		for (int i = 0;i<arr.length ;i++ ) {
			arr2[i] = arr[i];
		}
		arr = arr2;
        for (int j= 1; j<arr.length; j++) {
           for (int i = 0;i < arr.length-j ;i++ ) {
			  int temp = arr[i+1];
			  if (arr[i]>arr[i+1]) {
				  arr[i+1] = arr[i];
				  arr[i] = temp;				
			   }
			
		     }	
        }
		for (int i=0;i<arr.length ;i++ ) {
			System.out.print(arr[i] +" "); 	
		}
	}
}