/**
   * @author LiuYundong
*/


//注意一个public中只有一个类是，文件名与类名必须保持一致
public class ChangeChar{ 
	public static void main(String[] args) {
		
//      \t:表示一个制表位，实现对齐的功能
		System.out.println("北京\t上海\t天津\t山东");
//      \n:表示换行符
		System.out.println("jack\nmasi=y\nhello");
//      \\:代表一个\,那么\\\\：代表两个\\
		System.out.println("\\100天任务培训系统\\java学习\\javacode\\first_day");
//      \":代表一个"
		System.out.println("老师说: \"要好好学习java，有前途\"");
//      \r : 一个回车 System.out.println("好好学习孩子")
//      1.会输出：好好学习孩子
//      2.\r表示回车
		System.out.println("好好学习\r孩子"); // 会输出孩子学习
	}
}