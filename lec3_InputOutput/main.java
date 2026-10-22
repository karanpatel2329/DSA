package lec3_InputOutput;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        System.out.println("Enter num 1");
        a = scanner.nextInt();
        System.out.println("Enter num 2");
        b = scanner.nextInt();
        System.out.println("Sum is " + (a + b));
        scanner.close();
    }
}
