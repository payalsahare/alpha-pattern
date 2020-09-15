import java.util.Scanner;

public class Pattern33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Get the number of rows from the user
        System.out.println("Enter the number of rows needed to in the pattern ");

        int rows = scanner.nextInt();
        System.out.println("## Printing the pattern ##");

        int alphabet = 65;
        int k = 1;

        for (int i = 1; i <= rows; i++)
        {
            k = i;
            for (int j = 1; j <= i; j++)
            {
                System.out.print((char) (alphabet + k - 1) + " ");
                k = k + rows - j;
            }
            System.out.println();
        }
        scanner.close();
	}

}
