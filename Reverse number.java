import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner inpt = new Scanner(System.in);
        int T = inpt.nextInt();
        for (int i=1;i<=T;i++)
        {
            long num = inpt.nextInt();
            long rev =0;
            while(num!=0)
            {
                int rem = (int)num%10;
                rev= rev*10 + rem;
                num=num/10;
            }
            System.out.println(rev);
        }
        
        
    }
}