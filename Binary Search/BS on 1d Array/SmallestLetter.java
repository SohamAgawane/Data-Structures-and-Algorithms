public class SmallestLetter {
    public static void main(String[] args) {
        char[] a = {'c','f','j'};
        System.out.println(nextGreatestLetter(a, 'a'));

        char[] b = {'c','f','j'};
        System.out.println(nextGreatestLetter(b, 'c'));

        char[] c = {'x','x','y', 'y'};
        System.out.println(nextGreatestLetter(c, 'z'));
    }

    public static char nextGreatestLetter(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + ((end - start) / 2);

            if(target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return arr[start % arr.length];
        // arr ['c','f','j']
        // Case 1 : target = 'a'  -> start = 0
        // 0 % 3 = 0
        // Case 2 : target = 'c' -> start = 1
        // 1 % 3 = 1
        // Case 3 : target = 's' -> start = 3
        // 3 % 3 = 0
    }
}
