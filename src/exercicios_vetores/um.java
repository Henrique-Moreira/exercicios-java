package exercicios_vetores;

import java.util.Locale;
import java.util.Scanner;

public class um {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//1) Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela o maior número
		// do vetor (supor não haver empates). Mostrar também a posição do maior elemento.
		
		int N = sc.nextInt();
		double v[] = new double[N];
		
		// Armazenar os dados do vetor
		for(int i = 0; i < N; i++ ) {
			v[i] = sc.nextDouble();
		}
		
		// Saber qual é o maior vetor e a posição dele
		double maior = 0.0;
		int position = 0;
		for(int i = 0; i < N; i++ ) {
			if(v[i] > maior) {
				maior = v[i];
				position = i;
			}
		}
		System.out.println(maior);
		System.out.println(position);
		
		sc.close();
	}

}
