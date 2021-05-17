package Chapter_07;

public class Homework_10 {
    public static void main(String[] args) {

    }
}

// 充分利用构造器的复用性

class Employee {
    String name;
    char sex;
    int age;
    String proff;
    double salary;

    public Employee(String proff, double salary) {
        this.proff = proff;
        this.salary = salary;
    }

    public Employee(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public Employee() {
    }

    public Employee(String name, char sex, int age, String proff, double salary) {
        this(name, sex, age);// 使用到前面的构造器
        this.proff = proff;
        this.salary = salary;
    }
}
