import java.util.Scanner;
public class SeqSearch{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("随机输入1-5之间的一个数");
		int num = myScanner.nextInt();
		int arr[] = {1, 2, 3, 4, 5};
	    // 一个小技巧,自己当时没有想出来
	    int index = -100;
		for (int i =0 ;i<arr.length ;i++ ) {
			if (num == arr[i]) {
			    index = i;
				System.out.println("数组中有相应的值与之匹配"+ index);
                break;// 提前退出
			}
		}
		if (index == -100) {
			System.out.println("找不到该数字");
				
			}	
		
	}
}