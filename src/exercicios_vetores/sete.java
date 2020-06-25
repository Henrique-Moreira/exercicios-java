package exercicios_vetores;

import java.util.Locale;
import java.util.Scanner;

public class sete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		// 7) Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram no 1o e 2o semestres.
		//Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir os nomes dos alunos aprovados,
		//considerando aprovados aqueles cuja média das notas seja maior ou igual a seis.
		
		int N = sc.nextInt();
		String name[] = new String[N];
		double first[] = new double[N];
		double second[] = new double[N];
		
		// Armazenar o nome, primeira e segunda notas no vetor.
		for(int i = 0; i < N; i++ ) {
			name[i] = sc.next();
			first[i] = sc.nextDouble();
			second[i] = sc.nextDouble();
		}
		// Criar um novo vetor com a média das notas de cada aluno
		double average[] = new double[N];
		for(int i = 0; i < N; i++ ) {
			average[i] = (first[i] + second[i])/2;
		}
		
		// Imprimir os alunos aprovados
		System.out.println("Alunos aprovados:");
		for(int i = 0; i < N; i++ ) {
			if (average[i] >= 6) {
				System.out.println(name[i]);
			}
		}
		
		sc.close();
	}

}
