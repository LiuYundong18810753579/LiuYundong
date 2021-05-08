// if 的快速入门
// 编写一个程序，可以输入人的年龄，如果该同志的年龄的大于18岁，
// 则输出：你年龄大于18，要对自己的行为负责
// 思路分析
// 1.接收输入的年龄，应该定义一个Scanner对象
// 2.把年龄保存到一个变量
// 3.判断，然后输出
import java.util.Scanner; //导入Scanner的包
public class if_01{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入年龄");
		int year  = myScanner.nextInt();
		if(year >= 18){
			System.out.println("你年龄大于18，要对自己的行为负责");
		}
		
		System.out.println("程序继续...");
	}
}