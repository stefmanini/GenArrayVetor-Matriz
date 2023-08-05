package JavaS;

import java.util.Scanner;

public class ArrayMatriz4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner leia = new Scanner(System.in);
	        double[][] notas = new double[10][4];
	        double[] medias = new double[10];

	        // Leitura das notas dos participantes
	        for (int participante = 0; participante < 10; participante++) {
	            System.out.println("Digite as notas do participante " + (participante + 1) + ":");
	            for (int bimestre = 0; bimestre < 4; bimestre++) {
	                System.out.print("Nota do bimestre " + (bimestre + 1) + ": ");
	                notas[participante][bimestre] = leia.nextDouble();
	            }
	        }
	        for (int participante = 0; participante < 10; participante++) {
	            double soma = 0;
	            for (int bimestre = 0; bimestre < 4; bimestre++) {
	                soma += notas[participante][bimestre];
	            }
	            medias[participante] = soma / 4;
	        }
	        System.out.println("Médias dos participantes:");
	        for (int participante = 0; participante < 10; participante++) {
	            System.out.println("Participante " + (participante + 1) + ": " + medias[participante]);
	        }
	        leia.close();
	    }
	}

