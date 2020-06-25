package exercicios_vetores;

import java.util.Locale;
import java.util.Scanner;

public class nove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// 9) Um comerciante deseja fazer o levantamento do lucro das mercadorias que
		// ele comercializa. Para isto, mandou digitar
		// um conjunto de N mercadorias, cada uma contendo nome, preço de compra e preço
		// de venda das mesmas. Fazer um
		// programa que leia tais dados e determine e escreva quantas mercadorias
		// proporcionaram:
		// -lucro< 10%
		// -10% ≤ lucro ≤ 20%
		// -lucro> 20%
		// Determine e escreva também o valor total de compra e de venda de todas as
		// mercadorias, assim como o
		// lucro total.

		int N = sc.nextInt();
		String product[] = new String[N];
		double paid[] = new double[N];
		double sold[] = new double[N];

		// Armazenar os dados dos produtos nos vetores
		for (int i = 0; i < N; i++) {
			product[i] = sc.next();
			paid[i] = sc.nextDouble();
			sold[i] = sc.nextDouble();
		}

		// Criar uma variavel de lucros
		double store;
		double profit[] = new double[N];
		for (int i = 0; i < N; i++) {
			profit[i] = (sold[i] * 100 / paid[i]);
			
		}
		// Calcular e imprimir os dados relacionados a lucro
		int below10 = 0, between10and20 = 0, above20 = 0;
		for (int i = 0; i < N; i++) {
			if (profit[i] < 110.0 ) {
				below10++;
			} else if (profit[i] >= 110.0 && profit[i] < 120.0) {
				between10and20++;
			} else if (profit[i] > 120.0) {
				above20++;
			}
		}
		System.out.println("Lucro abaixo de 10%: " + below10);
		System.out.println("Lucro entre 10% e 20%: " + between10and20);
		System.out.println("Lucro acima de 20%: " + above20);

		// Calcular o valor total da compra e de venda e imprimir
		double totalPaid = 0, totalSale = 0;
		for (int i = 0; i < N; i++) {
			totalPaid += paid[i];
			totalSale += sold[i];
		}
		System.out.println("Valor total de compra: " + totalPaid);
		System.out.println("Valor total de venda: " + totalSale);

		// Calcular e imprimir o lucro total
		double totalProfit;
		totalProfit = totalSale - totalPaid;
		System.out.println("Lucro total: " + totalProfit);
		
		sc.close();
	}

}
