package exercicios_vetores;

import java.util.Locale;
import java.util.Scanner;

public class dois {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//2) Fa�a um programa que leia N n�meros inteiros e armazene-os em um vetor. Em seguida, mostre na tela:
		//- todos os n�meros pares
		//- a quantidade de n�meros pares
		
		int N = sc.nextInt();
		int v[] = new int[N];
		
		// Armazenar os dados do vetor
		for(int i = 0; i < N; i++ ) {
			v[i] = sc.nextInt();
		}
		
		// Saber qual � par e somar eles
		int qnt = 0;
		for(int i = 0; i < N; i++ ) {
			if (v[i] % 2 == 0) {
				System.out.print(v[i]+ " ");
				qnt++;
			}
		}
		System.out.println();
		System.out.println(qnt);
		
		sc.close();
	}

}
