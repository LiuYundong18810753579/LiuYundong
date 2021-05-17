package Chapter_07;

public class Homework_02 {
    public static void main(String[] args) {
        A02 b = new A02();
        String[] arr = { "1", "2", "3" };
        String c = "3";
        System.out.println(b.find(arr, c));
    }
}

class A02 {
    public int find(String arr[], String b) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(b)) {
                index = i;
            }
        }
        if (index == -1) {
            System.out.println("该字符串不在数组中");
        }
        return index;

    }
}