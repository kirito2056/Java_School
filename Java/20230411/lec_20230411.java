import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lec_20230411 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String value = bufferedReader.readLine();
        char ch;
        boolean isNumber = true;

        int small = 0;
        int big = 0;
        int num = 0;

        for ( int i = 0 ; i < value.length() ; i++) {
            ch = value.charAt(i);

            if (( 'a' <= ch && ch <= 'z' ) || ( 'A' <= ch && ch <= 'Z' )) {
                if ( 'a' <= ch && ch <= 'z') small++;
                else if ( 'A' <= ch && ch <= 'Z') big++;

                isNumber = false;
            }
            else {
                num++;
            }
        }

        if ( isNumber ) {
            System.out.println(value + "는 숫자입니다");
        }
        else {
            System.out.println(value + "는 숫자가 아닙니다");
            System.out.println(small + "개의 소문자와");
            System.out.println(big + "개의 대문자와");
            System.out.println(num + "개의 숫자가 있습니다");
        }
    }
}