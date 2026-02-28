// Set ith bit.
// if ith bit = 0 -> 1 and if ith bit = 1 -> 1.

public class four {
    public static void main(String[] args) {
        int num = 0b1010110;
        int n = 4;
        System.out.println(Integer.toBinaryString(setBit(num, n)));
    }

    public static int setBit(int num, int n) {
        return (num | (1 << (n-1)));
    }
}
