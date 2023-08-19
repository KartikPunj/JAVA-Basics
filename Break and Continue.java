import java.util.*;
class Main {
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc = new Scanner(System.in);
		
		//Print factors of a number
		int n = sc.nextInt();
		
		/*
		for(int i = 1; i <= n; i++){
			if(n % i == 0){ // i completely divides n
				System.out.print(i + " ");
			}
		}
		*/
		
		/*
		N = 6
		
		i      i <= n     n % i == 0    				i++
		1 		true  		true		--> Print 1		2	
		2		true 		true		--> Print 2		3
		3		true 		true		--> Print 3		4
		4		true 		false						5
		5		true 		false						6
		6		true		true  		--> Print 6		7
		7		false	----------> break
		
		
		6 / 4 = 1 remainder -- > 2
		6 / 5 = 1 remainder -- > 1
		
		*/
		
		/*
		//count all factors
		int count = 0;
		for(int i = 1; i <= n; i++){
			if(n % i == 0){ // i completely divides n
				count = count + 1;
			}
		}
		System.out.print(count);
		*/
		/*
		// n = 6 count = 0
		
		i 		i<=n 	n%i== 0 	count		i++
		1		true	true		1			2
		2		true   	true		2			3
		3		true	true		3			4
		4		true	false		-			5
		5		true	false		-			6
		6		true	true		4			7
		7		false	---------> break
		
		
		print (count) ---> 4
		 */
		
		
		//Break statements
		//N = 5
		// for(int i = 1; i <= n; i++){
		// 	System.out.println(i);
		// 	if(i == 3){
		// 		break;
		// 	}
		// }
		/*
		i 		i<=n 					i==3		i++
		1		true	-->Print 1		false		2
		2		true	-->Print 2		false		3
		3		true 	-->Print 3		true ------->break
		*/
		
		// int i;
		// for( i = 1; i <= n; i++){
		// 	System.out.println(i); //1
		// 	break;//2
			
		// }
		// System.out.print(i);
		
		// n = 5
		// i 	i<=n 							i++
		// 1	true-->Print 1 ----->break
		
		
		// n = 10
		//Continue ---> skips to the next iteration
		// for(int i = 1; i <= n; i++){
		// 	if(i == 5){
		// 		break;
		// 	}
		// 	System.out.println(i);
		// }
		
		/*
		i 	i<=n 		i == 5					i++
		1	true		false   	Print(1)	2
		2	true		false		Print(2)	3
		3	true		false		Print(3)	4
		4	true		false		Print(4)	5
		5	true		true --------------> break
		*/
		
		
		for(int i = 1; i <= n; i++){
			if(i == 5){
				continue;
			}
			if(i == 7){
				break;
			}
			System.out.println(i);
			
		}
		/*
		i 	i<=n 	i==5					i++
		1	true	false		Print(1)	2
		2	true	false		Print(2)	3
		3	true	false		Print(3)	4
		4	true	false		Print(4)	5
		5	true	true -----------------> 6
		6 	true 	false		Print(6)	7
		7	true  	false --------------->break		
		*/
		
		
	}
}
