package exercicios_matrizes;

import java.util.Locale;
import java.util.Scanner;

public class um {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int linha = sc.nextInt();
		int coluna = sc.nextInt();
		
		int[][] A = new int[linha][coluna];
		
		for(int i = 0; i < linha; i++) {
			for(int j = 0; j < coluna;j++) {
				A[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("VALORES NEGATIVOS:");
		for(int i = 0; i < linha; i++) {
			for(int j = 0; j < coluna;j++) {
				if (A[i][j] < 0 ) {
				System.out.println(A[i][j]);
				}
			}
		}
		
		
		
		
		sc.close();
	}

}
