
public class Pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int alphabet = 65;

        System.out.println("***** Printing the Pattern... *****");
        for (int i = 0; i <= 5; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print((char) alphabet + " ");
                alphabet++;
            }
            System.out.println();
        }
	}

}
