import java.util.Scanner;

public class Pattern37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Get the number of rows from the user
        System.out.println("Enter the number of rows needed to in the pattern ");

        int rows = scanner.nextInt();
        System.out.println("*****Printing the Pattern *****");

        int alphabet = 65;
        int temp = 0;
        for (int i = rows; i >= 1; i--)
        {
            for (int j = rows; j >= i; j--)
            {
                System.out.print((char) (alphabet + j - 1) + " ");
                temp = j;
            }
            for (int k = rows - i + 1; k < rows; k++)
            {
                System.out.print((char) (alphabet + temp - 1) + " ");
            }
            System.out.println();
        }
        scanner.close();
	}

}
