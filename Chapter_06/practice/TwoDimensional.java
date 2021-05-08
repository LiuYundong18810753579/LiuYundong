public class TwoDimensional{
	public static void main(String[] args) {
		/*
        请用二维数组输出如下图形
          00000
          00100
          02030
          00000
		*/
       // 定义一个二维数组 [][]
       // 原来的一维数组的每个元素是一维数组，就构成二维数组


       int arr[][] = {{0,0,1},{0,0,1},{0,0,1}};
       // 输出二维图形
       for (int i =0;i<arr.length ;i++ ) {
       	// 遍历二维数组的每个元素（数组）
       	// arr[i].length 得到对应的数组的长度
       	  for (int j =0;j< arr[i].length ;j++ ) {
       	  	System.out.print(arr[i][j] + " ");
       	  	
       	  }
       	  System.out.println("\n");
       }

	}
}