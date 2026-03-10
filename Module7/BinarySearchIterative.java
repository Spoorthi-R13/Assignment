package Module7;

public class BinarySearchIterative {

    public static void main(String[] args) {

        int[] arr = {2,4,6,8,10,12};
        int target = 8;

        int low = 0;
        int high = arr.length - 1;

        while(low <= high){

            int mid = (low + high) / 2;

            if(arr[mid] == target){
                System.out.println("Element found at index " + mid);
                return;
            }
            else if(arr[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }

        System.out.println("Element not found");
    }
}