public class method_02{
	// ��дһ��main����
	public static void main(String[] args) {
	// �����һ�����飬�������ĸ���Ԫ��ֵ
	int map[][] = {{0,0,1},{1,1,1},{1,1,3}};
	// ��ͳ�ķ�������ֱ�ӽ��б��� 
	// ���������ν�������أ�����������鷳


	// ʹ�÷���������
	Mytool tool = new Mytool();
	tool.printArr(map);

	System.out.println("==========");

    tool.printArr(map);

	}
}

// ������Ĺ���д��һ����ķ����У�Ȼ����ø÷�������

class Mytool{
	//��дһ������������һ����ά����
	public void printArr(int[][] map){
		// ���б�������Ĳ���
		for (int i = 0;i<map.length ;i++ ) {
			for (int j=0;j<map[i].length ;j++ ) {
				System.out.print(map[i][j] + " ");
				
			}
			System.out.print("\n");
			
		}

	}

}