public class Exercises{
	public static void main(String[] args) {
    AA a = new AA();
    // ��Ϊ�漰��return����ôһ����Ҫһ��ֵ�����գ�������
    boolean  b =  a.Panduan(8);
    System.out.println(b);
		
	}
}



class AA{
	public boolean Panduan(int n){
		// if (n % 2 ==0) {
		// 	return true;
			
		// }
		// else{
		// 	return false;
		// }
		// �ȼ���һ����Ԫ�����

		return n % 2 == 0;
	}
}