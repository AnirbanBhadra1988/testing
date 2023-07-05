import java.util.Scanner;

public class StarPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;

		try(Scanner scan=new Scanner(System.in)){
			System.out.println("Enter pyramid height");
			n= scan.nextInt();

			printStar(n);
		}

	}
	public static void printStar(int j)
	{
		for (int row=0;row<=j;row++) {
			for(int column=0;column<=row;column++) {
				System.out.print("*");
			}
			System.out.println();

		}

	}

}
