import java.util.Scanner;
public class if_02{
	public static void main(String[] args) {
		// Scanner myScanner = new Scanner(System.in);
		// System.out.println("�������Լ�����ʵ����");
		// int age = myScanner.nextInt();
		// if (age > 18){
		// 	System.out.println("��Ҫ�е��Լ��ķ�������");

		// }
		// else{
		// 	System.out.println("δ���꣬��Ҫ���Ҹ���");
		// }
		// System.out.println("��������");
		
		// ��ϰ1
		// double a = 25;
		// double  b = 12;
		// if(a > 10 && b<20){
		// 	double c = a + b;
		// 	System.out.println("�������ĺ�="+c);
		// }

		//��ϰ2
		// int c = 15;
		// int d = 10;
		// int e = c + d;
		// if(e % 3 == 0 && e % 5 == 0){
		// 	System.out.println("���Ľ��Ϊ���Ա�����");
		// }
		// else{
		// 	System.out.println("���Ľ�����ܱ�����");
	 //  	}
		// ��ϰ��
		// �ж�һ������Ƿ�Ϊ���꣬����������Ƿ�������Ķ���֮һ
		// (1):����ܱ�4�����������ܱ�100����
		// (2)�ܱ�400����
		int year = 2020;
		if((year % 4 == 0 && year % 100 !=0)|| year % 400==0){
			System.out.println("���Ľ��������");
		}
		else{
			System.out.println("���Ľ����������");
		}
	}
} 