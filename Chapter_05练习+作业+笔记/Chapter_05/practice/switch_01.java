import java.util.Scanner;
public class switch_01{
	public static void main(String[] args) {
		// 编写一个程序，该程序可以接收一个字符
		// a表示星期一，b表示星期二
		// 根据用户的信息显示相依的信息
	Scanner myScanner = new Scanner(System.in);
	System.out.println("请输入一个字符：a-g之间");
	char zifu = myScanner.next().charAt(0);
	switch(zifu){
		case 'a':
		    System.out.println("今天星期一");
		    break;
		case 'b':
		    System.out.println("今天星期二");
		    break;
        case 'c':
		    System.out.println("今天星期三");
		    break;
		default:
		    System.out.println("没有匹配的");
	}
	System.out.println("程序结束");
	}
}