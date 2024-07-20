public class DataTypes {
    public static void main(String[] args) {
        int x = 15;
        float y = 3.14f;

        System.out.println("x is " + x);
        System.out.println("y is " + y);

        float sum = x + y;
        System.out.println("Sum of x and y is: " + sum);

        byte b = 126;

        System.out.println("b is " + b);

        b++;
        System.out.println("b is " + b);

        // It should overflow here because range is [-128, 128)
        b++;
        System.out.println("b is " + b);

        // It should start looping back
        b++;
        System.out.println("b is " + b);

        char ch = 'A';

        System.out.println("ch is " + ch);
        // it should increase the ASCII value
        ch++;
        System.out.println("ch is " + ch);

        // Number String Arithmetic
        System.out.println(9 + 10 + "8");
    }
}
