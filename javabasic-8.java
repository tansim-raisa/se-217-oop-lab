package main;
public class Main {
    public static void main(String[] args) {
        int x;
        x = 7 + 5;
        System.out.println("Value of x is: " + x);
        x += 10;
        System.out.println("Value of x after += 10 is: " + x);
        x -= 10;
        System.out.println("Value of x after -= 10 is: " + x);
        x = 5;
        System.out.println("Current value of x is: " + x++);
        System.out.println("Current value of x is: " + ++x);
        x = 5;
        System.out.println("Current value of x is: " + ++x);
        System.out.println("Current value of x is: " + x++);
        x = 4 + 3 * 4 / 2 - 7;
        System.out.println("Result of (4 + 3 * 4 / 2 - 7) is: " + x);
    }
}
