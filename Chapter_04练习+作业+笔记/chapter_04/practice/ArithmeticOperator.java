/**
* 演示算数运算符的使用
*/
public class ArithmeticOperator{
	// 编写一个main方法
	public static void main(String[] args) {
	    // 使用
	    System.out.println(10 / 4); //从数学角度看是2.5，java中是2
	    System.out.println(10.0 / 4); //java中是2.5
	    double d = 10 / 4; //java中是2， 2=>2.0
	    System.out.println(d); //java中是2.5
        // 注释的快捷键 crtl + / ,，再按一次就会取消
     
        // % 取模，取余数
        // % 的本质其实！！！：a % b = a - a / b * b
        System.out.println(10 % 3); // 1
        System.out.println(-10 % 3); // -1  
        System.out.println(10 % -3); // 1  带公式就行了
        System.out.println(-10 % -3); // -1  带公式就行了
        
        // ++ 的使用
        // 
        int i = 10;
        i++; //自增 等价于 i = i +1; 11
        ++i; //自增 等价于 i = i +1; 12

        /**
        作为表达式使用：
        前++： ++i先自增后赋值
        后++： i++先赋值后自增
        */
        int k = 9;
        int j = ++k;
        System.out.println("j="+j + "k="+k);



	}   
}