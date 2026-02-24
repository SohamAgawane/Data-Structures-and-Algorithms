public class Main {
    public static void main(String[] args) {
        String name = "Soham Agawane";
        System.out.println(name);

        String a = "Soham";
        System.out.println(a);
        a = "Agawane";
        System.out.println(a);


        // String Comparision -
        String b = "Soham";
        String c = "Soham";
        String d = new String("Soham");

        // ==
        System.out.println(b == c);  // true
        System.out.println(b == d);  // false

        // .equals() -
        System.out.println(b.equals(c));  // true
        System.out.println(b.equals(d));  // true

        // Accessing characters via index -
        System.out.println(b.charAt(0));

        // Pretty Printing -
        float e = 435.12345f;
        System.out.printf("Formatted number is %.2f", e);
    }
}