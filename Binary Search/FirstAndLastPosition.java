import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] a = {5,7,7,8,8,10};
        System.out.println(Arrays.toString(searchRange(a, 8)));

        int[] b = {5,7,7,8,8,10};
        System.out.println(Arrays.toString(searchRange(b, 6)));

        int[] c = {};
        System.out.println(Arrays.toString(searchRange(c, 0)));

        int[] d = {1};
        System.out.println(Arrays.toString(searchRange(d, 1)));
    }

    public static int[] searchRange(int[] arr, int target) {
        int first = firstOccurance(arr, target);
        int last = lastOccurance(arr, target);
        return new int[]{first,last};
    }

    private static int firstOccurance(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while(start <= end) {
            int mid = start + ((end - start) / 2);

            if(target <= arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            if(arr[mid] == target) ans = mid;
        }
        return ans;
    }

    private static int lastOccurance(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while(start <= end) {
            int mid = start + ((end - start) / 2);

            if(target >= arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            if(arr[mid] == target) ans = mid;
        }
        return ans;
    }
}
