package com.encopsulation;

import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;

public class encop_01 {

    public static void main(String[] args) {
        Person person = new Person();
        person.setname("余亚鹏hhhhhhh");
        person.setage(123);
        person.setsalary(10000);
        String a = person.info();
        System.out.println(a);
        double b = person.getsalary();
        System.out.println(b);
        Person person1 = new Person("jicky", 1000, 1000);
        System.out.println("构造器================");
        System.out.println(person1.info());

    }
}

class Person {
    public String name;
    private int age;
    private double salary;

    public Person() {
    };

    // 有三个属性的构造器
    public Person(String name, int age, double salary) {
        // 这样生成的构造器无法判断是否符合要求
        // this.name = name;
        // this.age = age;
        // this.salary = salary;

        // 应该这样做：将set方法写在构造器中
        setname(name);
        setage(age);
        setsalary(salary);
    }

    // 自己写 setxxxx和getxxxx太慢了
    public String getname() {
        return name;
    }

    public void setname(String name) {
        // 加入对数据的校验，i相当于加入了逻辑校验
        if (name.length() >= 2 && name.length() <= 6) {
            this.name = name;
        } else {
            System.out.println("名字的长度不对");
            this.name = "无名人";
        }

    }

    public int getage() {
        return age;
    }

    public void setage(int age) {
        if (age >= 1 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("年龄需要在1-120之间,给默认设置18");
            this.age = 18;

        }

    }

    public double getsalary() {
        return salary;
    }

    public void setsalary(double salary) {
        this.salary = salary;
    }

    public String info() {
        return "信息为 name = " + name + "年龄=" + age + "薪水=" + salary;

    }

}
