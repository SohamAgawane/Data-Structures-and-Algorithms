// Return the number which appears only one time in array.

public class two {
    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,1,3};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        int xor = 0;
        for(int n : nums) {
            xor = xor ^ n;
        }
        return xor;
    }
}
