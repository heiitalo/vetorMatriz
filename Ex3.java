package VetorMatriz;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		int N1[][] = new int[4][6]; 
		int N2[][] = new int[4][6]; 
		int M1[][] = new int[4][6]; 
		int M2[][] = new int[4][6]; 
		
		for(int l = 0; l < N1.length; l++) {
			for(int c = 0; c < N1[l].length; c++) {
			System.out.print("Digite o valor da N1 " + l + " " + c + ": " );	
			N1[l][c] = entrada.nextInt();
			
			}
		}
		for(int l = 0; l < N2.length; l++) {
			for(int c = 0; c < N2[l].length; c++) {
			System.out.print("Digite o valor da N2 " + l + " " + c + ": " );	
			N2[l][c] = entrada.nextInt();
			}
			
			
		}
       System.out.println("\n");
       System.out.println("===== M1 =====");
		for(int l = 0; l < M1.length; l++) {
        	for(int c = 0; c < M1[l].length; c++){
        		M1[l][c] = N1[l][c] + N2[l][c];
        		
        		System.out.print("|" + M1[l][c] +  "|"  );
        	}
        
        }
        System.out.println("\n");
        System.out.println("==== M2 ====");
		for(int l = 0; l < M2.length; l++) {
        	for(int c = 0; c < M2[l].length; c++) {
        		M2[l][c] = N1[l][c] - N2[l][c];
        		System.out.print("|" + M2[l][c] + "|");
        		
        		
        	}
                    
        }
       
      entrada.close();  
	}
	
	

}
