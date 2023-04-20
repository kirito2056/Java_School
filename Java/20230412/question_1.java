import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class question_1 {

    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        boolean next = true;

        do {
            String number;

            while (true){
                System.out.println("2진수 입력 : ");
                number = bufferedReader.readLine();

                if ( number.length() > 10) System.out.println("2진수는 최대 10자리까지 입력 가능합니다");
                else break;

            }

            int how_much = 1;
            int sum = 0;
            String will_you_do;

            for ( int i = 0 ; i < number.length() ; i++) if (number.charAt(i) == '1') sum += how_much;

            System.out.println("입력한 2진수 : [" + number + "]");
            System.out.println("변경후 10진수: [" + sum + "]");
            System.out.println();
            System.out.println("계속하시겠습니까(Y, N)");
            will_you_do = bufferedReader.readLine();

            if ( will_you_do == "Y" || will_you_do == "y") next = true;
            else if ( will_you_do == "N" || will_you_do == "n") next = false;
            else System.out.println("Y / N을 입력해주세요");
        } while (next);
    }
}
