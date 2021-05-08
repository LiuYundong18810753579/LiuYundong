import java.util.Scanner;
public class if_03{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("输入马保国的芝麻信用分");
		int score = myScanner.nextInt();
	if(score<=100 && score>=0){
		if(score == 100){
			System.out.println("信用极好");

		}
		else if (score>80 && score<=99) {   //注意这里只能用&& ，而不能连等
			System.out.println("信用优秀");	
		}
		else if (score>= 60 && score<=80) {
			System.out.println("信用一般");
		}
		else{
			System.out.println("信用不及格");
		}
	}
	else{
		System.out.println("输入的数据有错误，请重新输入");
	}
	}
}