public class ArrayCopy{
	public static void main(String[] args) {
		int arry1[] = {2, 55, 88};
		// ����һ���µ����ݿռ䣬����arry2
		int arry2[] = new int[arry1.length];
		// ����arry1����ֵ������arry2
		for (int i= 0;i<arry1.length ;i++ ) {
			arry2[i] = arry1[i];
			System.out.println(arry2[i]);
			
		}
		System.out.println("���ݵ��޸�");
		arry2[0] = 999;
		for (int i= 0;i<arry1.length ;i++ ) {
			System.out.println(arry1[i]);
			
		}
		for (int i= 0;i<arry1.length ;i++ ) {
			System.out.println(arry2[i]);
			
		}

	}
}