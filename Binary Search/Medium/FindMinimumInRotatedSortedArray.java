public class FindMinimumInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2,3};
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
            else {  // (arr[mid] < arr[end])
                end = mid;
            }
        }
        return arr[start];
    }
}
