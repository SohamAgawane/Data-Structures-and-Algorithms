public class CapacityToShipPackagesWithinDdays {
    public static void main(String[] args) {
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        System.out.println(shipWithinDays(weights, days));
    }

    // Returns the maximum element; used as the minimum possible ship capacity
    public static int maxElement(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // Returns sum of all elements; used as the maximum possible ship capacity
    public static int sumOfAllElements(int[] arr) {
        int sum = 0;
        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    // Calculates number of days required to ship all packages with given capacity
    public static int totalDays(int[] weights, int capacity) {
        int days = 1, load = 0;  // At first day before loading the load will be zero

        for(int i=0; i<weights.length; i++) {
            // If current package cannot fit, start a new day
            if(load + weights[i] > capacity) {
                days = days + 1;
                load = weights[i];  // load current package on the new day
            } else {
                load += weights[i];  // // Keep loading packages on the same day
            }
        }
        return days;
    }

    // Binary search to find the minimum ship capacity to deliver within given days
    public static int shipWithinDays(int[] weights, int days) {
        int low = maxElement(weights);
        int high = sumOfAllElements(weights);

        while(low <= high) {
            int mid = low + (high - low) / 2;

            int totalDays = totalDays(weights, mid);

            if(totalDays <= days) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}
