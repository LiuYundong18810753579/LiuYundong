public class AssignOperator{
	public static void main(String[] args) {
		
		int n1 =10 ;
		n1  += 4; // n1 = n1 + 4
		System.out.println(n1); // 14


    // ���ϸ�ֵ��������������ת��
		byte b = 3;
		b += 2;  // ���Զ����� b = (byte)(b + 2)

    // ��Ԫ�����
		int a = 10;
		int c = 99;
		//��� 
		// 1.a > b Ϊflase
		// 2.����b--���ȷ���b��ֵ��Ȼ����b-1
		// ���صĽ��Ϊ99
		int result = a > c? a++ : c--;
		System.out.println("result=" + result);
	}
}