import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex_code {
    public ex_code() {
    }

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            int num = Integer.parseInt(bufferedReader.readLine());

            for(int i = 1; i <= 3; ++i) {
                for(int j = 1; j <= num; ++j) {
                    System.out.print("" + j + "*" + i + "=" + i * j + "\t");
                }

                System.out.println();
            }

        } catch (IOException var5) {
            throw new RuntimeException(var5);
        }
    }
}
