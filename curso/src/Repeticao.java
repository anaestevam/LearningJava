import java.util.Locale;
import java.util.Scanner;

public class Repeticao {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// -------1---------
		int a;
		int soma = 0;

		System.out.println("Digite valor de A:");
		a = sc.nextInt(); // receber o valor a partir do teclado nextLine ler a linha inteira

		while (a != 0) {
			soma += a;
			a = sc.nextInt();
		}

		System.out.println("Soma dos valores inseridos: " + soma);

		/*
		 * int x = 0; int y = 4;
		 * 
		 * while(x<3) { y = y+2; x= x+1; System.out.println(x + " - " + y); }
		 */

		char resp;

		do {
			System.out.print("Digite a temperatura em Celsius: ");
			double b = sc.nextDouble();
			double formula = 9 * b / 5 + 32;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n ", formula);
			System.out.println("Deseja repetir (s/n)");
			resp = sc.next().charAt(0);
		} while (resp != 'n' && resp == 's');

		sc.close();
	}

}
