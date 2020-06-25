package exercicios_vetores;

import java.util.Locale;
import java.util.Scanner;

public class quatro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//4) Fazer um programa para ler um vetor de N n�meros reais. Em seguida, mostrar na tela a m�dia aritm�tica de todos
		//elementos. Depois mostrar todos os elementos do vetor que estejam abaixo da m�dia.
		
		int N = sc.nextInt();
		double v[] = new double[N];
		
		// Armazenar os dados do vetor
		for(int i = 0; i < N; i++ ) {
			v[i] = sc.nextDouble();
		}
		// Calcular a media aritm�tica
		double soma=0.0;
		for(int i = 0; i < N; i++ ) {
			soma += v[i];
		}
		double media = soma/N;
		System.out.println(media);
		// Imprimir elementos que s�o abaixo da m�dia
		for(int i = 0; i < N; i++ ) {
			if(v[i] < media) {
				System.out.println(v[i]);
			}
		}
		sc.close();
	}

}
