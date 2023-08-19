import java.lang.*;
import java.util.*;

public class Main {
	static int factorial (int n) {
		int fact=1;
		for(int i =1;i<=n;i++)
		{
			fact*=i;
		}
		return fact;
	}
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
    	Scanner sc = new Scanner(System.in);
    	int n,r,n_r, combination;
    	n=sc.nextInt();
    	r=sc.nextInt();
    	n = factorial(n);
    	r = fatorial(r);
    	n_r = factorial(n-r);
    	combination = n/(n_r*r);
    	System.out.print(combination);
    }
}