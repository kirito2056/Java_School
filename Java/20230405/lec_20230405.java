import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lec_20230405 {

    public static void main(String[] args) {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            int num = Integer.parseInt(bufferedReader.readLine());

                for ( int i = 1 ; i <= 3 ; i++) {
                    for (int j = 1; j <= num; j++) {
                        System.out.print(j + "*" + i + "=" + i * j + "\t");
                    }
                    System.out.println();
                }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    }


        /*
        int num1 = 1;
        int num2 = 1;
        int num3;

        System.out.print(num1 + ", ");
        System.out.print(num2);

        for (int i = 0 ; i < 8 ; i++) {
            num3 = num1 + num2;
            System.out.print(", " + num3);
            num1 = num2;
            num2 = num3;
        }

        String str = "12345";
        int sum = 0;
        for ( int i = 0 ; i < str.length() ; i++) {
            sum += str.charAt(i) - '0';
        }
        System.out.println("sum : " +sum);


        for ( int i = -100 ; i <= 100 ; i++) {
            for ( int j = -100 ; j <= 100 ; j++) {
                if ( i * 2 + j * 4 == 10) System.out.println("x = " + i + " , y = " + j);
            }
        }


        int first = 6;
        int second = 6;
        int num = 6;

        for ( int i = 1 ; i <= first ; i++) {
            for ( int j = 1 ; j <= second ; j++) {
                if ( i + j == num) System.out.println(i + " : " + j);
            }
        }

        for ( int i = 0 ; i <= 10 ; i++) {
            for ( int j = 0 ; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        int i = 0;
        while(i < 10) {

            int sum = i;
            while(sum > 0) {
                System.out.print("*");
                sum--;
            }
            System.out.println();
            i++;

        }

        */