public class for_02{
	public static void main(String[] args) {	
		int j = 0;  
		int m = 0;
		int t = 5;
		int start = 1;
		int end = 200;
		for (int i = start;i <= end ;i++ ) {  
			if (i % t == 0) {
				System.out.println(i);
				j += i;
				m++;
			}
		}
		System.out.println("�ܺ�=" + j);
		System.out.println("�ܵĸ���Ϊ=" + m);
	}
} 