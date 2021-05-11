public class Exercises{
	public static void main(String[] args) {
    AA a = new AA();
    // 因为涉及到return，那么一定需要一个值来接收！！！！
    boolean  b =  a.Panduan(8);
    System.out.println(b);
		
	}
}



class AA{
	public boolean Panduan(int n){
		// if (n % 2 ==0) {
		// 	return true;
			
		// }
		// else{
		// 	return false;
		// }
		// 等价于一个三元运算符

		return n % 2 == 0;
	}
}