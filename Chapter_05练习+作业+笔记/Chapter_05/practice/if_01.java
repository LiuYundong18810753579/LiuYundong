// if �Ŀ�������
// ��дһ�����򣬿��������˵����䣬�����ͬ־������Ĵ���18�꣬
// ����������������18��Ҫ���Լ�����Ϊ����
// ˼·����
// 1.������������䣬Ӧ�ö���һ��Scanner����
// 2.�����䱣�浽һ������
// 3.�жϣ�Ȼ�����
import java.util.Scanner; //����Scanner�İ�
public class if_01{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("����������");
		int year  = myScanner.nextInt();
		if(year >= 18){
			System.out.println("���������18��Ҫ���Լ�����Ϊ����");
		}
		
		System.out.println("�������...");
	}
}