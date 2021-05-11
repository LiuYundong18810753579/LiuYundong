 public class array_01{
 	public static void main(String[] args) {
 		// 定义一个数组
 		// double[] 表示是double 类型的数组，hens为数组名字
 		// 数字依次表示第一个元素
 		double hens[] = {3, 5, 1, 3.4, 2, 50};

 		// 遍历数组得到数组的所有元素的和，使用for
 		// 1.可以通过hens[i] 来访问数组的元素
 		// i是从0开始标号的，依次类推
 		//2. 2
 		double total = 0;
 		for (int i= 0;i<6 ;i++ ) {
 			// System.out.println("第" + (i+1)+"个元素的和"+ hens[i]);
            total += hens[i];
 			
 		}
 		System.out.println(hens.length);
 		System.out.println(total);
 	}
 }