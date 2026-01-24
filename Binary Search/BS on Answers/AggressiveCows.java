import java.util.Arrays;

public class AggressiveCows {
    public static void main(String[] args) {
        int[] stalls = {1,2,4,8,9};
        int k = 3;  // cows
        System.out.println(aggressiveCows(stalls,k));

        int[] arr = {0,3,4,7,10,9};
        int cows = 4;
        System.out.println(aggressiveCows(arr, cows));
    }

    public static boolean canPlaceCows(int[] stalls, int k, int distance) {
        int lastCow = stalls[0];
        int count = 1;

        for(int i=1; i<stalls.length; i++) {
            if((stalls[i] - lastCow) >= distance) {
                count++;
                lastCow = stalls[i];
            }

            if(count >= k) return true;
        }
        return false;
    }

    public static int aggressiveCows(int []stalls, int k) {
        Arrays.sort(stalls);

        int low = 1;
        int high = stalls[stalls.length-1] - stalls[0];

        while(low <= high) {
            int mid = low + (high-low) / 2;

            if(canPlaceCows(stalls, k, mid)) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return high;
    }
}
