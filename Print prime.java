import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        for(int i = 2 ; i <= n ; i++){
            //check if i is prime or not
            boolean flag = true;
            for(int x = 2 ; x < i ; x++) {
                if(i % x == 0) {
                    flag = false;
                    break;
                }
            }
            
            if(flag == true) {
                System.out.println(i);
            }
        }
        
    }
}