 public class array_01{
 	public static void main(String[] args) {
 		// ����һ������
 		// double[] ��ʾ��double ���͵����飬hensΪ��������
 		// �������α�ʾ��һ��Ԫ��
 		double hens[] = {3, 5, 1, 3.4, 2, 50};

 		// ��������õ����������Ԫ�صĺͣ�ʹ��for
 		// 1.����ͨ��hens[i] �����������Ԫ��
 		// i�Ǵ�0��ʼ��ŵģ���������
 		//2. 2
 		double total = 0;
 		for (int i= 0;i<6 ;i++ ) {
 			// System.out.println("��" + (i+1)+"��Ԫ�صĺ�"+ hens[i]);
            total += hens[i];
 			
 		}
 		System.out.println(hens.length);
 		System.out.println(total);
 	}
 }