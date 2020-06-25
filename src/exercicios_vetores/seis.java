package exercicios_vetores;

import java.util.Locale;
import java.util.Scanner;

public class seis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//6) Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Depois, mostrar na tela o nome
		//da pessoa mais velha.
		
		int N = sc.nextInt();
		String name[] = new String[N];
		int age[] = new int[N];
		
		// Armazenar o nome e idade no vetor
		for(int i = 0; i < N; i++ ) {
			name[i] = sc.next();
			age[i] = sc.nextInt();
		}
		// Verificar quem é mais velho e imprimir
		String NameOlder = "Ninguem";
		int ageOlder = 0;
		for(int i = 0; i < N; i++ ) {
			if(age[i] > ageOlder) {
				ageOlder = age[i];
				NameOlder = name[i];
			}
		}
		System.out.println("Pessoa mais velha: " + NameOlder);
		
		sc.close();
	}

}
