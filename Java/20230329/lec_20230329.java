public class lec_20230329 {

    private int heignt = 0;

    public static void main(String args[]) {
        int numOfApples = 2346;
        int sizeOfBucket = 31;
        int fahrnheit = 100;

        //System.out.println("필요한 바구니의 수 : " + count(numOfApples, sizeOfBucket));
        //System.out.println("필요한 바구니의 수 : " + three_count(numOfApples, sizeOfBucket));
        //System.out.println(gethundred(numOfApples));
        //System.out.println(makeone(numOfApples));
        //System.out.println(maketenone(numOfApples));
        //System.out.println(yeeee(numOfApples));
        System.out.println(no_math_round(fahrnheit));

    }


    static double no_math_round(int num) {
        return (int)((5/9f * (num - 32)) * 100 + 0.5); // 뒤에 뭐였지    / 100이던가
    }





    //크면서 가장 가까운 십의 배수가 되기 위해 더해야하는 수
    static int yeeee(int num) {
        int a = (num / 10) * 10 + 10;
        return a - num;
    }


    //십의자릿수 1로 만들기
    static int maketenone(int num) {
        int one = num % 10;
        return (num / 100) * 100 + 10 + one;
    }


    //일의자릿수 1로 만들기
    static int makeone(int num) {
        return ((num/10)*10)+1;
    }

    //십의자리 이하인 수 버리기
    static int gethundred(int num) {
        int hun = num / 100;
        return hun *= 100;
    }



    //사과바구니 갯수 구하기
    public static int count(int numOfApples, int sizeOfBucket) {
        if ( numOfApples % 10 == 0) {
            return numOfApples / sizeOfBucket;
        }
        else {
            return numOfApples / sizeOfBucket + 1;
        }
    }

    public static int three_count(int numOfApples, int sizeOfBucket) {
        return numOfApples / sizeOfBucket + ( numOfApples % sizeOfBucket > 0 ? 1 : 0);
    }



/*
    public int setHeight(int _h) {
        if ( _h < 0 ) {
            return -1;
        }
        else if ( _h > 200 ) {
            return -2;
        }
        else  {
            heignt = _h;
        }
    }
 */


}
