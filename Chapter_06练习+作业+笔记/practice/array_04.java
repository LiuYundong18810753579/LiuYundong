public class array_04{
	public static void main(String[] args) {
		// char arry[] = new char[26];
		// for (int  i = 0;i <  arry.length ;i++ ) {
		// 	arry[i] = (char)('A' + i);	// 'A' + i ��int����
		// }
		// for (int i = 0; i< arry.length; i++) {
		// 	System.out.print(arry[i]+" ");
			
		// }

		// �Լ��Ľ���˼·
		// int array[] = {4, 1000, 9, 10, 23};
  //       int a = 0;
  //       int b = 0;
		// for (int i = 0;i < array.length ;i++ ) {
			
		// 	if (array[i] >= a) {
		// 		a = array[i];
		// 		b = i;
				
		// 	}
	 //     else{
	 //     	   a = a;
	    
	 //     }
		// }
		// System.out.println("����ֵΪ=" + a);
		// System.out.println("��Ӧ������Ϊ="+ b);

		//��ʦ�Ľ���˼·
		int arr[] = {0, 4, -5, 88};
		int max = arr[0];
		int maxindex = 0;
		for (int i = 1;i < arr.length ; i++) {
			if(max < arr[i]){
				max = arr[i];
				maxindex = i;
			}
			
		}
		System.out.println("����ֵΪ=" + max);
		System.out.println("��Ӧ������Ϊ="+ maxindex);
		
	}
} 