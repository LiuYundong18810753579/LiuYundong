package com.extends_;

// 继承机制的练习
// 采用的方法 继承+ super
public class ExtendsExercise03 {
    public static void main(String[] args) {
        PC pc = new PC("Internet", 512, "固态硬盘", "LiNing");
        // NotePad note = new NotePad("Internet", 512, "固态硬盘",'绿');
        pc.printinfo();

    }

}

class Computer {
    String CPU;
    int memeory;
    String hard;

    public Computer(String CPU, int memeory, String hard) {
        this.CPU = CPU;
        this.memeory = memeory;
        this.hard = hard;
    }

    public String getDetails() {
        return "computer的CPU为" + CPU + "\t" + "内存为" + memeory + "\t" + "硬盘为" + hard;
    }

}

class PC extends Computer {
    String brand;

    public PC(String CPU, int memeory, String hard, String brand) {
        super(CPU, memeory, hard);
        this.brand = brand;

    }

    public void printinfo() {
        System.out.println("pc信息如下");
        System.out.println(getDetails() + "\t" + "brand:" + brand);
        // 调用父类的方法
    }

}

class NotePad extends Computer {
    char colour;

    public NotePad(String CPU, int memeory, String hard, char colour) {
        super(CPU, memeory, hard);
        this.colour = colour;
    }

    public void printinfo() {
        System.out.println("Notepad信息如下");
        System.out.println(getDetails() + "brand" + colour);
    }
}
