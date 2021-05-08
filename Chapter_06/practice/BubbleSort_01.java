public class BubbleSort_01{
	public static void main(String[] args) {
		// 画繁为简 先死后活

		int arr[] = {24, 69, 80, 57, 13};
		// 第一轮 ： 目标：把最大数放在最后
		for (int i = 0;i<arr.length-1 ;i++ ) {
			int temp = arr[i+1];
			if (arr[i+1] <= arr[i] ) {
				arr[i+1] = arr[i];
				arr[i] = temp;
			}

		}
		for (int i =0;i<arr.length ;i++ ) {
			System.out.print(arr[i] + "\t");
		}
		// 第二轮 ：目标：把第二大的数放在最后
		System.out.println("第二轮展示");
		for (int i = 0;i<arr.length-2 ;i++ ) {
			int temp = arr[i+1];
			if (arr[i+1] <= arr[i] ) {
				arr[i+1] = arr[i];
				arr[i] = temp;
			}

		}
		for (int i =0;i<arr.length ;i++ ) {
			System.out.print(arr[i] + "\t");	
		}
		// 第三轮 ：目标：把第三大的数放在最后
		System.out.println("第三轮展示");
		for (int i = 0;i<arr.length-3 ;i++ ) {
			int temp = arr[i+1];
			if (arr[i+1] <= arr[i] ) {
				arr[i+1] = arr[i];
				arr[i] = temp;
			}

		}
		for (int i =0;i<arr.length ;i++ ) {
			System.out.print(arr[i] + "\t");	
		}
		// 第四轮 ：目标：把第四大的数放在最后
		System.out.println("第四轮展示");
		for (int i = 0;i<arr.length-4 ;i++ ) {
			int temp = arr[i+1];
			if (arr[i+1] <= arr[i] ) {
				arr[i+1] = arr[i];
				arr[i] = temp;
			}

		}
		for (int i =0;i<arr.length ;i++ ) {
			System.out.print(arr[i] + "\t");	
		}
	}

}