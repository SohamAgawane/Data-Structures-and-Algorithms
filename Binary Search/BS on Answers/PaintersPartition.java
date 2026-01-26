public class PaintersPartition {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        int painters = 2;
        System.out.println(minTime(arr, painters));
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

    public static boolean canPaint(int[] arr, int k, int maxPainters) {
        int painters = 1;
        int pages = 0;

        for(int i=0; i<arr.length; i++) {
            if(pages + arr[i] <= maxPainters) {
                pages += arr[i];
            } else {
                painters++;
                pages = arr[i];
            }
        }

        if(painters <= k) return true;
        else return false;
    }

    public static int minTime(int[] arr, int k) {
        if(k > arr.length) return -1;

        int low = maxElement(arr);
        int high = sumOfAll(arr);

        while(low <= high) {
            int mid = low + (high - low) / 2;

            if(canPaint(arr, k, mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}
