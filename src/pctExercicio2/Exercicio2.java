package pctExercicio2;

public class Exercicio2 {

	public static void main(String[] args) {
		String[][] clientes = new String[3][4];

		clientes[0][0] = "João";
		clientes[0][1] = "Rua Das Flores, 123";
		clientes[0][2] = "003.387.480-83";
		clientes[0][3] = "(77) 2374-2325";
		clientes[1][0] = "Maria";
		clientes[1][1] = "Avenida dos Anjos, 456";
		clientes[1][2] = "271.142.020-59";
		clientes[1][3] = "(84) 3624-2176";
		clientes[2][0] = "Pedro";
		clientes[2][1] = "Praça da Liberdade, 789";
		clientes[2][2] = "107.858.940-20";
		clientes[2][3] = "(66) 3622-6354";

		for (int i = 0; i < 3; i++) {
			System.out.println("Nome: " + clientes[i][0]);
			System.out.println("Endereço: " + clientes[i][1]);
			System.out.println("CPF: " + clientes[i][2]);
			System.out.println("Telefone: " + clientes[i][3]);
			System.out.println();

		}
	}
}