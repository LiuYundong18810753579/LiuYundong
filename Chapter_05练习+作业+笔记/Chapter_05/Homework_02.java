// 判断一个整数是否为水仙花数
public class Homework_02  {
	public static void main(String[] args) {
		// 先得到数字的百位、十位、个位上的数字，使用if进行判断
	// 百位：n / 100
	// 十位：n % 100 / 10
	// 个位：n % 10
	int a = 111;
	int a1 = a / 100;
	int a2 = a % 100 /10;
	int a3 = a % 10;
	if(a == a1*a1*a1 + a2*a2*a2 + a3*a3*a3 ){
		System.out.println(a+"是水仙花数");
	}
	else{
		System.out.println(a + "不是水仙花数");
	}
 
	}
	

}