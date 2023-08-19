import java.util.*;
class Main {
	public static void main(String args[]) {
		// Your code goes here
       
        Scanner sc = new Scanner(System.in);
        
        /*
        *
        * 2
        * 2 *
        * 2 * 4
        * 2 * 4 *
        * 2 * 4 * 6
        
        */
        
         int N = sc.nextInt();
        
        // for(int i=1; i <=N; i++){
        //     for(int j=1; j<=i; j++){
        //         if(j % 2 != 0){
        //             System.out.print(" * ");
                    
        //         }else{
        //             System.out.print(j);
        //         }
               
        //     }
        //      System.out.println();
        // }
        
         /*
        *
        * 1
        * 1 *
        * 1 * 2
        * 1 * 2 *
        * 1 * 2 * 3
        
        */
        // // 1st approach j/2
        // for(int i=1; i <=N; i++){
        //     for(int j=1; j<=i; j++){
        //         if(j % 2 != 0){
        //             System.out.print(" * ");
                    
        //         }else{
        //             System.out.print(j/2);
        //         }
               
        //     }
        //      System.out.println();
        // }
        
        // // 2nd approach using count variable
        
        //  for(int i=1; i <=N; i++){
        //      int count = 1;
        //     for(int j=1; j<=i; j++){
        //         if(j % 2 != 0){
        //             System.out.print(" * ");
                    
        //         }else{
        //             System.out.print(count++);
        //         }
               
        //     }
        //      System.out.println();
        // }
        
        
        //  for(int i=1; i <=N; i++){
        //     for(int j=1; j<=N-i; j++){
        //         System.out.print("  ");
        //     }
            
        //     for(int j=1; j<=i; j++){
        //         System.out.print(" *");
        //     }
            
        //     System.out.println();
        // }
        
        // first space inverted triangle
        
        //    for(int i=1; i <=N; i++){
        //     for(int j=1; j<=i-1; j++){
        //         System.out.print("  ");
        //     }
            
        //     for(int j=1; j<=N-i+1; j++){
        //         System.out.print(" *");
        //     }
            
        //     System.out.println();
        // }
        
        
        // payjamma pattern
        
           for(int i=1; i <=N; i++){
            for(int j=1; j<=N-i+1; j++){
                System.out.print("* ");
            }
            
            for(int j=1; j<=2*(i-1); j++){
                System.out.print("  ");
            }
            
            for(int j=1; j<=N-i+1; j++){
                System.out.print(" *");
            }
            
            System.out.println();
        }
        
        // ulta payjamma
        
           for(int i=1; i <=N; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            
            for(int j=1; j<=2*(N-i); j++){
                System.out.print("  ");
            }
            
            for(int j=1; j<=i; j++){
                System.out.print(" *");
            }
            
            System.out.println();
        }
       
	}
}