import java.util.Scanner;
public class if_03{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("����������֥�����÷�");
		int score = myScanner.nextInt();
	if(score<=100 && score>=0){
		if(score == 100){
			System.out.println("���ü���");

		}
		else if (score>80 && score<=99) {   //ע������ֻ����&& ������������
			System.out.println("��������");	
		}
		else if (score>= 60 && score<=80) {
			System.out.println("����һ��");
		}
		else{
			System.out.println("���ò�����");
		}
	}
	else{
		System.out.println("����������д�������������");
	}
	}
}