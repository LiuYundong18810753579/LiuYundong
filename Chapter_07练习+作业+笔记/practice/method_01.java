public class method_01{
	public static void main(String[] args) {
		
		// ����д�ú󣬲�ȥ���ã�Ҳ�������
		// �ȴ���һ�����󣬵��ü���
        person per1 = new person();
        per1.speak(); // ���ø÷���
        per1.calo2(1000);
        // per1.getsum(50, 50); // �����˷�����ͬʱ��ֵ����ʱ����
                             //Ҫ����һ��ֵ��������
        int returnres = per1.getsum(50, 50);
        System.out.println(returnres);


	}
}

class person{
	// ��Ա�����Ŀ�������
	// ����
	String name;
	int age;
	// ���һ�����������"����һ������"
	// public �������ǹ����� 
	// void ��ʾ����û�з���ֵ
	// speak(): speak�Ƿ����������������β�
	// {}����һ��������
	public void speak(){
		System.out.println("����һ������");

	}
	public void calo2(int n){
		int sum = 0;
		for (int i =0; i<=n;i++ ) {
			sum += i;
		}
		System.out.println("����Ľ��Ϊ"+sum);
	}
	// �����������ĺ�
	// 1public �������ǹ�����
	// 2.int ��ʾ����ִ�к󣬷���һ�� int ֵ
	// 3.getsum ������
	// 4.(int num1, int num2) �β��б�2���β�
	// 5. return ����� res��ֵ ����
	public int  getsum(int num1, int num2){
		int res = num1 + num2;
		return res; 

	}


}