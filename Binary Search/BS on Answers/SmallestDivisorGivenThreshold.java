public class SmallestDivisorGivenThreshold {
    public static void main(String[] args) {
        int[] arr = {1,2,5,9};
        int threshold = 6;
        System.out.println(smallestDivisor(arr, threshold));
    }

    public static int ceilTotal(int[] arr, int divisor) {
        int sum = 0;
        for(int i=0; i<arr.length; i++) {
            sum += (arr[i] + divisor - 1) / divisor;
        }
        return sum;
    }

    public static int smallestDivisor(int[] arr, int threshold) {
        int maxi = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            maxi = Math.max(maxi, arr[i]);
        }

        int low = 1;  // here we do not use min because the smallest divisor can be as small as 1
        int high = maxi;

        while(low <= high) {
            int mid = low + (high - low) / 2;

            if(ceilTotal(arr, mid) <= threshold) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}
