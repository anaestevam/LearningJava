import java.util.Scanner;

public class Excondicional {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// -------1---------
		int a;

		System.out.println("Digite valor de A:");
		a = sc.nextInt(); // receber o valor a partir do teclado nextLine ler a linha inteira

		if (a < 0) {
			System.out.println("NEGATIVO");
		} else {
			System.out.println("NÃO NEGATIVO");
		}

		// -------2---------
		int b;
		System.out.println("Digite valor de B:");
		b = sc.nextInt();

		if (b % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("ÍMPAR");
		}

		sc.close();
	}

}
