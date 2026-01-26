public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] arr = {7,2,5,10,8};
        int k = 2;
        System.out.println(splitArray(arr,k));
    }

    public static int maxElement(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int sumOfAll(int[] arr) {
        int sum = 0;
        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static boolean canSplitWithMaxSum(int[] arr, int k, int maxSum) {
        int requiredSubarrays = 1;
        int currentSubarraySum = 0;

        for(int i=0; i<arr.length; i++) {
            if(currentSubarraySum + arr[i] <= maxSum) {
                currentSubarraySum += arr[i];
            } else {
                requiredSubarrays++;
                currentSubarraySum = arr[i];
            }
        }

        if(requiredSubarrays <= k) return true;
        else return false;
    }

    public static int splitArray(int[] arr, int k) {
        if(k > arr.length) return -1;

        int low = maxElement(arr);
        int high = sumOfAll(arr);

        while(low <= high) {
            int mid = low + (high - low) / 2;

            if(canSplitWithMaxSum(arr, k, mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}
