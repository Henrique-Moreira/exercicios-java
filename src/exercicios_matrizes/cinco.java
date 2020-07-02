package exercicios_matrizes;

import java.util.Locale;
import java.util.Scanner;

public class cinco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		int [][] A = new int[M][N];
		int [][] B = new int[M][N];
		int [][] C = new int[M][N];
		
		for(int i = 0; i < M; i++) {
			for(int j = 0; j < N;j++) {
				A[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i < M; i++) {
			for(int j = 0; j < N;j++) {
				B[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i < M; i++) {
			for(int j = 0; j < N;j++) {
				C[i][j] = A[i][j] + B[i][j];
			}
		}
		
		for(int i = 0; i < M; i++) {
			for(int j = 0; j < N; j++) {
				System.out.print(C[i][j] + " ");
			}
			System.out.println();
		}
		
		
		sc.close();
	}

}
