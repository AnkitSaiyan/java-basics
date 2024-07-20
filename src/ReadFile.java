import java.io.*;
import java.nio.charset.StandardCharsets;

public class ReadFile {
    public static void main(String[] args) {
        readFileWithFileInputStream();
    }

    private static void readFileWithFileInputStream() {
        try {
            // Get the current directory
            System.out.println(System.getProperty("user.dir"));

            // Reading a file without unicode characters
            FileInputStream fis = new FileInputStream("./TextFile.txt");

            StringBuilder text = new StringBuilder();
            int i = fis.read();
            while (i != -1) {
                text.append((char) i);
                i = fis.read();
            }
            System.out.println("Text from File: " + text);

            // Reading a file with UNICODE characters
            fis = new FileInputStream("UnicodeTextFile.txt");
            InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
            BufferedReader br = new BufferedReader(isr);

            i = br.read();
            text = new StringBuilder();
            while (i != -1) {
                text.append((char) i);
                i = br.read();
            }
            System.out.println("Text from File: " + text);

            br.close();
            isr.close();
            fis.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
