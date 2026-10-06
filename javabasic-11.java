package main;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Example 1 ---");
        int i = 1;
        do {
            System.out.println("Let me go!");
            i++;
        } while (i <= 5);
        System.out.println("\n--- Example 2 ---");
        i = 1;
        do {
            System.out.println(i);
            i = i + 5;
        } while (i <= 100);
        System.out.println("\n--- Example 3 ---");
        int x = -30;
        do {
            System.out.println("HI");
            x = x + 1;
        } while (x >= -25);
    }
}
