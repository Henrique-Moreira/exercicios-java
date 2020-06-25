package exercicios_vetores;

import java.util.Locale;
import java.util.Scanner;

public class oito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// 8) Tem-se um conjunto de dados contendo a altura e o sexo (M, F) de N pessoas. Fazer um programa que calcule e escreva:
		// -a maior e a menor altura do grupo
		// -a média de altura das mulheres
		// -o número de homens
		
		int N = sc.nextInt();
		double height[] = new double[N];
		char gender[] = new char[N];
		
		// Armazenar a altura e sexo em cada vetor correspondente.
		for(int i = 0; i < N; i++ ) {
			height[i] = sc.nextDouble();
			gender[i] = sc.next().charAt(0);
		}
		
		// Descobrir qual é a maior e menor altura.
		double highestHeight = 0.0, shortestHeight = 10.0;
		for(int i = 0; i < N; i++ ) {
			if(height[i] > highestHeight) {
				highestHeight = height[i];
			}
			else if (height[i] < shortestHeight) {
				shortestHeight = height[i];
			}
		}
		// Calcular a media de altura das mulheres e a quantidade de homens
		int totalFemales=0, totalMales=0;
		double  sumHeight=0.0;
		for(int i = 0; i < N; i++ ) {
			if (gender[i] == 'F' || gender[i] == 'f') {
				 sumHeight+=height[i];
				totalFemales++;
			} else {
				totalMales++;
			}
		}
		
		// Imprimir os dados exigidos
		System.out.println("Menor altura = " + shortestHeight);
		System.out.println("Maior altura = " + highestHeight);
		System.out.printf("Media das alturas das mulheres = %.2f%n", sumHeight/totalFemales);
		System.out.println("Número de homens = " + totalMales);
		
		
		sc.close();
	}

}
