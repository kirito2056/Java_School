import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lec_20230321 {
    public static void main(String args[]) throws IOException {
        e01();
    }

    static void e01() throws IOException {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("입력");
            String size = in.readLine();
            int big = 0;
            int small = 0;
            int number = 0;

            for (int i = 0; i < size.length(); i++) {
                if ('A' <= size.charAt(i) && size.charAt(i) <= 'Z') {
                    big++;
                } else if ('a' <= size.charAt(i) && size.charAt(i) <= 'z') {
                    small++;
                } else if ('0' <= size.charAt(i) && size.charAt(i) <= '9') {
                    number++;
                } else {
                    System.out.println("대문자, 소문자, 숫자가 아닌 " + size.charAt(i) + "라는 문자를 사용하였습니다");
                }
            }
            System.out.println("대문자는 " + big + "개이고");
            System.out.println("소문자는 " + small + "개이며");
            System.out.println("숫자는 " + number + "개이다");
        }
        catch(Exception e) {
                e.printStackTrace();
            }


    }
}