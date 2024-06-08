package exercises;

import java.util.Scanner;

public class EvenNums {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
        System.out.println("Ingrese un número entero");
		int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        

        scanner.close();
        System.err.println(IsWeird(N));
        
       
        
    }
	
	public static String IsWeird(int number){
        String cad = null;
		if((number%2 ==0)&&(2<=number && number<=5)) {
        	cad="Not Weird";
        }
		else if((number%2 ==0)&&(6<=number && number<=20)) {
			cad="Weird";
		}
		else if((number%2 ==0)&&(20<number)) {
			cad="Not Weird";
		}else {
			cad="Weird";
		}
		return cad;
    }
}//class
