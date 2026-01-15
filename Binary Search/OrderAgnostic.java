public class OrderAgnostic {
    public static void main(String[] args) {
        int[] arr = {90,75,18,12,6,4,3,1};
        System.out.println(binarySearch(arr, 4));
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // find weather array is sorted in ascending or descending order -
        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            int mid = start + ((end - start) / 2);

            if(arr[mid] == target) {
                return mid;
            }

            if(isAsc) {
                if(target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if(target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
