public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {4,5,1,2};
        System.out.println(rotationCount(arr));
    }

    public static int rotationCount(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end) {
            int mid = start + (end-start) / 2;

            if(arr[mid] > arr[end]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }
}