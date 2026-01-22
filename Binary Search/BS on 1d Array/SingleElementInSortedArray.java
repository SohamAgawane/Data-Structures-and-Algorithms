public class SingleElementInSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4,5,5,6,6};
        System.out.println(singleNonDuplicate(arr));
    }

    public static int singleNonDuplicate(int[] nums) {
        if(nums.length == 1) return nums[0];  // array of size 1

        // Checking for first and last element
        if(nums[0] != nums[1]) return nums[0];
        if(nums[nums.length-1] != nums[nums.length-2]) return nums[nums.length-1];

        int start = 1;
        int end = nums.length - 2;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            // check on single element
            if(nums[mid] != nums[mid+1] && nums[mid] != nums[mid-1]) return nums[mid];

            // check element you are on whick part
            if((mid % 2 == 1 && nums[mid-1] == nums[mid]) ||
            (mid % 2 == 0 && nums[mid] == nums[mid+1])) {
                // you are in left half and element is on right half
                // eliminate the left half
                start = mid+1;
            } else {
                // you are in right half and element is on left half
                // eliminate the right half
                end = mid-1;
            }
        }
        return -1;
    }
}
