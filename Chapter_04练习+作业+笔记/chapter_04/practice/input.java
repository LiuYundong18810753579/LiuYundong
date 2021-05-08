import  java.util.Scanner; //
public class input{
	public static void main(String[] args) {
		// 演示接收用户的输入
		//步骤
		// Scanner 表示简单的文本扫描器，java.unil 包
		// 1.引入Scanner类所在的包
		// 2.创建Scanner 对象,new 创建一个对象
	     Scanner  myScanner  = new  Scanner(System.in);

	     System.out.println("请输入名字");
	     String name = myScanner.next();
	     System.out.println("请输入年龄");
	     int age = myScanner.nextInt();
	     System.out.println("请输入工资");
	     Double sal = myScanner.nextDouble();
	     System.out.println("name="+name+"年龄="+age+"工资="+sal);


	}
}