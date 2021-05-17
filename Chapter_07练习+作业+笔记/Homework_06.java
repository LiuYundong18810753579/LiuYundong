package Chapter_07;

public class Homework_06 {
    public static void main(String[] args) {
        Cale f = new Cale(5.8, 3.9);
        System.out.println("两个数的和为" + f.sum());
        System.out.println("两个数的差为" + f.cha());
    }
}

class Cale {
    double a1;
    double a2;

    public Cale(double a1, double a2) {
        this.a1 = a1;
        this.a2 = a2;
    }

    public double sum() {
        double sum = a1 + a2;
        return sum;
    }

    public double cha() {
        double cha = a1 - a2;
        return cha;
    }
}
