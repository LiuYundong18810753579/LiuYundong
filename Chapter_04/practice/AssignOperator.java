public class AssignOperator{
	public static void main(String[] args) {
		
		int n1 =10 ;
		n1  += 4; // n1 = n1 + 4
		System.out.println(n1); // 14


    // 复合赋值运算符会进行类型转换
		byte b = 3;
		b += 2;  // 会自动生成 b = (byte)(b + 2)

    // 三元运算符
		int a = 10;
		int c = 99;
		//解读 
		// 1.a > b 为flase
		// 2.返回b--，先返回b的值，然后在b-1
		// 返回的结果为99
		int result = a > c? a++ : c--;
		System.out.println("result=" + result);
	}
}