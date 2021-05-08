import java.util.Scanner;
public class switch_02{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请任意输出一个小写的英文字母");
		char c = myScanner.next().charAt(0);
		switch (c) {
			case 'a':
			   System.out.println('A');
			   break;
			case 'b':
			   System.out.println('B');
			   break;
			case 'c':
			   System.out.println('C');
			   break;
			default :
			   System.out.println("other");
			
			
		}
	}
}