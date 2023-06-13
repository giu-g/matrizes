package pctExercicio3;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		int[] vet1 = new int[5];
		int aux = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Forneça os números:");
		for (int i = 0; i < 5; i++) {
			vet1[i] = sc.nextInt();
		}
		for (int i = 0; i < 5; i++) {
			aux = aux + vet1[i];
		}
		System.out.println("A média é: " + (aux / 5));

		System.out.println("Os números maiores que a média são:");
		for (int i = 0; i < 5; i++) {
			if (vet1[i] > (aux / 5)) {
				System.out.println(vet1[i] + " ");
			}
		}
		System.out.println("Os números menores que a média são:");
		for (int i = 0; i < 5; i++) {
			if (vet1[i] < (aux / 5)) {
				System.out.println(vet1[i] + " ");
			}
		}
		sc.close();
	}
}