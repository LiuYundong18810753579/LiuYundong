import java.util.Scanner;
public class SeqSearch{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("�������1-5֮���һ����");
		int num = myScanner.nextInt();
		int arr[] = {1, 2, 3, 4, 5};
	    // һ��С����,�Լ���ʱû�������
	    int index = -100;
		for (int i =0 ;i<arr.length ;i++ ) {
			if (num == arr[i]) {
			    index = i;
				System.out.println("����������Ӧ��ֵ��֮ƥ��"+ index);
                break;// ��ǰ�˳�
			}
		}
		if (index == -100) {
			System.out.println("�Ҳ���������");
				
			}	
		
	}
}