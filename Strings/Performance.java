public class Performance {
    public static void main(String[] args) {
//        String series = "";
//
//        for(int i=0; i<26; i++) {
//            char ch = (char)('a' + i);
//            series = series + ch;
//        }
//        System.out.println(series);

        // Here the time complexity is O(N2) because it runs everytime a character is added.
        // To overcome this issue, StringBuilder data structure is used.

        StringBuilder builder = new StringBuilder();

        for(int i=0; i<26; i++) {
            char ch = (char)('a' + i);
            builder.append(ch);
        }
        System.out.println(builder);
    }
}
