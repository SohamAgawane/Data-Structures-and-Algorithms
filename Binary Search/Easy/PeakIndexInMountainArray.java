public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        int[] a = {0,1,0};
        System.out.println(peakIndexInMountainArray(a));

        int[] b = {1,2,4,5,7,6,4,3,2};
        System.out.println(peakIndexInMountainArray(b));

        int[] c = {1,2,3,5,6,7,9,11,6,2,1};
        System.out.println(peakIndexInMountainArray(c));

        int[] arr = {1,12,7,9,5,3,4,2,1};
        System.out.println(peakIndexInMountainArray(arr));
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end) {
            int mid = start + ((end - start) / 2);

            if(arr[mid] < arr[mid+1]) {
                // You are in increase part of array
                start = mid + 1;
            } else {
                // You are in decreasing part of array
                // this may be the ans, but look at left
                // this is why end != mid - 1
                end = mid;
            }
        }
        // At last, start == end and pointing to the largest number becasue of the 2 checks above
        // start and end are always trying to find max element in above 2 checks
        // hence, when they are pointing to just one element, that is the maximum one
        // therefore start == end so you can return anything start / end
        return start;
    }
}
