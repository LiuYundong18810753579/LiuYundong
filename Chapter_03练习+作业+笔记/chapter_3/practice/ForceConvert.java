public class ForceConvert{
	// ��дһ��main������
	public static void main(String[] args) {
		
          //ǿ�����͵�ת��
		  int n1 = (int)1.9;
		  System.out.println("n1=" + n1); //���n1 = 1
		  /*ǿת����ֻ���������Ĳ�������Ч��������ʹ��С����
		 ��������ȼ� */
          // int x = (int)10*3.5+6*1.5 �Ǵ����
		 int x = (int)(10*3.5+6*1.5);
		 System.out.println(x);

		 //
		 char c1 = 100; //ok
		 int m = 100; // ok 
		 char c3 = (char)m; //ok
		 System.out.println(c3); // 100��Ӧ���ַ���d ����ACSII��������
		 


	}
}