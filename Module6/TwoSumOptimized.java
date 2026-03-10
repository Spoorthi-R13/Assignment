package Module6;

import java.util.HashMap;
import java.util.Scanner;

public class TwoSumOptimized {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {2,7,11,15};

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++){

            int diff = target - arr[i];

            if(map.containsKey(diff)){
                System.out.println("Indices: " + map.get(diff) + " and " + i);
                return;
            }

            map.put(arr[i], i);
        }

        sc.close();
    }
}