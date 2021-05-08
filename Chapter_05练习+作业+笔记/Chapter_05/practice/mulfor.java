//多重循环
public class mulfor{
	public static void main(String[] args) {
		// for (int i = 0;i<2 ;i++ ) {
		//   for (int j = 0;j<3 ;j++ ) {
		//   	System.out.println("i="+i+"J="+j);
		  	
		//   }
			
		// }
		// 打印简单的九九乘法表
		// for (int i=1;i<10; i++) {
		// 	int n=10;
		// 	for (int j=1; j<n;j++ ) {
		// 		int c = i * j;
		// 		System.out.println(c);
		// 	}
		// 	n = n-1;
			
		// }
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i+"*"+j+"="+j*i+"	");
			}
			System.out.print("\n");
		}

	}

}