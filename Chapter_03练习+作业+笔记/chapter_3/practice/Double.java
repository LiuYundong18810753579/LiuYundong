public class Double{
	public static void main(String[] args) {
		double a = 2.7;
		double b = 8.1 / 3;
		//System.out.println(a);
		//System.out.println(b);
		System.out.println(a - b);
		if(Math.abs(a - b) < 0.0001){
			System.out.println("��ֵ�ǳ�С�����ҹ涨�ķ�Χ֮��");
		}
        //��ʾchar�Ļ���ʹ��
        char c1 = 'a'; //char�����Ͼ���һ������
        char c2 = 97;
         //һ����ݼ� crtl + shift + d,���Ը��ƹ�����һ��
         //crtl + shift + k ����ɾ����ǰ��
        System.out.println(c1);
        System.out.println(c2);
        System.out.println((int)c1);
        //�жϳɼ��Ƿ�ͨ���İ���
        boolean ispass = true;
        if(ispass == true){
        	System.out.println("����ͨ������ϲ");
        }
        else{
        	System.out.println("����û��ͨ��");
        }

	}
} 