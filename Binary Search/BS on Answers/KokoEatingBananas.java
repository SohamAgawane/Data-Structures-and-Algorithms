public class KokoEatingBananas {
    public static void main(String[] args) {
        int[] piles = {3,6,7,11};
        int h = 8;
        System.out.println(minEatingSpeed(piles, h));
    }

    // Calculate the maximum element in the array -
    public static int maxElement(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // Calculates a reasonable lower bound for eating speed.
    public static int minElement(int[] arr, int h) {
        int sum = 0;
        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
        }
        return sum / h;
    }

    // Calculates total hours required to eat all piles -
    public static long requiredTime(int[] arr, int hourly) {
        long totalHour = 0;
        for(int i=0; i<arr.length; i++) {
            totalHour += (arr[i] + hourly - 1) / hourly;
        }
        return totalHour;
    }


    public static int minEatingSpeed(int[] piles, int h) {
        int low = minElement(piles, h);
        int high = maxElement(piles);

        while(low <= high) {
            int mid = low + (high - low) / 2;

            long totalHours = requiredTime(piles, mid);

            if(totalHours <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}