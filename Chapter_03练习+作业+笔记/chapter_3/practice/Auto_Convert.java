// �Զ�����ת��ϸ��
public class Auto_Convert{
	public static void main(String[] args) {
		int a = 'a';  /// ��סchar�ַ���ֻ�ܼ�¼�����ַ������õ�����
		double  d = 80;
		System.out.println(a);
		System.out.println(d);// �����80.0
	// �����������͵����ݻ������ʱ
	//  ϸ��2 ϵͳ�����Զ�����������ת��Ϊ���������������ͣ�Ȼ���ڽ��м���
		int n1 = 10;
		//float d1 = n1 + 1.1; ���˵�����Ǵ���ģ���Ϊ������double��
		//������㣬ϵͳ�Զ���ת��Ϊ���������������ͣ�����Ӧ����double
	    double d1 = n1 + 1.1;  //�����ǶԵ�

	    float d2 = n1 + 1.1F;  //����Ҳ����ȷ��

	     System.out.println(d1);
	     System.out.println(d2);
    // ϸ���� (byte,short)��char֮�䲻������໥��ת��
         byte b1 = 10; //byte�ķ�ΧΪ-128--127֮��
    // char c1 = b1; �Ǵ����,ԭ��������
    // ϸ��4 byte��short��char �������߿��Լ��㣬�ڼ���ʱ����ת��Ϊint����
         
          

	}
}