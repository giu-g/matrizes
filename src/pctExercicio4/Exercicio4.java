package pctExercicio4;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		double[] vet1 = new double[10];
		Scanner sc = new Scanner(System.in);

		System.out.println("Forneça os números:");
		for (int i = 0; i < 10; i++) {
			vet1[i] = sc.nextDouble();
		}
		System.out.println("Os números digitados foram:");
		for (int i = 9; i >= 0; i--) {
			System.out.println(vet1[i] + " ");
		}
		System.out.println();
		sc.close();
	}
}