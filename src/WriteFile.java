import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteFile {
    public static void main(String[] args) {
        writeUsingBufferedWriter();
        // Print Writer can be used to write formatted text
        writeUsingPrintWriter();
    }

    private static void writeUsingPrintWriter() {
        try {
            FileWriter fw = new FileWriter("File.txt");
            PrintWriter pw = new PrintWriter(fw);

            pw.printf("My name is %s and Age is %d", "Ankit Kumar", 27);
            System.out.println("File written successfully");

            pw.close();
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void writeUsingBufferedWriter() {
        try {
            FileWriter fw = new FileWriter("File.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            String str = "Hello 1";
            bw.write(str);
            System.out.println("File written successfully");

            bw.close();
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
