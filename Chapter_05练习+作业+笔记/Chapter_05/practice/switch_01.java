import java.util.Scanner;
public class switch_01{
	public static void main(String[] args) {
		// ��дһ�����򣬸ó�����Խ���һ���ַ�
		// a��ʾ����һ��b��ʾ���ڶ�
		// �����û�����Ϣ��ʾ��������Ϣ
	Scanner myScanner = new Scanner(System.in);
	System.out.println("������һ���ַ���a-g֮��");
	char zifu = myScanner.next().charAt(0);
	switch(zifu){
		case 'a':
		    System.out.println("��������һ");
		    break;
		case 'b':
		    System.out.println("�������ڶ�");
		    break;
        case 'c':
		    System.out.println("����������");
		    break;
		default:
		    System.out.println("û��ƥ���");
	}
	System.out.println("�������");
	}
}