import java.util.Scanner;
public class if_04{
   public static void main(String[] args) {
   	Scanner myScanner = new Scanner(System.in);
   	System.out.println("���������質�����ķ���");
   	Double score = myScanner.nextDouble();
   	if (score > 8.0 ) {
   		System.out.println("�����������Ա�:�л���Ů");
        char gender = myScanner.next().charAt(0);
        if (gender == '��') {
        	System.out.println("����������");
        }
        else{ 

        	System.out.println("����Ů����");
        }
   	}
   	else{
   	   System.out.println("������˼�����ķ������ܴﵽҪ����Ե����");
   	}
   }
}