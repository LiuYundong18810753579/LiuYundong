public class StringToBasic{
	public static void main(String[] args) {
		
		// 基本数据类型转换为String
		int a = 100;
		double b = 20.3;
		float c = 1.2F;
		String s1 = a + "";
		String s2 = b + "";
		String s3 = c + "";
		System.out.println(s1 + " " + s2 + " " + s3);
        
        // String 转换为对应的基本数据类型
        String s5 = "123";
        //会在opp 讲对象和方法的时候详细讲解
        //int num1 = Integer.parseInt(s5);
        //double num2 = Double.parseDouble(s5);
        //System.out.println(num1);
        //System.out.println(num2);
        

	}
}