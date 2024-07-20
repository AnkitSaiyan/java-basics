public class Addition {
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        Addition a1 = new Addition();
        int sum = a1.add(num1, num2);

        System.out.print(sum);
    }
}
