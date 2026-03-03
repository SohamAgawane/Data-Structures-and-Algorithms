// In array every number appears 3 / odd number of times, but one number appears only once.
// Find the number which appears only one time.

public class six {
    public static void main(String[] args) {
        int[] n = {2,2,3,2,7,7,8,7,8,8};
        System.out.println(singleNumber(n));
    }

    public static int singleNumber(int[] nums) {
        int result = 0;

        for(int i=0; i<32; i++) {
            int count = 0;

            for(int n : nums) {
                if(((n >> i) & 1) == 1) {
                    count++;
                }
            }

            if(count % 3 == 1) {
                result = result | (1 << i);
            }
        }

        return result;
    }
}