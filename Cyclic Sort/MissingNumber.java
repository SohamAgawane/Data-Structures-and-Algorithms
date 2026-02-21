public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {4,0,2,1};
        System.out.println(missingNumber(arr));
    }

    public static int missingNumber(int[] arr) {

        int i=0;

        while(i < arr.length) {
            int correctIndex = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }

        for(int index=0; index< arr.length; index++) {
            if(arr[index] != index) {
                return index;
            }
        }
        return arr.length;
    }

    public static void swap(int[] arr, int num1, int num2) {
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
    }
}
