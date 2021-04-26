public class ForceConvert{
	// 编写一个main方法：
	public static void main(String[] args) {
		
          //强制类型的转换
		  int n1 = (int)1.9;
		  System.out.println("n1=" + n1); //输出n1 = 1
		  /*强转符号只针对于最近的操作数有效，往往会使用小括号
		 来提高优先级 */
          // int x = (int)10*3.5+6*1.5 是错误的
		 int x = (int)(10*3.5+6*1.5);
		 System.out.println(x);

		 //
		 char c1 = 100; //ok
		 int m = 100; // ok 
		 char c3 = (char)m; //ok
		 System.out.println(c3); // 100对应的字符：d 根据ACSII编码表查找
		 


	}
}