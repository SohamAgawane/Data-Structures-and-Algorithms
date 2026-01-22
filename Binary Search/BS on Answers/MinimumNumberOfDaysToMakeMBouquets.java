public class MinimumNumberOfDaysToMakeMBouquets {
    public static void main(String[] args) {
        int[] bloomDay = {7,7,7,7,11,12,7,13};
        int m = 2, k = 3;
        System.out.println(minDays(bloomDay, m, k));
    }

    // Returns the maximum bloom day (upper bound of search space)
    public static int maxElement(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // Returns the minimum bloom day (lower bound of search space)
    public static int minElement(int[] arr) {
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    // Checks if at least 'm' bouquets can be formed in 'days'
    // Each bouquet needs 'k' adjacent bloomed flowers
    public static boolean canMake(int[] arr, int m, int k, int days) {
        int bouquets = 0;
        int flowers = 0;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] <= days) {
                flowers++;
                if(flowers == k) {
                    bouquets++;
                    flowers = 0;
                }
            } else {
                flowers = 0;
            }
        }
        // Return TRUE if it can make 'm' or more than 'm' number of bouquets
        // Return FALSE if it cannot make m or more number of bouquets
        return bouquets >= m;
    }

    // Uses binary search to find the minimum day to make 'm' bouquets
    public static int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k > bloomDay.length) return -1;

        int low = minElement(bloomDay);
        int high = maxElement(bloomDay);

        while(low <= high) {
            int mid = low + (high-low) / 2;

            if(canMake(bloomDay, m, k, mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;

    }
}
