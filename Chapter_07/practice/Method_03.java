public class Method_03{
	public static void main(String[] args) {
		AA a = new AA();
		a.sayok();

		
	}

}
 
class AA{
	public void f1(int n){
		System.out.println("f1���������� n ="+ n);

	}
	public void sayok(){
		f1(10);
		BB b = new  BB();
		b.v2();
		System.out.println("����ִ��sayok~~~~~~");
	}
	public void sayhello(){

	}
}


class BB{
	public void v2(){
		System.out.println("hello,��AA");
	}
}