public class ArithmeticExercise{
	public static void main(String[] args) {
		// ÃæÊÔÌâ1.
        int i = 1;
        i = i++; // ¹æÔòÊ¹ÓÃÁÙÊ±±äÁ¿£º(1)temp=i,(2),
        // (3)i = temp
        System.out.println(i);
        int j = 1;
        j = ++j; //:(1)j=j+1(2)temp=j(3)j = temp
        System.out.println(j);
	int i1 = 15;
        int i2 = i1++;
        System.out.println("i1="+i1);
        System.out.println("i2="+i2);
        int i3 = --i1;
        System.out.print("i3="+i3);
        System.out.print("i1="+i1);




        }

}