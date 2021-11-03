public class PrintNumbers {

    public static void main(String args[]) {
        System.out.println("\nThe numbers between 1 to 100 divided by 3 are : ");
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0)
                System.out.print(i + ", ");
        }

        System.out.println("\n\nThe numbers between 1 to 100 divided by 5 are: ");
        for (int i = 1; i < 100; i++) {
            if (i % 5 == 0) System.out.print(i + ", ");
        }
    }
}
