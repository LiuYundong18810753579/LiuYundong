public class ArrayReverse{
	// ����ķ�ת
	// �Լ��Ľ���˼· ����ֵ�ķ�ʽ
	public static void main(String[] args) {
		// int arry1[] = {11, 22, 33, 44, 55, 66};
		// int arry2[] = new int[arry1.length];
		// for (int i = 5; i>=0 ;i--) {
		// 	arry2[arry1.length-1 - i] = arry1[i];
  //           System.out.print(arry2[arry1.length-1-i]+"\t");
		// }
		int arr[] = {66, 55, 44, 33, 22, 11};
	// ��ʦ�Ľ���˼·
	// �� arr[0] ��arr[5] ����
	// �� arr[1] ��arr[4] ����
	// �� arr[2] ��arr[3] ����
	// һ������ 3 �Σ� 
       int temp = 0;
       for (i=0;i<=arr.length/3 ;i++ ) {
       	   temp = arr[arr.length-1-i];
       	   arr[arr.length-1-i] = arr[i];
       	   arr[i] = temp;
       	
   }
	}

}