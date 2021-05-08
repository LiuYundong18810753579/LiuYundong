public class for_01{
	public static void main(String[] args) {
		//使用for循环进行简单的操作
		int i = 1;
		for (;i <= 10 ; i++) {
			System.out.println("好好学Java，毕业30万");
		}
		System.out.println(i);
		// 补充：死循环  ctrl + c 退出死循环
		for (; ; ) {  //就表示一个无限循环
			System.out.println("ok~");
		}
	}
}