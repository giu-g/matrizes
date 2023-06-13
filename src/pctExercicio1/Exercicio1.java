package pctExercicio1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o número de linhas da matriz:");
		int linhas = sc.nextInt();
		System.out.println("Digite o número de colunas da matriz:");
		int colunas = sc.nextInt();

		int[][] matriz = new int[linhas][colunas];

		System.out.println("Digite os valores da matriz:");

		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}

		System.out.println("Matriz fornecida pelo usuário:");
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				System.out.print("| " + matriz[i][j] + " | ");
			}
			System.out.println();
		}
		sc.close();
	}
}