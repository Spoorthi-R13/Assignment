package Module6;

import java.util.Scanner;

public class PairSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Enter 5 elements:");
        for(int i = 0; i < 5; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target value: ");
        int target = sc.nextInt();

        System.out.println("Pairs:");

        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){

                if(arr[i] + arr[j] == target){
                    System.out.println(arr[i] + " , " + arr[j]);
                }
            }
        }

        sc.close();
    }
}