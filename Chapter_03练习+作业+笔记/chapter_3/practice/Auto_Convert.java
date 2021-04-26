// 自动类型转换细节
public class Auto_Convert{
	public static void main(String[] args) {
		int a = 'a';  /// 记住char字符串只能记录单个字符，且用单引号
		double  d = 80;
		System.out.println(a);
		System.out.println(d);// 会输出80.0
	// 多种数据类型的数据混合运算时
	//  细节2 系统首先自动将所有数据转换为容量最大的数据类型，然后在进行计算
		int n1 = 10;
		//float d1 = n1 + 1.1; 这个说法就是错误的，因为整数与double的
		//混合运算，系统自动的转换为容量最大的数据类型，这里应该是double
	    double d1 = n1 + 1.1;  //这样是对的

	    float d2 = n1 + 1.1F;  //这样也是正确的

	     System.out.println(d1);
	     System.out.println(d2);
    // 细节三 (byte,short)和char之间不会进行相互的转换
         byte b1 = 10; //byte的范围为-128--127之间
    // char c1 = b1; 是错误的,原因在上面
    // 细节4 byte、short、char 他们三者可以计算，在计算时首先转换为int类型
         
          

	}
}