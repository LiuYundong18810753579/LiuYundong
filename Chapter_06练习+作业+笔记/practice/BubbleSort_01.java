public class BubbleSort_01{
	public static void main(String[] args) {
		// ����Ϊ�� �������

		int arr[] = {24, 69, 80, 57, 13};
		// ��һ�� �� Ŀ�꣺��������������
		for (int i = 0;i<arr.length-1 ;i++ ) {
			int temp = arr[i+1];
			if (arr[i+1] <= arr[i] ) {
				arr[i+1] = arr[i];
				arr[i] = temp;
			}

		}
		for (int i =0;i<arr.length ;i++ ) {
			System.out.print(arr[i] + "\t");
		}
		// �ڶ��� ��Ŀ�꣺�ѵڶ�������������
		System.out.println("�ڶ���չʾ");
		for (int i = 0;i<arr.length-2 ;i++ ) {
			int temp = arr[i+1];
			if (arr[i+1] <= arr[i] ) {
				arr[i+1] = arr[i];
				arr[i] = temp;
			}

		}
		for (int i =0;i<arr.length ;i++ ) {
			System.out.print(arr[i] + "\t");	
		}
		// ������ ��Ŀ�꣺�ѵ���������������
		System.out.println("������չʾ");
		for (int i = 0;i<arr.length-3 ;i++ ) {
			int temp = arr[i+1];
			if (arr[i+1] <= arr[i] ) {
				arr[i+1] = arr[i];
				arr[i] = temp;
			}

		}
		for (int i =0;i<arr.length ;i++ ) {
			System.out.print(arr[i] + "\t");	
		}
		// ������ ��Ŀ�꣺�ѵ��Ĵ�����������
		System.out.println("������չʾ");
		for (int i = 0;i<arr.length-4 ;i++ ) {
			int temp = arr[i+1];
			if (arr[i+1] <= arr[i] ) {
				arr[i+1] = arr[i];
				arr[i] = temp;
			}

		}
		for (int i =0;i<arr.length ;i++ ) {
			System.out.print(arr[i] + "\t");	
		}
	}

}