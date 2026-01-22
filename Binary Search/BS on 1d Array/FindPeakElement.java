public class FindPeakElement {
    public static void main(String[] args) {
        int[] a = {1,2,3,1};
        System.out.println(findPeakElement(a));

        int[] b = {1,2,1,3,5,6,4};
        System.out.println(findPeakElement(b));
    }

    public static int findPeakElement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end) {
            int mid = start + ((end - start) / 2);

            if(arr[mid] < arr[mid+1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }
}
