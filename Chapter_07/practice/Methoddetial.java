public class Methoddetial{
	public static void main(String[] args) {
	// һ�����������һ������ֵ��[��η��ض�����  ��������]
	AA hhaha = new AA();
	 int a[] = new int[2];
	 a = hhaha.calcul(8, 4);
	 for (int i = 0;i<a.length ;i++ ) {
	 	System.out.println(a[i]);
	 	
	 }
	}
}

class AA{
	//����һ�����������Է����������ĺ͸��������Ĳ�
	public int[] calcul(int num1, int num2){
	int arr[] = new int[2];
	arr[0] = num1 + num2;
	arr[1] = num1 - num2;
	return arr;
	

	}
}