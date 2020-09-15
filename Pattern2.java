import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int alphabet = 65;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Value Of the Alphabets...");
		int row =sc.nextInt();
		System.out.println("*****Printing the pattern*****");

        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print((char) alphabet + " ");
            }
            alphabet++;
            System.out.println();
        }
        sc.close();
	}

}
