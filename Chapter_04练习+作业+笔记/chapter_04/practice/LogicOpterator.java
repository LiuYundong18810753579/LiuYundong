public class LogicOpterator{
	public static void main(String[] args) {
		// ���� && ��·�� �� & �߼��� ��ʹ�÷���
		int age = 50;
		if(age > 20 && age <30){
			System.out.println("ok100");
		}
		else{
			System.out.println("FALSE");
		}
		if(age > 20 & age <30){
			System.out.println("ok100");
        // && �� & ������
		
	    }
	    int a = 4;
		int b = 9;
		// ����&&��·����ԣ������һ������Ϊfalse�����������������ж�
		// ����&�߼�����ԣ������һ������Ϊfalse�������������Ȼ���ж�
		if(a < 50 && ++b <30){
			System.out.println("ok300");
		}
		    System.out.println("a=" + a + "b=" + b);
		 if(a > 55 & ++b <30){
		 	System.out.println("ok300");
		 }
		 System.out.println("a=" + a + "b=" + b);
	}
 }