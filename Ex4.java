package VetorMatriz;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int matriz[][] = new int[3][3];
		int somaDiagonal;
		for(int l = 0; l < matriz.length ; l++) {
			for(int c = 0; c < matriz[l].length; c++) {
				System.out.print("Por favor, Digite o valor da: " + l + " " + c + ": ");
                matriz[l][c] = entrada.nextInt();
               
			}
		}
		 somaDiagonal = matriz[0][0] + matriz[1][1] + matriz [2][2];
         
         System.out.println("a Soma da diagonal é: " + somaDiagonal);	
	
	
	entrada.close();
	}

}
