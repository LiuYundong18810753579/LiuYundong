import java.util.Scanner;
public class ArrayAdd{
	public static void main(String[] args) {
	int arr[] = {1, 2, 3};
    // 实现动态的数组的扩容
    // 创建一个Scanner可以接受用户的输入
	// 因为用户什么时候退出不容易，使用do-while + break 来控制
	Scanner myScanner = new Scanner(System.in);
	do{
        int arrNew[] = new int[arr.length+1];
        for (int i =0;i < arr.length ;i++ ) {
    	    arrNew[i] = arr[i];
         }
          System.out.println("请输入你要添加的元素");
        int  num = myScanner.nextInt();
        // 因为输入的为int类型，所以应该用nextInt()
        arrNew[arrNew.length - 1] = num;
        arr = arrNew;
        System.out.println("=====arr扩容后的情况=====");
        for (int i = 0;i < arr.length ;i++ ) {
    	    System.out.print(arr[i] + "\t");
          }
        System.out.println("是否继续添加 y/n");
        char key = myScanner.next().charAt(0);
        if(key == 'n'){ //如果输入n，就退出
        	break;
        }
   }while(true); 
   System.out.println("退出添加");
	}

     
}    