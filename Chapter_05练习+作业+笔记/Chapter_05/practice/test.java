public class test{
	public static void main(String[] args) {
		// for (int i= 1;i<=8 ;i++ ) {
			
	 //        System.out.println(Math.random());

			
		// }
		// ����break��ʹ��
		// for (int i=1; i<10; i++) {
		// 	if(i==3){
		// 		break;
		// 	}
		// 	System.out.println("i="+i);
			
		// }
		// break����ϰ
		int sum = 0;
		int j = 0;
		for (int i= 1;i<=100 ; i++) {
			sum +=i;
			j++;
			if(sum > 20){
				break;
			}
		}
		System.out.println("��һ�δ���20�ĵ�ǰ��Ϊ=" + j);	
	}
} 