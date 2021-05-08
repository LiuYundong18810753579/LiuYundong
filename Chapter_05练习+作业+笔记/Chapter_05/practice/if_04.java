import java.util.Scanner;
public class if_04{
   public static void main(String[] args) {
   	Scanner myScanner = new Scanner(System.in);
   	System.out.println("请输入您歌唱比赛的分数");
   	Double score = myScanner.nextDouble();
   	if (score > 8.0 ) {
   		System.out.println("请输入您的性别:男或者女");
        char gender = myScanner.next().charAt(0);
        if (gender == '男') {
        	System.out.println("进入男生组");
        }
        else{ 

        	System.out.println("进入女生组");
        }
   	}
   	else{
   	   System.out.println("不好意思，您的分数不能达到要求：无缘决赛");
   	}
   }
}