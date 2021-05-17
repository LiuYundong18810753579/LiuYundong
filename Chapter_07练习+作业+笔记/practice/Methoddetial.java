public class Methoddetial{
	public static void main(String[] args) {
	// 一个方法最多有一个返回值，[如何返回多个结果  返回数组]
	AA hhaha = new AA();
	 int a[] = new int[2];
	 a = hhaha.calcul(8, 4);
	 for (int i = 0;i<a.length ;i++ ) {
	 	System.out.println(a[i]);
	 	
	 }
	}
}

class AA{
	//定义一个方法，可以返回两个数的和跟两个数的差
	public int[] calcul(int num1, int num2){
	int arr[] = new int[2];
	arr[0] = num1 + num2;
	arr[1] = num1 - num2;
	return arr;
	

	}
}