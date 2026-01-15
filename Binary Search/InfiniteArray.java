// it is an inifinte array so you cannot use arr.length

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3,5,7,11,15,20,23,30,45};
        int target = 15;
        System.out.println(ans(arr,target));
    }

    static int ans(int[] arr, int target) {
        // find the range -
        // find start with box of size 2
        int start = 0;
        int end = 1;

        // condition for target to lie in the range
        // keep doubling size until target > end
        // when target is not greater than end it is behind the end and ahead of start

        while(target > arr[end]) {
            int newStart = end + 1;

            // newEnd = previousEnd + (sizeOfBox * 2);
            end = end + ((end - start + 1) * 2);

            // we used newStart because we needed to use previous start in to calculate end
            start = newStart;
        }

        return infinteArray(arr, target, start, end);
    }

    static int infinteArray(int[] arr, int target, int start, int end) {
        while(start <= end) {
            int mid = start + ((end - start) / 2);

            if(target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}