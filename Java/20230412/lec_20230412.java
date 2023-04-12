import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lec_20230412 {

    public static void main(String args[]) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[3];

        for ( int i = 0 ; i < 3 ; i++) arr[i] = (int) (10 * Math.random());

        for ( int i = 0 ; i < arr.length ; i++) {
            System.out.println(i+1 + "번째 : " + arr[i]);
        }








        /*
        int num = 0;
        int count = 0;

        int getnumber = 0;
        num = (int)(100 * Math.random()) +1;

        while ( getnumber != num) {
            System.out.println("숫자를 입력하세요");

            getnumber = Integer.parseInt(bufferedReader.readLine());

            if ( num == getnumber) {
                System.out.println("정답");
                break;
            }
            else if (num > getnumber) System.out.println("Up");
            else if (num < getnumber) System.out.println("Dowm");

            count++;
        }

        System.out.println("num = " + num);
        System.out.println(count+1 + "만큼 입력하셨습니다");



        int[][] arr = {
                {5, 5, 5, 5, 5},
                {10, 10 ,10, 10, 10},
                {20, 20, 20, 20, 20},
                {30, 30, 30, 30, 30}
        };
        int total = 0;
        float average = 0;

        for ( int i = 0 ; i < 4 ; i++) for (int j = 0; j < 5; j++) total += arr[i][j];

        average = (float)total / 20;

        System.out.println("total = " + total);
        System.out.println("average = " + average);



        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;

        for ( int i = 0 ; i < arr.length ; i++) {
            sum += arr[i];
        }

        System.out.println("sum = " + sum);
 */
    }
}
