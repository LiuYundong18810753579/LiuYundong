package Chapter_07;

public class Homework_07 {
    public static void main(String[] args) {
        Dog11 g = new Dog11("jick", '黄', 20);
        g.showinfo();
    }

}

class Dog11 {
    String name;
    char colour;
    int age;

    public Dog11(String name, char colour, int age) {
        this.name = name;
        this.colour = colour;
        this.age = age;
    }

    public void showinfo() {
        System.out.println("姓名为" + name + "\t" + "颜色为" + colour + "\t" + "年龄为" + age);
    }

}