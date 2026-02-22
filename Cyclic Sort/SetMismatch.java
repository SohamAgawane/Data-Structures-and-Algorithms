import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SetMismatch {
    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        int[] ans = findErrorNums(nums);
        System.out.println(Arrays.toString(ans));

        int[] nums2 = {2,2};
        int[] ans2 = findErrorNums(nums2);
        System.out.println(Arrays.toString(ans2));
    }

    public static int[] findErrorNums(int[] nums) {
        List<Integer> list = new ArrayList<>();

        int i=0;
        while(i< nums.length) {
            int correctIndex = nums[i] - 1;
            if(nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }

        for(int index=0; index< nums.length; index++) {
            if(nums[index] != index+1) {
                return new int[]{nums[index], index+1};
            }
        }
        return new int[]{-1,-1};
    }

    public static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
