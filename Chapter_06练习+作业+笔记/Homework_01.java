import java.util.Scanner;
public class Homework_01{
	public static void main(String[] args) {
		// ��һ�⣺ ��ȷ���� B D
		// �ڶ��⣺��� "blue"
		// �����⣺��� 1 3 5 7 
		// �����⣺ �����
		int arr[] = {10, 12, 45, 90};
		int arr2[] = new int[arr.length+1];
		Scanner myScanner = new Scanner(System.in);
		System.out.println("����������һ������");
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