public class array_05{
	public static void main(String[] args) {
		//�����ĸ�ֵ
		int a = 100;
		int b = a;
		b = 50;
		System.out.println(b);
		System.out.println("-------------------------------");
		// ����ĸ�ֵ�������ô��ݡ���һ���ı仯��Ӱ���һ���ı仯
		int arr1[] = {1,2,3};
		int arr2[] = arr1;
		arr2[0] = 100;
		for (int i = 0; i < arr1.length; i++ ) {
			System.out.println(arr1[i]);
			
		}
	}
} 