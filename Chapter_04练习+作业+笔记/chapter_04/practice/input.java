import  java.util.Scanner; //
public class input{
	public static void main(String[] args) {
		// ��ʾ�����û�������
		//����
		// Scanner ��ʾ�򵥵��ı�ɨ������java.unil ��
		// 1.����Scanner�����ڵİ�
		// 2.����Scanner ����,new ����һ������
	     Scanner  myScanner  = new  Scanner(System.in);

	     System.out.println("����������");
	     String name = myScanner.next();
	     System.out.println("����������");
	     int age = myScanner.nextInt();
	     System.out.println("�����빤��");
	     Double sal = myScanner.nextDouble();
	     System.out.println("name="+name+"����="+age+"����="+sal);


	}
}