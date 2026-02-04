import java.util.Arrays;

public class BSinMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 16;
        System.out.println(Arrays.toString(searchMatrix(arr, target)));
    }

    public static int[] searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix.length - 1;

        while(row < matrix.length && col >= 0) {
            if(matrix[row][col] == target) {
                return new int[]{row, col};
            } else if (matrix[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }
        return new int[]{-1,-1};
    }
}
