public class test{
	public static void main(String[] args) {
		// for (int i= 1;i<=8 ;i++ ) {
			
	 //        System.out.println(Math.random());

			
		// }
		// 关于break的使用
		// for (int i=1; i<10; i++) {
		// 	if(i==3){
		// 		break;
		// 	}
		// 	System.out.println("i="+i);
			
		// }
		// break的练习
		int sum = 0;
		int j = 0;
		for (int i= 1;i<=100 ; i++) {
			sum +=i;
			j++;
			if(sum > 20){
				break;
			}
		}
		System.out.println("第一次大于20的当前数为=" + j);	
	}
} 