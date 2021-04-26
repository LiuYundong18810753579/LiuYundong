public class Double{
	public static void main(String[] args) {
		double a = 2.7;
		double b = 8.1 / 3;
		//System.out.println(a);
		//System.out.println(b);
		System.out.println(a - b);
		if(Math.abs(a - b) < 0.0001){
			System.out.println("差值非常小，到我规定的范围之内");
		}
        //演示char的基本使用
        char c1 = 'a'; //char本质上就是一个整数
        char c2 = 97;
         //一个快捷键 crtl + shift + d,可以复制光标的那一行
         //crtl + shift + k 可以删除当前行
        System.out.println(c1);
        System.out.println(c2);
        System.out.println((int)c1);
        //判断成绩是否通过的案例
        boolean ispass = true;
        if(ispass == true){
        	System.out.println("考试通过，恭喜");
        }
        else{
        	System.out.println("考试没有通过");
        }

	}
} 