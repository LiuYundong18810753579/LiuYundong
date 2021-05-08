public class Yanhui  {
	public static void main(String[] args) {
		int arr[][] = new int[10][];
		for (int i =0;i < arr.length ;i++) {
			arr[i] = new int[i+1]; //是为了给每个一维数组开辟新空间
			for (int j = 0;j < i+1 ;j++ ) {
			
			    if (j==0 || j == arr[i].length-1) {
			    	arr[i][j] = 1;
			    	
			    }
			    else{
			    	arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
			    }
			}	
		}
		for (int i=0;i < arr.length ;i++ ) {
			for (int j =0;j <arr[i].length ;j++ ) {
				System.out.print(arr[i][j]+" ");
				
			}
		System.out.println("\n");	
		}
	}
	
}