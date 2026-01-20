public class KokoEatingBananas {
    public static void main(String[] args) {
        int[] piles = {3,6,7,11};
        int h = 8;
        System.out.println(minEatingSpeed(piles, h));
    }

    public static int max(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int reqTime(int[] arr, int hourly) {
        int totalHours = 0;
        for (int i = 0; i < arr.length; i++) {
            totalHours += (arr[i] + hourly - 1) / hourly; // calculating the ceil
        }
        return totalHours;
    }

    public static int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = max(piles);

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int totalHours = reqTime(piles, mid);

            if (totalHours <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }


//    public static int minEatingSpeed(int[] piles, int h) {
//        int low = 1;
//        int high = 0;
//
//        // finding max element in the array
//        for(int i=0; i<piles.length; i++) {
//            high = Math.max(high, piles[i]);
//        }
//
//        while(low <= high) {
//            int mid = low + (high-low) / 2;
//
//            // finding required hours
//            long hours = 0;
//            for(int i=0; i< piles.length; i++) {
//                hours += (piles[i] + mid - 1) / mid;
//            }
//
//            if(hours <= h) {
//                high = mid - 1;
//            } else {
//                low = mid + 1;
//            }
//        }
//        return low;
//    }
}
