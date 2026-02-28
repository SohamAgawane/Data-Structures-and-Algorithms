// Find ith bit of a number

public class three {
    public static void main(String[] args) {
        int num = 0b10110110;
        int n = 5;
        System.out.println(findBit(num, n));
    }

    public static int findBit(int num, int n) {
        if ((num & (1 << (n-1))) != 0) {
            return 1;
        } else {
            return 0;
        }
    }

}
