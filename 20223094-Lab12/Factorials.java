// ****************************************************************
// Factorials.java
//
// Reads integers from the user and prints the factorial of each.
//          
// ****************************************************************

import java.util.Scanner;

public class Factorials
{
    public static void main (String[] args)
    {
		char keepGoing = 'y';
	
		while (keepGoing == 'y' || keepGoing == 'Y'){
			System.out.print("Enter an integer: ");
			Scanner in = new Scanner(System.in);
			int val = in.nextInt();
			try {
				if (val < 0) throw new IllegalArgumentException("The number is negative.");
				if (val >= 17) throw new IllegalArgumentException("The number's factorial was been overflowed.");
				System.out.println("Factorial(" + val + ") = " 
						   + MathUtils.factorial(val));
				System.out.print("Another factorial? (y/n) ");
				keepGoing = in.next().charAt(0);
			}catch(IllegalArgumentException e) {
				System.out.println(e);
				System.out.print("Another factorial? (y/n) ");
				keepGoing = in.next().charAt(0);
			}
		}
    }
}
