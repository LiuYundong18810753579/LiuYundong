public class Class_01{
	public static void main(String[] args) {

		person liuYundong = new person();
		liuYundong.name = "���ƶ�";
		liuYundong.age = 23;
		person per2 = liuYundong;  // liuyundong����per2
		System.out.println(liuYundong.name);
		System.out.println(liuYundong.age);
		System.out.println("============");

		System.out.println(per2.name);
		System.out.println(per2.age);

	}

}

class Cat{
	//���� 
    String name; //���Ի��߽г�Ա����
    double age;
    String cloro;
    String child[]; // Ҳ����������
}
class person{  // class c��ҪСд
	String name;
	int age;
}