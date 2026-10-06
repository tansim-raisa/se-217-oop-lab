package main;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Basic Loop (1 to 5) ---");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        System.out.println("\n--- Step by 2 (Odd Numbers) ---");
        for (int i = 1; i <= 9; i = i + 2) {
            System.out.println(i);
        }
        System.out.println("\n--- Break at 4 ---");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            if (i == 4) {
                break;
            }
        }
        System.out.println("\n--- Continue (Skip Evens) ---");
        for (int i = 1; i <= 6; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("\n--- Decrement Loop ---");
        for (int i = 50; i >= 0; i = i - 10) {
            System.out.println(i);
        }
        System.out.println("\n--- Sum Divisible by 3 and 5 ---");
        int sum = 0;
        for (int i = 30; i <= 120; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum = sum + i;
            }
        }
        System.out.println("Sum is: " + sum);
    }
}
