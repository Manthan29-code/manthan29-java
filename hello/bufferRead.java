import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bufferRead {
    public static void main(String[] args) {
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        try {
            String input = reader.readLine();
            System.out.println("Your input = " + input);
        }catch(IOException e)
        {
                e.printStackTrace();
        }
    }
}
