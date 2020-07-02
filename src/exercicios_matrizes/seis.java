package exercicios_matrizes;

import java.util.Locale;
import java.util.Scanner;

public class seis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		double[][] A = new double[N][N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				A[i][j] = sc.nextDouble();
			}
		}

		int linha, coluna;
		linha = sc.nextInt();
		coluna = sc.nextInt();

		// somar e imprimir os numeros positivos
		double soma = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (A[i][j] > 0) {
					soma += A[i][j];
				}
			}
		}
		System.out.println("SOMA DOS POSITIVOS: " + soma);

		// imprimir os elementos da linha escolhida
		System.out.print("LINHA ESCOLHIDA:");
		for (int x = 0; x < N; x++) {
			System.out.print(" " + A[linha][x]);
		}
		System.out.println();

		// imprimir os elementos da coluna escolhida
		System.out.print("COLUNA ESCOLHIDA:");
		for (int x = 0; x < N; x++) {
			System.out.print(" " + A[x][coluna]);
		}
		System.out.println();

		// imprimir os elementos da diagonal principal
		System.out.print("DIAGONAL PRINCIPAL:");
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if(i == j) {
					System.out.print(" " + A[i][j]);
				}
			}
		}
		System.out.println();
		
		// alterar a matriz elevando ao quadrados os numeros negativos da mesma e imprimir.
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (A[i][j] < 0) {
					A[i][j] = Math.pow(A[i][j], 2);
				}
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}

		sc.close();
	}

}
