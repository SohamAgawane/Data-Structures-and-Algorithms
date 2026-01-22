public class SearchInRotatedSortedArrayWithDuplicateValues {
    public static void main(String[] args) {
        int[] arr = {3,3,3,1,2,2,3,3,3};
        System.out.println(search(arr, 3));
        System.out.println(search(arr, 4));
    }

    public static boolean search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(nums[mid] == target) return true;

            if(nums[start] == nums[mid] && nums[mid] == nums[end]) {
                start++;
                end--;
                continue;  // to repeat the process from start instead of running below steps
            }

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
        return false;
    }
}
