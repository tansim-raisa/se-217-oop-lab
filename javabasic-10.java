package main;
public class Main {
    public static void main(String[] args) {
        System.out.println("--- 1. Print message a fixed number of times ---");
        int x = 3;
        while (x <= 5) {
            System.out.println("Let me Go!");
            x++;
        }
        System.out.println("\n--- 2. Numbers from 1 to 100 ---");
        int a = 1;
        while (a <= 100) {
            System.out.print(a + " ");
            a++;
        }
        System.out.println();
        System.out.println("\n--- 3. Numbers incremented by 5 (1, 6, 11... 96) ---");
        int b = 1;
        while (b <= 100) {
            System.out.print(b + " ");
            b = b + 5;
        }
        System.out.println();
        System.out.println("\n--- 4. Sum of the series (5 to 100) ---");
        int sum = 0;
        int i = 5;
        while (i <= 100) {
            sum = sum + i;
            i = i + 5;
        }
        System.out.println("Sum is: " + sum);
    }
}
