public class TwoDimensional{
	public static void main(String[] args) {
		/*
        ���ö�ά�����������ͼ��
          00000
          00100
          02030
          00000
		*/
       // ����һ����ά���� [][]
       // ԭ����һά�����ÿ��Ԫ����һά���飬�͹��ɶ�ά����


       int arr[][] = {{0,0,1},{0,0,1},{0,0,1}};
       // �����άͼ��
       for (int i =0;i<arr.length ;i++ ) {
       	// ������ά�����ÿ��Ԫ�أ����飩
       	// arr[i].length �õ���Ӧ������ĳ���
       	  for (int j =0;j< arr[i].length ;j++ ) {
       	  	System.out.print(arr[i][j] + " ");
       	  	
       	  }
       	  System.out.println("\n");
       }

	}
}