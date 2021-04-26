// 课堂练习
// 假如还有59天放假，问：合XX个星期零XX天
public class ArithmeticExercise_01{
	public static void main(String[] args) {
		int holiday = 59;
		int weeks = holiday / 7;
		int day = holiday % 7;
		System.out.println("假如还有59天放假"+"合"+weeks+
			"个星期零"+day+"天");
		double huashi = 234.6;
		double sheshi = 5.0 / 9 * (huashi - 100);
		// 同时考虑数学公式与java语言的特征 5.0/9
		// 如果输入 5/9 就是错误的
		System.out.println("华氏温度" + huashi
			+ "对应的摄氏度" + sheshi);
	}
}