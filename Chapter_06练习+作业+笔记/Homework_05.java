public class Homework_05  {
	public static void main(String[] args) {
		// �������10�������������浽����
     int arr[] = new int[10];
     for (int i = 0;i < arr.length ;i++ ) {
     	arr[i] = (int)(Math.random()*100) +1;
     }
     int max = 0;
     int sum = 0;
     int index = 0;
     for (int i = arr.length -1;i >=0 ;i-- ) {
     	if (max<=arr[i]) {
     	max = arr[i];
     	index = i;	
     	}
     	if (arr[i] == 8) {
     		System.out.println("��8");
     	}
     	sum += arr[i];
     	System.out.print(arr[i] + " ");
     }
     double avg = sum / arr.length;
     System.out.print("\n");
     System.out.println("ƽ��ֵ="+avg);
     System.out.println("���ֵ="+max);
     System.out.println("���ֵ��Ӧ������Ϊ="+index);



	}
	
}