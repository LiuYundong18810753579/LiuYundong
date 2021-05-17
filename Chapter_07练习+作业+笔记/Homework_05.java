package Chapter_07;

public class Homework_05 {
    public static void main(String[] args) {
        Cicle11 e = new Cicle11(20);
        System.out.println("圆的周长为" + e.zhouchang());
        System.out.println("圆的面积为" + e.mianji());
    }
}

class Cicle11 {
    public double rand;

    public Cicle11(double rand) {
        this.rand = rand;
    }

    public double zhouchang() {
        double zhou = 2 * 3.14 * rand;
        return zhou;
    }

    public double mianji() {
        double mianji = 3.14 * rand * rand;
        return mianji;
    }

}
