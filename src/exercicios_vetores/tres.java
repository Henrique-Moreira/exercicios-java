package exercicios_vetores;

import java.util.Locale;
import java.util.Scanner;

public class tres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// 3) Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um terceiro vetor C onde
		// cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima o vetor C gerado.
		
		int N = sc.nextInt();
		int A[] = new int[N];
		int B[] = new int[N];
		
		// Armazenar os dados do vetor A
		for(int i = 0; i < N; i++ ) {
			A[i] = sc.nextInt();
		}
		// Armazenar os dados do vetor B
		for(int i = 0; i < N; i++ ) {
			B[i] = sc.nextInt();
		}
		// Criar um terceiro vetor onde cada elemento é a soma dos elementos de A e B
		int C[] = new int[N];
		for(int i = 0; i < N; i++ ) {
			C[i] = A[i] + B[i];
		}
		// Imprimir os valores de C
		for(int i = 0; i < N; i++ ) {
			System.out.print(C[i] + " ");
		}
		
		
		
		sc.close();
	}

}
