package main;
public class Main {
    public static void main(String[] args) {
        int i, j, k;
        System.out.println("=== 1. Basic Nested Loop Demonstration ===");
        for (i = 1; i <= 2; i++) {
            System.out.println("Outer loop start");
            for (j = 1; j <= 3; j++) {
                System.out.println("*************** Hi");
            }
            System.out.println("Outer loop end");
        }
        System.out.println("\n=== 2. 3-Level Nested Loop Demonstration ===");
        for (i = 1; i <= 2; i++) {
            for (j = 1; j <= 3; j++) {
                for (k = 1; k <= 2; k++) {
                    System.out.println("Hi"); // 2 * 3 * 2 = 12 times
                }
            }
        }
        System.out.println("\n=== 3. 2x3 Asterisk Grid ===");
        for (i = 1; i <= 2; i++) {
            for (j = 1; j <= 3; j++) {
                System.out.print("*");
            }
            System.out.println(); // Outer loop adds a newline after each row
        }
        System.out.println("\n=== 4. Increasing Triangle Pattern ===");
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\n=== 5. Inverted / Decreasing Triangle Pattern ===");
        for (i = 1; i <= 5; i++) {
            for (j = 5; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

