// ������ϰ
// ���绹��59��ż٣��ʣ���XX��������XX��
public class ArithmeticExercise_01{
	public static void main(String[] args) {
		int holiday = 59;
		int weeks = holiday / 7;
		int day = holiday % 7;
		System.out.println("���绹��59��ż�"+"��"+weeks+
			"��������"+day+"��");
		double huashi = 234.6;
		double sheshi = 5.0 / 9 * (huashi - 100);
		// ͬʱ������ѧ��ʽ��java���Ե����� 5.0/9
		// ������� 5/9 ���Ǵ����
		System.out.println("�����¶�" + huashi
			+ "��Ӧ�����϶�" + sheshi);
	}
}