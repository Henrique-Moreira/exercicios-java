package exercicios_matrizes;

import java.util.Locale;
import java.util.Scanner;

public class dois {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[][] A = new int[N][N];
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N;j++) {
				A[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i < N; i++) {
			int soma = 0;
			for(int j = 0; j < N;j++) {
				soma += A[i][j];
			}
			System.out.println(soma);
		}
		
		sc.close();
	}

}
