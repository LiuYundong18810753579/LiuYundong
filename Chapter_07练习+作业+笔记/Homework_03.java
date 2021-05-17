package Chapter_07;

public class Homework_03 {
    public static void main(String[] args) {
        book c = new book();
        System.out.println(c.updatePrice(70));
    }
}

class book {
    public double updatePrice(double bookprice) {
        double bookchange = bookprice;
        if (bookprice > 150) {
            System.out.println("该书的价格为");
            bookchange = 150;
        } else if (bookprice > 100 && bookprice <= 150) {
            System.out.println("该书的价格为");
            bookchange = 100;
        }
        if (bookchange == bookprice) {
            System.out.println("价格未达到折扣值");
        }
        return bookchange;
    }

}
