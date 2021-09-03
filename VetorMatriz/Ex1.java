package VetorMatriz;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int maiorPonto = 0;
		int[] pontos = new int[5];

		for (int i = 0; i < 5; i++) {
			System.out.println("Digite a " + (i + 1) + "º pontuação: ");
			pontos[i] = entrada.nextInt();

			if (pontos[i] > maiorPonto) {
				maiorPonto = pontos[i];

			}
		}

		System.out.println("A maior pontuação é: " + maiorPonto);
		entrada.close();

	}

}
