public class method_02{
	// 编写一个main方法
	public static void main(String[] args) {
	// 请遍历一个数组，输出数组的各个元素值
	int map[][] = {{0,0,1},{1,1,1},{1,1,3}};
	// 传统的方法可以直接进行遍历 
	// 但是如果多次进行输出呢？？？，会很麻烦


	// 使用方法完成输出
	Mytool tool = new Mytool();
	tool.printArr(map);

	System.out.println("==========");

    tool.printArr(map);

	}
}

// 把输出的功能写到一个类的方法中，然后调用该方法即可

class Mytool{
	//编写一个方法，接收一个二维数组
	public void printArr(int[][] map){
		// 进行遍历数组的操作
		for (int i = 0;i<map.length ;i++ ) {
			for (int j=0;j<map[i].length ;j++ ) {
				System.out.print(map[i][j] + " ");
				
			}
			System.out.print("\n");
			
		}

	}

}