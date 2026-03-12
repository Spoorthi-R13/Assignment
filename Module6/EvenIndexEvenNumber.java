package Module6;
import java.util.*;

public class EvenIndexEvenNumber {

    public static void rearrange(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n; i += 2) {
            if (arr[i] % 2 != 0) {

                for (int j = 1; j < n; j += 2) {
                    if (arr[j] % 2 == 0) {

                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                        break;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {

        int arr[] = {3, 6, 12, 1, 5, 8, 10};

        rearrange(arr);

        System.out.println("Rearranged Array:");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
