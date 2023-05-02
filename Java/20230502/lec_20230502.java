import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lec_20230502 {
    public static void main(String args[]) throws IOException {
        while( true) {
            break;
        }
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("첫번째 x좌표 : ");
        int x1 = Integer.parseInt(in.readLine());
        System.out.println("첫번째 y좌표 : ");
        int y1 = Integer.parseInt(in.readLine());

        System.out.println("두번째 x좌표 : ");
        int x2 = Integer.parseInt(in.readLine());
        System.out.println("두번째 y좌표 : ");
        int y2 = Integer.parseInt(in.readLine());

        int[] arrx = {x1, x2};
        if ( x2 > x1 ) arrx = numbertemp(x1, x2);
        x1 = arrx[0];
        x2 = arrx[1];

        int[] arry = {x1, x2};
        if ( x2 > x1 ) arry = numbertemp(x1, x2);
        x1 = arry[0];
        x2 = arry[1];

        double x = Math.pow(x2-x1, 2);
        double y = Math.pow(y2-y1, 2);





    }

    static int[] numbertemp(int first, int second) {
        int temp = first;
        first = second;
        second = temp;
        int arr[] = {first, second};
        return arr;
    }
}
