public class LogicOpterator{
	public static void main(String[] args) {
		// 案列 && 短路与 和 & 逻辑与 的使用方法
		int age = 50;
		if(age > 20 && age <30){
			System.out.println("ok100");
		}
		else{
			System.out.println("FALSE");
		}
		if(age > 20 & age <30){
			System.out.println("ok100");
        // && 与 & 的区别
		
	    }
	    int a = 4;
		int b = 9;
		// 对于&&短路与而言，如果第一个条件为false，则后面的条件不在判断
		// 对于&逻辑与而言，如果第一个条件为false，后面的条件仍然会判断
		if(a < 50 && ++b <30){
			System.out.println("ok300");
		}
		    System.out.println("a=" + a + "b=" + b);
		 if(a > 55 & ++b <30){
		 	System.out.println("ok300");
		 }
		 System.out.println("a=" + a + "b=" + b);
	}
 }