package JavaS;

import java.util.Scanner;

public class ArrayMatriz3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] numeros = new int [3][3];
		int l,c,somaDPrincipal=0,somaDSecundaria=0;
		String elementosDPrincipal="",elementosDSecundaria="";
		
		Scanner leia = new Scanner(System.in);
		for(l=0;l<3;l++) {
			for(c=0;c<3;c++) {
				System.out.printf("\nDigite um número na posição [%d][%d]: ",l,c);
				numeros[l][c] = leia.nextInt();
				
				if(l == c) {
					elementosDPrincipal += numeros[l][c]+ " ";
					somaDPrincipal += numeros [l][c];
					
				}
				if(l+c == 2) {
					elementosDSecundaria += numeros[l][c]+ " ";
					somaDSecundaria += numeros [l][c];
				}
			}
		}
		System.out.println("\nElementos da diagonal principal: "+elementosDPrincipal);
		System.out.println("\nElementos da diagonal secundária: "+elementosDSecundaria);
		System.out.println("\nSomatórios dos elementos da diagonal secundária: "+somaDPrincipal);
		System.out.println("\nSomatórios dos elementos da diagonal secundária: "+somaDSecundaria);
	}

}
