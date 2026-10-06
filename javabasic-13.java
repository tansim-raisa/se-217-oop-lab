package main;
public class Main {
    public static void main(String[] args) {
        int a[] = new int[3];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        int x = a[0] + a[2];
        System.out.println("Value of x: " + x);
        a[2] = 100;
        x = a[0] + a[2];
        System.out.println("Value of x: " + x);
        int arr[] = { 1, 3, 44, -4, 5 };
        System.out.println("Size of arr: " + arr.length);
        System.out.println("Value of index 0: " + arr[0]);
        System.out.println("Value of index 3: " + arr[3]);
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }
        char charArr[] = { 'H', 'I' };
        System.out.println(charArr);
        System.out.println(charArr[1]);
    }
}

