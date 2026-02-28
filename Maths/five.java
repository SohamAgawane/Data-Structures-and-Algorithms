// reset ith bit.
// 1 -> 0 & 0 -> 0

public class five {
    public static void main(String[] args) {
        int num = 0b1010110;
        int n = 5;
        System.out.println(Integer.toBinaryString(resetBit(num, n)));
    }

    public static int resetBit(int num, int n) {
        return (num & ~(1 << (n-1)));
    }
}
