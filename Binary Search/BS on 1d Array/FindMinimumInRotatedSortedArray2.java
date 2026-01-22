public class FindMinimumInRotatedSortedArray2 {
    public static void main(String[] args) {
        int[] arr = {2,2,3,0,1,2};
        System.out.println(findMin(arr));
    }

    public static int findMin(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end) {
            int mid = start + (end - start) / 2;

            // [4,5,6,0,1,2] -> mid = 6
            if(arr[mid] > arr[end]) {
                start = mid + 1;
            }
            // [4,0,1,2,3] -> mid = 1
            else if(arr[mid] < arr[end]) {
                end = mid;
            }
            // Handling duplicates - [2,2,2,0,1,2]
            // mid = 2, start = 2 and end = 2
            // arr[start] == arr[mid] == arr[end]
            // so we cannot decide min is on left or right because of duplicates
            // so we reduce the search space from right
            // we do not do start++ because it might skip the minimum
            else {
                end--;
            }
        }
        return arr[start];
    }
}
