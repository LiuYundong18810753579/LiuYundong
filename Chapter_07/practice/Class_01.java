public class Class_01{
	public static void main(String[] args) {

		person liuYundong = new person();
		liuYundong.name = "刘云栋";
		liuYundong.age = 23;
		person per2 = liuYundong;  // liuyundong赋给per2
		System.out.println(liuYundong.name);
		System.out.println(liuYundong.age);
		System.out.println("============");

		System.out.println(per2.name);
		System.out.println(per2.age);

	}

}

class Cat{
	//属性 
    String name; //属性或者叫成员变量
    double age;
    String cloro;
    String child[]; // 也可以是数组
}
class person{  // class c需要小写
	String name;
	int age;
}