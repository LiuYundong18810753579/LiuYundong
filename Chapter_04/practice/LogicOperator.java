public class LogicOperator{
	public static void main(String[] args) {
		// ||��·��  �� |�߼��� ������
		int a = 5;
		int b = 11;
		// || ��һ��Ϊ�棬��ô�������������
		//  |  ��һ��Ϊ�棬�����������Ϊ��
        if(a < 8 || b > 10){
        	System.out.println("ok100");
        }
        if(a < 8 | b > 10){
        	System.out.println("ok300");
        }
        //����(1) ||��·�������һ������Ϊtrue��
        // ��ڶ������������жϣ����ս��Ϊtrue��Ч�ʸ�
        // �߼���
	}
}