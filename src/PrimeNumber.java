import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Enter the number :");
        int num = scanner.nextInt();
        // int num=10;
        int count=0;
        if(num>1)
        {
            for (int i=1;i<=num;i++){
                if(num%i==0)
                    count++;
            }
            if(count==2)
            {
                System.out.println(num + " is a prime number");
            }
            else {
                System.out.println(num + " is not a prime number");
            }

        }
        else{
            System.out.println(num + " is not a prime number");
        }
    }
}
