public class Method_04{
	public static void main(String[] args) {
		// 编写一个方法copyPerson,可以复制一个Person对象，返回复制的值。克隆对象
		// 注意得到的新对象和原来的对象是两个独立的对象，只是他们的属性相同
     
     Person a = new Person();
     a.name = "jake";
     a.age = 80;

     Mytools b = new Mytools();

     Person p2 = b.copyPerson(a);


	}
}

class Person{
	String name;
	int age;
}

class Mytools{

	// 编写方法的思路
	// 1.方法的返回类型 Person
	// 2.方法的名字 copyPerson
	// 3.方法的形参(person p)
	public Person copyPerson(Person p){
		// 创建一个新对象
		Person p2 = new Person();
		p2.name = p.name;
		p2.age = p.age;

		return p2;
	}

}