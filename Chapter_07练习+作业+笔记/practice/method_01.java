public class method_01{
	public static void main(String[] args) {
		
		// 方法写好后，不去调用，也不会输出
		// 先创建一个对象，调用即可
        person per1 = new person();
        per1.speak(); // 调用该方法
        per1.calo2(1000);
        // per1.getsum(50, 50); // 调用了方法，同时赋值，这时候需
                             //要定义一个值用来接收
        int returnres = per1.getsum(50, 50);
        System.out.println(returnres);


	}
}

class person{
	// 成员方法的快速入门
	// 属性
	String name;
	int age;
	// 添加一个方法，输出"我是一个好人"
	// public 代表方法是公开的 
	// void 表示方法没有返回值
	// speak(): speak是方法名，（）代表形参
	// {}代表一个方法体
	public void speak(){
		System.out.println("我是一个好人");

	}
	public void calo2(int n){
		int sum = 0;
		for (int i =0; i<=n;i++ ) {
			sum += i;
		}
		System.out.println("输出的结果为"+sum);
	}
	// 计算两个数的和
	// 1public 代表方法是公开的
	// 2.int 表示方法执行后，返回一个 int 值
	// 3.getsum 方法名
	// 4.(int num1, int num2) 形参列表，2个形参
	// 5. return 代表把 res的值 返回
	public int  getsum(int num1, int num2){
		int res = num1 + num2;
		return res; 

	}


}