import java.util.Scanner;

public class Pattern32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Get the number of rows from the user
        System.out.println("Enter the number of rows needed to in the pattern ");

        int rows = scanner.nextInt();
        System.out.println("***** Printing the pattern *****");

        int temp = (rows * (rows - 1)) / 2;
        int alphabet = 65;

        for (int i = 1; i < rows; i++)
        {
            temp = temp - i;
            for (int j = 1; j <= i; j++)
            {
                System.out.print((char) (alphabet + temp + j - 1) + " ");
            }
            System.out.println();
        }
        scanner.close();
	}

}
