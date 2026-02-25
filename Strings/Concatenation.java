import java.util.ArrayList;

public class Concatenation {
    public static void main(String[] args) {
        System.out.println('a' + 'b');  // 195 -> adding ascii values

        System.out.println("a" + "b");  // ad -> it is combining 2 strings

        System.out.println((char)('a' + 3));  // d -> it converted ascii value back to character

        System.out.println("a" + 1);  // a1 -> integer will be converted to Integer that will call toString()
        // It will treat it like "a" + "1"

        System.out.println("Soham" + new ArrayList<>());  // Soham[]

        System.out.println("Soham" + new Integer(25));  // Soham25 -> It will convert it into toString()
        // It will treat it like "Soham" + "25"

        System.out.println("Hello".concat("World"));  // HelloWorld
        // .concat() - works only with Strings.

        System.out.println(1 + 2 + "3");
        // left to right
        // 3 + "3" = "33"
        // 1 + 2 = 3

        System.out.println("3" + 1 + 2);
        // left to right
        // "3" + 1 = "31"
        // "31" + 2 = "312"
    }
}
