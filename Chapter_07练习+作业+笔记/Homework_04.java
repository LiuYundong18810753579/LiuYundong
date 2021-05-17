package Chapter_07;

public class Homework_04 {
    public static void main(String[] args) {
        A03 d = new A03();
        int arr1[] = { 1, 2, 3, 4, 8, 10 };
        int arr2[] = new int[arr1.length];
        d.copyArr(arr1, arr2);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

    }
}

class A03 {
    public void copyArr(int arr1[], int arr2[]) {
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];

        }
    }
}
