import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lec_20230322 {

    public static void main(String args[]) {

    }

    static void answer01() throws IOException {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("첫번째 숫자 : ");
            int first = Integer.parseInt(in.readLine());
            System.out.print("두번째 숫자 : ");
            int second = Integer.parseInt(in.readLine());

            for ( int i = first ; i < second ; i++) {

            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
