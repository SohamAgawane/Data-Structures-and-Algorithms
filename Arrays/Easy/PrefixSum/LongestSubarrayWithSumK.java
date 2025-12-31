package PrefixSum;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarrayWithSumK {
    public static void main(String[] args) {
        int[] arr = {5,2,2,5,1,1,1,1,4};
        maxSubarray(arr, 4);
        System.out.print(maxSubarray(arr, 4));
    }


    public static int maxSubarray(int[] arr, int k) {
        Map<Integer, Integer> sumSeenAtIndex = new HashMap<>();
        int result = 0;
        int prefixSum = 0;

        for(int i=0; i< arr.length; i++) {
            prefixSum = prefixSum + arr[i];

            // Case 1: subarray starts from index 0
            if (prefixSum == k) {
                result = Math.max(result, i + 1);
            }

            // If prefixSum - k exists in the map then there exist
            // such subarray from (index of prefix) to i.
            if(sumSeenAtIndex.containsKey(prefixSum - k)) {
                result = Math.max(result, i-sumSeenAtIndex.get(prefixSum - k));
            }

            // Store only first occurence index of prefixSum
            if(!sumSeenAtIndex.containsKey(prefixSum)) {
                sumSeenAtIndex.put(prefixSum, i);
            }
        }

        return result;
    }


}
