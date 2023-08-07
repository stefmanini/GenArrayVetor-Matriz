package JavaS;

import java.util.Scanner;

public class ArrayVetor2 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[] array = new int[10];
        int countPares = 0;
        int countImpares = 0;

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
		
        for (int i = 0; i < array.length; i++) {
        	
            if (array[i] % 2 == 0) {
                countPares++;
            } else {
                countImpares++;
            }
        }

        int[] pares = new int[countPares];
        int[] impares = new int[countImpares];
        int indexPares = 0;
        int indexImpares = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                pares[indexPares] = array[i];
                indexPares++;
            } else {
                impares[indexImpares] = array[i];
                indexImpares++;
            }
        }

        // Criando a string com os números pares separados por vírgula
        String paresString = "";
        for (int s = 0; s < pares.length; s++) {
            if (s > 0) {
                paresString += ", ";
            }
            paresString += pares[s];
        }

        // Criando a string com os números ímpares separados por vírgula
        String imparesString = "";
        for (int s = 0; s < impares.length; s++) {
            if (s > 0) {
                imparesString += ", ";
            }
            imparesString += impares[s];
        } 
        int soma = 0;
		for (int i = 0; i < array.length; i++) {
			soma += array[i];
		} 
		double media = 0.0;
		media = soma / array.length;

		System.out.println("Esses números pares são: " + paresString);
		System.out.println("Esses números ímpares são: " + imparesString);
		System.out.println("A soma dos números é igual a: "+soma);
		System.out.println("A média da soma dos números é igual a: "+media);
		
		leia.close();
	}

}
