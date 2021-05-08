public class Homework_01{
	public static void main(String[] args) {
		double money = 100000;
		int i = 0;
		while(true){  //无限循环
			if (money>50000) {
				money = money-money*0.05;
				i++;
			}
			else if (money<=50000) {
				if (money>1000) {
					money = money - 1000;
				i++;
				}
				else{
					System.out.println("100000可以经过"+ i +"路口");
					break;
				}	
			}	
		}
		System.out.println(money);
	}
}