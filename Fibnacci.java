import java.util.Scanner;

public class Fibnacci {
	static int n1=0, n2=1, n3=0;

	static void printFibnacci(int count)
	{
		if(count>0)
		{
			n3 = n1 + n2;
			n1 = n2; 
			n2 = n3;
			
			System.out.print(" "+n3);
			printFibnacci(count-1);
		}
	}
	public static void main(String[] args) {
		int n;
		System.out.println(n1 + " "+ n2);
		System.out.println("Enter no till what fibnacci series should print :");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		printFibnacci(n-2);
	}

}
