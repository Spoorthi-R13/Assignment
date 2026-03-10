package Module7;

public class RotatedArraySearch {

    public static void main(String[] args) {

        int[] arr = {6,7,8,1,2,3,4};
        int target = 2;

        for(int i = 0; i < arr.length; i++){

            if(arr[i] == target){
                System.out.println("Found at index " + i);
                return;
            }
        }

        System.out.println("Not found");
    }
}