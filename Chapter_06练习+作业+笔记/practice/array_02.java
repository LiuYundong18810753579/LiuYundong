import java.util.Scanner;
public class array_02{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		// �ȴ���һ������
		double score[];
		score = new double[5];
		// ����ѭ������
		for (int i = 0;i < score.length ;i++ ) {
			System.out.println("�������"+ (i+1)+ "����");
			score[i] = myScanner.nextDouble();	
		}
		// �������飬����ѭ�����s
		System.out.println("��ǰ�����Ԫ������");
		for (int i = 0 ;i <score.length ;i++ ) {
			System.out.println(score[i]);
			
		}
	}
}    