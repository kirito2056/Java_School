import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam01 {

    public static void main(String args[]) throws IOException {
        new Exam01().processMethod();
    }

    private void processMethod() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("숫자를 입력하세요");
        int num01 = Integer.parseInt((in.readLine()));
        int sum = 0;

        while(num01 > 10) {
            for ( int i = 1000000000 ; i < 10 ; i /= 10) {
                sum += num01 / i;
                System.out.println(sum);
            }
        }

    }
}
