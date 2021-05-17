package Chapter_07;

public class Homework_01 {
    public static void main(String[] args) {
        A01 a = new A01();
        double arr[] = { 8.8, 10, 8, 4.5 };
        System.out.println(a.max(arr));
    }
}

class A01 {
    public double max(double arr[]) {
        double maxium = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxium) {
                maxium = arr[i];
            }
        }
        return maxium;
    }
}
