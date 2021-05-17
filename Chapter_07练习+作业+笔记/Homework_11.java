package Chapter_07;

public class Homework_11 {
    public static void main(String[] args) {
        Cicle d = new Cicle();
        PassObject k = new PassObject();
        k.printAreas(d, 5);

    }
}

class Cicle {

    double radius;

    public Cicle() {

    }

    public Cicle(double radius) {
        this.radius = radius;
    }

    public double findArea() {
        double Area = Math.PI * radius * radius;
        // System.out.println("圆的面积为");
        return Area;
    }
}

class PassObject {
    public void printAreas(Cicle c, int times) {
        for (int i = 1; i <= times; i++) {
            c.radius = i;
            c.findArea();
            System.out.println(c.radius + "\t" + c.findArea());

        }

    }
}
