import java.util.Scanner;
public class ArrayAdd{
	public static void main(String[] args) {
	int arr[] = {1, 2, 3};
    // ʵ�ֶ�̬�����������
    // ����һ��Scanner���Խ����û�������
	// ��Ϊ�û�ʲôʱ���˳������ף�ʹ��do-while + break ������
	Scanner myScanner = new Scanner(System.in);
	do{
        int arrNew[] = new int[arr.length+1];
        for (int i =0;i < arr.length ;i++ ) {
    	    arrNew[i] = arr[i];
         }
          System.out.println("��������Ҫ��ӵ�Ԫ��");
        int  num = myScanner.nextInt();
        // ��Ϊ�����Ϊint���ͣ�����Ӧ����nextInt()
        arrNew[arrNew.length - 1] = num;
        arr = arrNew;
        System.out.println("=====arr���ݺ�����=====");
        for (int i = 0;i < arr.length ;i++ ) {
    	    System.out.print(arr[i] + "\t");
          }
        System.out.println("�Ƿ������� y/n");
        char key = myScanner.next().charAt(0);
        if(key == 'n'){ //�������n�����˳�
        	break;
        }
   }while(true); 
   System.out.println("�˳����");
	}

     
}    