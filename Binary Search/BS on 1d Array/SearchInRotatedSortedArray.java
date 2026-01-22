public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2,3};
        System.out.println(search(arr, 6));
    }

    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(nums[mid] == target) return mid;

            if(nums[start] <= nums[mid]) {  // left half is sorted
                if(nums[start] <= target && target <= nums[mid]) {  // target lies in left half so eliminate right
                    end = mid - 1;
                } else {  // target lies in right so eliminate left
                    start = mid + 1;
                }
            } else {  // right half is sorted
                if(nums[mid] <= target && target <= nums[end]) {  // target lies in right so eliminate left
                    start = mid + 1;
                } else {  // target lies in left so eliminate right
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
