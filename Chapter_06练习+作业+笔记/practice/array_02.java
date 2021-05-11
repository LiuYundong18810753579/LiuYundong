import java.util.Scanner;
public class array_02{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		// 先创建一个数组
		double score[];
		score = new double[5];
		// 进行循环输入
		for (int i = 0;i < score.length ;i++ ) {
			System.out.println("请输入第"+ (i+1)+ "个数");
			score[i] = myScanner.nextDouble();	
		}
		// 遍历数组，进行循环输出s
		System.out.println("当前数组的元素如下");
		for (int i = 0 ;i <score.length ;i++ ) {
			System.out.println(score[i]);
			
		}
	}
}    