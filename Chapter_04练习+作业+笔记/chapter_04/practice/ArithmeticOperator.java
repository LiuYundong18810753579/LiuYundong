/**
* ��ʾ�����������ʹ��
*/
public class ArithmeticOperator{
	// ��дһ��main����
	public static void main(String[] args) {
	    // ʹ��
	    System.out.println(10 / 4); //����ѧ�Ƕȿ���2.5��java����2
	    System.out.println(10.0 / 4); //java����2.5
	    double d = 10 / 4; //java����2�� 2=>2.0
	    System.out.println(d); //java����2.5
        // ע�͵Ŀ�ݼ� crtl + / ,���ٰ�һ�ξͻ�ȡ��
     
        // % ȡģ��ȡ����
        // % �ı�����ʵ��������a % b = a - a / b * b
        System.out.println(10 % 3); // 1
        System.out.println(-10 % 3); // -1  
        System.out.println(10 % -3); // 1  ����ʽ������
        System.out.println(-10 % -3); // -1  ����ʽ������
        
        // ++ ��ʹ��
        // 
        int i = 10;
        i++; //���� �ȼ��� i = i +1; 11
        ++i; //���� �ȼ��� i = i +1; 12

        /**
        ��Ϊ���ʽʹ�ã�
        ǰ++�� ++i��������ֵ
        ��++�� i++�ȸ�ֵ������
        */
        int k = 9;
        int j = ++k;
        System.out.println("j="+j + "k="+k);



	}   
}