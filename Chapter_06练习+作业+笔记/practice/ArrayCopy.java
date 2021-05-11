public class ArrayCopy{
	public static void main(String[] args) {
		int arry1[] = {2, 55, 88};
		// 开辟一个新的数据空间，赋给arry2
		int arry2[] = new int[arry1.length];
		// 遍历arry1，把值拷贝到arry2
		for (int i= 0;i<arry1.length ;i++ ) {
			arry2[i] = arry1[i];
			System.out.println(arry2[i]);
			
		}
		System.out.println("数据的修改");
		arry2[0] = 999;
		for (int i= 0;i<arry1.length ;i++ ) {
			System.out.println(arry1[i]);
			
		}
		for (int i= 0;i<arry1.length ;i++ ) {
			System.out.println(arry2[i]);
			
		}

	}
}