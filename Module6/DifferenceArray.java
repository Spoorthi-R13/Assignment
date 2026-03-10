package Module6;

import java.util.Scanner;

public class DifferenceArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[6];
        int[] diff = new int[6];

        System.out.println("Enter 6 elements:");
        for(int i = 0; i < 6; i++){
            arr[i] = sc.nextInt();
        }

        diff[0] = arr[0];

        for(int i = 1; i < 6; i++){
            diff[i] = arr[i] - arr[i-1];
        }

        System.out.println("Difference Array:");
        for(int i = 0; i < 6; i++){
            System.out.print(diff[i] + " ");
        }

        sc.close();
    }
}