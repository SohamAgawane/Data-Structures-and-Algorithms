import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicates {
    public static void main(String[] args) {
        int[] nums1 = {4,3,2,7,8,2,3,1};
        List<Integer> res1 = findDuplicates(nums1);
        System.out.println(res1);

        int[] nums2 = {1};
        List<Integer> res2 = findDuplicates(nums2);
        System.out.println(res2);
    }

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();

        int i=0;
        while(i < nums.length) {
            int correctIndex = nums[i] - 1;

            if(nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }

        for(int index=0; index< nums.length; index++) {
            if(nums[index] != index + 1) {
                list.add(nums[index]);
            }
        }

        return list;
    }

    public static void swap(int[] arr, int num1, int num2) {
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
    }
}
