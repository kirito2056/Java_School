public class lec_20230510 {
    public static void main(String args[]) {
        int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(java.util.Arrays.toString(original));
        int[] result = shuffle(original);
        System.out.println(result);

    }

    private static int[] shuffle(int[] original){
        int[] shuffled = new int[10];
        for ( int i = 0 ; i < 9 ; i++) shuffled[i] = original[i];

        int temp;


        for ( int i = 0 ; i < 9 ; i++) {
            int first;
            int second;

            do {
                first = (int)(Math.random() * 10);
                second = (int)(Math.random() * 10);
            }while ((0 <= first && first <= 8)||(0 <= second && second <= 8));

            temp = shuffled[first];
            shuffled[first] = shuffled[second];
            shuffled[second] = temp;
        }

        return shuffled;
    }
}
