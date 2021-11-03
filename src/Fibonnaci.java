import java.util.Scanner;

public class Fibonnaci {
    public static void main(String[] args) {

        int num1 = 0, num2 = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Fibonacci Series of numbers:");
        int count = scanner.nextInt();


        for (int i = 1; i <= count; ++i)
        {
            System.out.print(num1 +" ");


            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
        }
    }
}
