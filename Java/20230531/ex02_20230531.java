import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex02_20230531 {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("구매 금액 입력 : ");
        int price = Integer.parseInt(bufferedReader.readLine());

        System.out.println("지불 금액 입력");
        int pay = Integer.parseInt(bufferedReader.readLine());
        if ( price > pay) System.out.println("다시 입력하세요");
    }

}
