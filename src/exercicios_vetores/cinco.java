package exercicios_vetores;

import java.util.Locale;
import java.util.Scanner;

public class cinco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// 5) Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média aritmética somente
		//dos números pares lidos.
		
		int N = sc.nextInt();
		int v[] = new int[N];
		
		// Armazenar os dados do vetor
		for(int i = 0; i < N; i++ ) {
			v[i] = sc.nextInt();
		}
		// Calcular e imprimir a media aritmética dos numeros pares
		double soma=0.0;
		int pares=0;
		for(int i = 0; i < N; i++ ) {
			if(v[i] % 2 == 0) {
				soma += v[i];
				pares++;
			}
		}
		System.out.println(soma/pares);
		
		sc.close();
	}

}
