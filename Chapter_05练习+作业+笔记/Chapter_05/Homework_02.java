// �ж�һ�������Ƿ�Ϊˮ�ɻ���
public class Homework_02  {
	public static void main(String[] args) {
		// �ȵõ����ֵİ�λ��ʮλ����λ�ϵ����֣�ʹ��if�����ж�
	// ��λ��n / 100
	// ʮλ��n % 100 / 10
	// ��λ��n % 10
	int a = 111;
	int a1 = a / 100;
	int a2 = a % 100 /10;
	int a3 = a % 10;
	if(a == a1*a1*a1 + a2*a2*a2 + a3*a3*a3 ){
		System.out.println(a+"��ˮ�ɻ���");
	}
	else{
		System.out.println(a + "����ˮ�ɻ���");
	}
 
	}
	

}