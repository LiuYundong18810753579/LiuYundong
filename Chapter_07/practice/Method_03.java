public class Method_03{
	public static void main(String[] args) {
		AA a = new AA();
		a.sayok();

		
	}

}
 
class AA{
	public void f1(int n){
		System.out.println("f1方法被调用 n ="+ n);

	}
	public void sayok(){
		f1(10);
		BB b = new  BB();
		b.v2();
		System.out.println("继续执行sayok~~~~~~");
	}
	public void sayhello(){

	}
}


class BB{
	public void v2(){
		System.out.println("hello,类AA");
	}
}