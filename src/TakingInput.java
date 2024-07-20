import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        System.out.println("\nTaking input with Buffered Reader!!");
        inputWithBufferedReader();
        System.out.println("\nTaking input with Scanner!!");
        inputWithScanner();
    }

    private static void inputWithScanner() {
        Scanner sc = new Scanner(System.in);

        // reading a string
        System.out.println("Please enter a string: ");
        sc.nextLine();
        String str = sc.nextLine();
        System.out.println("You have entered: " + str);

        // reading a float
        System.out.println("Please enter a float value: ");
        float f = sc.nextFloat();
        System.out.println("You have entered: " + f);

        // reading a integer
        System.out.println("Please enter an integer value: ");
        int i = sc.nextInt();
        System.out.println("You have entered: " + i);

        sc.close();
    }

    private static void inputWithBufferedReader() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            // Reading a String
            System.out.println("Enter a string: ");
            String str = br.readLine();
            System.out.println("You have entered: " + str);

            br.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
