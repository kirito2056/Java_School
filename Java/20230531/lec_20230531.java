import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lec_20230531 {

    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int arr_num = 0;
        int[] arr = new int[3];

        do {
            boolean issame = false;
            int num = Integer.parseInt(bufferedReader.readLine());

            if ( num < 1 || 1000 < num) {
                System.out.println("1 ~ 1000인 숫자를 입력해주세요");
                continue;
            }

            for ( int i = 0 ; i < arr_num ; i++) {
                if ( num == arr[i]) {
                    System.out.println("같은 숫자는 입력하면 안됩니다");
                    issame = true;
                }
            }
            if (issame) continue;

            arr[arr_num] = num;
            arr_num++;
        } while (arr_num < 3);

        sorting_arr(arr, arr.length);



        for ( int i = 0 ; i < 3 ; i++) System.out.println(arr[i]);
    }

    static void sorting_arr(int[] arr, int arr_length) {
        int minIndex = 0; //가장 적은 원소의 인덱스

        for(int i=0; i < arr.length; i++){
            for(int j=i+1 ; j < arr.length; j++){
                if(arr[minIndex] > arr[j])
                    minIndex = j;
            }

            int tmp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = tmp;
        }
    }
}

//            System.out.println(num > 0 ? "양수" : num == 0 ? "0" : "음수");