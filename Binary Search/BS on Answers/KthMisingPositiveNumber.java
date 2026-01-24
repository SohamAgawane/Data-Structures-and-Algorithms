public class KthMisingPositiveNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        int k = 5;
        System.out.println(findKthPositive(arr,k));
    }

    public static int findKthPositive(int[] arr, int k) {
        int low = 0;
        int high = arr.length-1;

        while(low <= high) {
            int mid = low + (high - low) / 2;

            // totalMissing = arr[i] - (i+1);
            int totalMissing = arr[mid] - (mid+1);

            // If missing numbers till mid are less than k, kth missing lies to the right
            if(totalMissing < k) {
                low = mid + 1;
            }
            // Else kth missing lies to the left or at mid
            else {
                high = mid - 1;
            }
        }
        return low + k;
    }
}
