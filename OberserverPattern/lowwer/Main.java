package lowwer;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        String input = "Hello, THIS is a Test STRING!";
        
        try (InputStream in = new LowerCaseInputStream(new ByteArrayInputStream(input.getBytes()))) {
            int c;
            while ((c = in.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

