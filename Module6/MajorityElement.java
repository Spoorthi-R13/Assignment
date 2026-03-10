package Module6;

import java.util.Scanner;

public class MajorityElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {2,2,1,1,2,2,2};

        int candidate = arr[0];
        int count = 1;

        for(int i = 1; i < arr.length; i++){

            if(arr[i] == candidate)
                count++;
            else
                count--;

            if(count == 0){
                candidate = arr[i];
                count = 1;
            }
        }

        System.out.println("Majority Element: " + candidate);

        sc.close();
    }
}