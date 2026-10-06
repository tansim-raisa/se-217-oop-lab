public class StringDemo {
    public static void main(String[] args) {

        String text1 = "Bangla Coding Tutor";
        String text2 = "bangla coding tutor";

        int len = text1.length();
        System.out.println("Length: " + len);

        System.out.println("Uppercase: " + text1.toUpperCase());

        System.out.println("Lowercase: " + text1.toLowerCase());
        char ch = text1.charAt(0);

        System.out.println("Character at index 0: " + ch);
        boolean isEqual = text1.equals(text2);

        System.out.println("Is Equal: " + isEqual);
        boolean isEqualIgnoreCase = text1.equalsIgnoreCase(text2);
        System.out.println("Is Equal (Ignore Case): " + isEqualIgnoreCase);
    }
}

