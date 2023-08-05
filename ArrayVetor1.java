package JavaS;

import java.util.Scanner;

public class ArrayVetor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Dado um vetor contendo 10 números inteiros não ordenados e não repetidos,
//		construa um algoritmo que consiga pesquisar dados no vetor, onde o usuário irá
//		digitar um número e o programa deve exibir na tela a posição deste número no vetor.
//		Caso o número não seja encontrado, a mensagem: “Não foi encontrado!” deve ser
//		exibida na tela.

		Scanner leia = new Scanner(System.in);

		int[] array = new int[10];
		int x;

		array[0] = 2;
		array[1] = 5;
		array[2] = 1;
		array[3] = 3;
		array[4] = 4;
		array[5] = 9;
		array[6] = 7;
		array[7] = 8;
		array[8] = 10;
		array[9] = 6;

		System.out.println("\nDigite o número que você deseja encontrar: ");
		x = leia.nextInt();

		boolean encontrado = false;

		for (int i = 0; i < array.length; i++) {
			if (array[i] == x) {
				System.out.println("\nO número está na posição: " + i);
				encontrado = true;
				break;

			}
		}
		if (!encontrado) {
			System.out.println("\nNão foi encontrado!");
		}
		leia.close();
	}
}
