public class FindDuplicateNumber {
    public static void main(String[] args) {
        int[] n1 = {1,3,4,2,2};
        int[] n2 = {3,3,3,3,3};

        int r1 = findDuplicate(n1);
        int r2 = findDuplicate(n2);

        System.out.println(r1);
        System.out.println(r2);
    }

    public static int findDuplicate(int[] nums) {
        int i=0;

        while(i < nums.length) {
            if(nums[i] != i+1) {
                int correctIndex = nums[i] - 1;
                if(nums[i] != nums[correctIndex]) {
                    swap(nums, i, correctIndex);
                } else {
                    return nums[i];
                }
            } else {
                i++;
            }
        }
        return -1;
    }

    public static void swap(int[] arr, int num1, int num2) {
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
    }
}
