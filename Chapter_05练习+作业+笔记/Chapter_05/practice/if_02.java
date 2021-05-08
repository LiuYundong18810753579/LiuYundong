import java.util.Scanner;
public class if_02{
	public static void main(String[] args) {
		// Scanner myScanner = new Scanner(System.in);
		// System.out.println("请输入自己的真实年龄");
		// int age = myScanner.nextInt();
		// if (age > 18){
		// 	System.out.println("需要承担自己的法律责任");

		// }
		// else{
		// 	System.out.println("未成年，需要自我改造");
		// }
		// System.out.println("点击请继续");
		
		// 练习1
		// double a = 25;
		// double  b = 12;
		// if(a > 10 && b<20){
		// 	double c = a + b;
		// 	System.out.println("两个数的和="+c);
		// }

		//练习2
		// int c = 15;
		// int d = 10;
		// int e = c + d;
		// if(e % 3 == 0 && e % 5 == 0){
		// 	System.out.println("最后的结果为可以被整除");
		// }
		// else{
		// 	System.out.println("最后的结果不能被整除");
	 //  	}
		// 练习三
		// 判断一个年份是否为闰年，闰年的条件是符合下面的二者之一
		// (1):年份能被4整除，但不能被100整除
		// (2)能被400整除
		int year = 2020;
		if((year % 4 == 0 && year % 100 !=0)|| year % 400==0){
			System.out.println("最后的结果是闰年");
		}
		else{
			System.out.println("最后的结果不是闰年");
		}
	}
} 