public class BookAllocation {
    public static void main(String[] args) {
        int[] arr = {25,46,28,49,24};
        int students = 4;
        System.out.println(findPages(arr, students));
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

    // Calculate max number of pages -
    public static boolean canAllocate(int[] arr, int k, int maxPages) {
        int students = 1;
        int pages = 0;

        for(int i=0; i<arr.length; i++) {
            if(pages + arr[i] <= maxPages) {
                pages += arr[i];
            } else {
                students++;
                pages = arr[i];
            }
        }

        if(students <= k) return true;
        else return false;
    }

    public static int findPages(int[] arr, int k) {
        if(k > arr.length) return -1;

        int low = maxElement(arr);
        int high = sumOfAll(arr);

        while(low <= high) {
            int mid = low + (high - low) / 2;

            if(canAllocate(arr, k, mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}
