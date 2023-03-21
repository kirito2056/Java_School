import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lec_20230315 {
    /**
     * 제어문 -> if, switch, for, while, do while
     *
     * if ( 조건문 ) {
     *     //조건문이 참일때
     * }
     * else if (조건문 ) {
     *     //if문에서 거짓인 조건문이 else if에서 참일때
     * }
     * else {
     *
     * }
     *
     * .//1번 과제
     * if문에서 참이 되고 코트가 실행되었을떄, else if문의 조건은 확인하는가?
     *
     * .//2번 과제
     * && & || | 증명
     */


    public static void main(String args[]) throws IOException {
        int num = 5;

        if ( num > 0) {
            System.out.println("Hello World!");
        }
        else if (num == 5) {
            System.out.println("안녕 세상아");
        }

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("첫번째 숫자 입력 : ");
        int num01 = Integer.parseInt((in.readLine()));

        System.out.println("두번째 숫자 입력 : ");
        int num02 = Integer.parseInt((in.readLine()));
    }
}
