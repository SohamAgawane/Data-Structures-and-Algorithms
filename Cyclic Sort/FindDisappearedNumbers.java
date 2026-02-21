import java.util.ArrayList;
import java.util.List;

public class FindDisappearedNumbers {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> result = findDisappearedNumbers(arr);
        System.out.println(result);
    }


    public static List<Integer> findDisappearedNumbers(int[] nums) {
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

        for(int index=0; index<nums.length; index++) {
            if(index+1 != nums[index]) {
                list.add(index + 1);
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
