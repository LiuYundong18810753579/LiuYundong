import java.util.Scanner;
public class Break_01{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		String name = " ";
		String passwd = " ";
		int change = 3; // 一共有三次机会
	    for (int i=1;i<=3 ;i++ ) {
	    	System.out.println("请输入用户名");
	    	name = myScanner.next();
	    	System.out.println("请输入密码");
	    	passwd = myScanner.next();
	    	// 注意一下字符串的比较
	    	if ("丁真".equals(name) && "666".equals(passwd)){
	    		System.out.println("登录成功");
	    		break;	
	    	}
	    	else{
	    		change = change -1;
	    		System.out.println("还剩余"+change+"次机会");
	    	}

	    }
 

	}
}