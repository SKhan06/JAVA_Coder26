package InputUser;
import java.io.*;

class BufferInput {
    public static void main(String[] args) throws IOException {
        // InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        System.out.println("You entered: " + name);

    }
}