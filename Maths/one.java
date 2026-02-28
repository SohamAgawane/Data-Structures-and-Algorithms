// Given a number n check if it is odd or even.

public class one {
    public static void main(String[] args) {
        int n = 67;
        System.out.println(check(n));
    }

    public static String check(int n) {
        if((n & 1) == 1) {
            return "odd";
        } else {
            return "even";
        }
    }
}
