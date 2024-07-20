public class TypeCasting {
    public static void main(String[] args) {
        char ch1 = 'A';

//		Implicit type conversion happen here and unicode value is assigned to int type
        int ch = ch1;

        System.out.println("ch1: " + ch1 + "\nch: " + ch);

//		Implicit conversions from lower to bigger size
        int x = 100;
        long y = x;
        float z = y;

        System.out.println("x(int): " + x + "\ny(long): " + y + "\nz(float): " + z);

        double pie = 3.14d;

//      This will generate error for lossy conversion. Implicit conversion will not take place
//        int pieInt = pie;
// 		Explicit conversion in case of higher to low
        int pieInt = (int)pie;
        char ch2 = (char)++ch;

        System.out.println("pie(double): " + pie + "\npieInt(int): " + pieInt + "\nch2(char): " + ch2);

        byte byt = 127;
        System.out.println((byte)(byt+1));
    }
}
