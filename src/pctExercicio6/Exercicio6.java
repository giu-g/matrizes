package pctExercicio6;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// Giulia Galzerano
		Scanner sc = new Scanner(System.in);
		int[][] matriz = new int[5][5];
		int SomaImpar = 0;
		int[] SomaCol = new int[5];
		int[] SomaLin = new int[5];

		System.out.println("Digite os valores da matriz:");

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}

		System.out.println("A matriz fornecida é: \n");

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("| " + matriz[i][j] + " | ");
			}
			System.out.println();
		}
		System.out.println("-----------------------------");
		System.out.println("Os números ímpares são: \n");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (matriz[i][j] % 2 != 0) {
					System.out.print("| " + matriz[i][j] + " | ");
				}
			}
		}
		System.out.println("\n A soma dos números ímpares são: \n");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (matriz[i][j] % 2 != 0) {
					SomaImpar += matriz[i][j];
				}
			}
		}
		System.out.println(SomaImpar);
		System.out.println("-----------------------------");
		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 5; i++) {
				SomaCol[j] += matriz[i][j];
			}
		}
		for (int j = 0; j < 5; j++) {
			System.out.println("A soma da coluna " + j + " é " + SomaCol[j]);
		}
		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 5; i++) {
				SomaLin[i] += matriz[i][j];
			}
		}
		System.out.println("-----------------------------");

		for (int i = 0; i < 5; i++) {
			System.out.println("A soma da linha " + i + " é " + SomaLin[i]);
		}
		sc.close();
	}
}
