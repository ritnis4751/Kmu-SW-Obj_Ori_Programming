// ****************************************************************
// MathUtils.java
//
// Provides static mathematical utility functions.
//          
// ****************************************************************

public class MathUtils{
    //-------------------------------------------------------------
    // Returns the factorial of the argument given
    //-------------------------------------------------------------
    public static int factorial(int n) throws IllegalArgumentException{
	int fac = 1;
		if (n < 0) throw new IllegalArgumentException("The number is negative.");
		if (n >= 17) throw new IllegalArgumentException("The number's factorial was been overflowed.");
	for (int i=n; i>0; i--)
	    fac *= i;
	return fac;
    }
}