import java.util.Scanner;
public class Break_01{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		String name = " ";
		String passwd = " ";
		int change = 3; // һ�������λ���
	    for (int i=1;i<=3 ;i++ ) {
	    	System.out.println("�������û���");
	    	name = myScanner.next();
	    	System.out.println("����������");
	    	passwd = myScanner.next();
	    	// ע��һ���ַ����ıȽ�
	    	if ("����".equals(name) && "666".equals(passwd)){
	    		System.out.println("��¼�ɹ�");
	    		break;	
	    	}
	    	else{
	    		change = change -1;
	    		System.out.println("��ʣ��"+change+"�λ���");
	    	}

	    }
 

	}
}