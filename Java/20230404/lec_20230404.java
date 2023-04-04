public class lec_20230404 {
    public static void main(String args[]) {


        int sum = 0;
        int s = 1;
        int num = 0;

        while(num < 100) {
            num += s;
            if ( s > 0) {
                s += 1;
                s *= -1;
            }
            else if ( s < 0 ) {
                s *= -1;
                s += 1;
            }
            sum++;
        }

        System.out.println("sum : " + sum);
        System.out.println("num : " + num);





        /*
        int sum = 0;
        int totalSum = 0;

        for ( int i = 1 ; i <= 10 ; i++) {
            sum += i;
            totalSum += sum;
            System.out.println(sum);
        }

        System.out.println(totalSum);

----------------------------------------

        int sum = 0;

        for ( int i = 1 ; i <= 20 ; i++) {
            if (( i % 2 != 0) && (i % 3 != 0)) {
                sum += i;
            }
        }

        System.out.println("sum : " + sum);

----------------------------------------

        char ch = ' ';
        char lowerCase = ('A' <= ch && ch <= 'Z') ? (char)(ch + 32) : ch;
        System.out.println(lowerCase);

        char ch = '?';
        boolean b = (('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z') || ('0' <= ch && ch <= '9'));
        System.out.println(b);
         */
    }
}


