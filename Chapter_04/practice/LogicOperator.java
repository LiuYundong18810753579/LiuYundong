public class LogicOperator{
	public static void main(String[] args) {
		// ||短路或  和 |逻辑或 的区别
		int a = 5;
		int b = 11;
		// || 有一个为真，那么整个结果就是真
		//  |  有一个为真，整个结果就是为真
        if(a < 8 || b > 10){
        	System.out.println("ok100");
        }
        if(a < 8 | b > 10){
        	System.out.println("ok300");
        }
        //区别：(1) ||短路或：如果第一个条件为true，
        // 则第二个条件不会判断，最终结果为true，效率高
        // 逻辑或
	}
}