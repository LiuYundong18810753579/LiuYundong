public class Homework_07{
	public static void main(String[] args) {
		//输出小写的a-z以及大写的Z-A
		for (char c1 = 'a';c1<='z' ;c1++ ) {
			System.out.print(c1+ "\t");	
		}
		// 输出大写的Z-A
		for(char c2 = 'Z';c2>='A';c2--){
			System.out.print(c2 + "\t");
		}
		char d = 89;
		System.out.println(d);
	
	}
}