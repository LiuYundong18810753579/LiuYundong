public class Practice{
	public static void main(String[] args) {
		short s = 12; // ok
	//	s = s - 9;   // ���� int-->short
		System.out.println(s);
		byte b = 10;//ok
	// b = b + 11   // ���� ���� byte-->short
		byte b = 16; //ok
		short s = 14; //ok
		// short t = s + b; // ����int --> short
	}
}