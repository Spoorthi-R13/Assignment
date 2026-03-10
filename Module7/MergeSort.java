package Module7;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {

        int[] arr = {6,3,9,5,2,8};

        Arrays.sort(arr);

        for(int i : arr)
            System.out.print(i + " ");
    }
}