public class StringSplitDemo {
    public static void main(String[] args) {
        String text = "Java is a programming language";

        String[] words = text.split(" ");

        for (String word : words) {
            System.out.println(word);
        }
    }
}
