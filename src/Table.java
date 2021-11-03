import java.util.Scanner;

public class Table {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a Java Program to Print Table of a Number");
        System.out.println("Enter a Number : ");
        int n = scanner.nextInt();

        for (int i = 1; i <= 10; ++i)
            System.out.println(n + " * " + i + " = " + n * i);
    }
}
