import java.util.Scanner; //Alocar na memoria

public class Exestrutural {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		/*-------URI 1003---------
		 * Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
		   mensagem explicativa.
		 */
		/*
		 * int a; int b;
		 * 
		 * System.out.print("Digite valor de A:"); a = sc.nextInt(); //receber o valor a
		 * partir do teclado nextLine ler a linha inteira
		 * System.out.print("Digite valor de B:"); b = sc.nextInt(); //receber o valor a
		 * partir do teclado int soma = a + b; System.out.println("SOMA = " + soma);
		 */
		/*-------URI 1002---------
		 * Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
			casas decimais.
			Fórmula da área: area = π . raio2
			Considere o valor de π = 3.14159
		 */
		/*
		 * double c; double raio; double pi = 3.14159;
		 * 
		 * System.out.println("Digite valor de C:"); c = sc.nextDouble(); //receber o
		 * valor a partir do teclado nextLine ler a linha inteira raio = pi *
		 * Math.pow(c, 2.0);
		 * 
		 * System.out.printf("Resultado da area: %.4f%n ", raio);
		 */
		/*-------URI 1007---------
		 * Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
			de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D)
		 */
		/*
		 * int d,e,f,g, diferenca; System.out.print("Digite valor de D:"); d =
		 * sc.nextInt(); System.out.print("Digite valor de E:"); e = sc.nextInt();
		 * System.out.print("Digite valor de F:"); f = sc.nextInt();
		 * System.out.print("Digite valor de G:"); g = sc.nextInt();
		 * 
		 * diferenca = (d*e - f*g);
		 * 
		 * System.out.print("DIFERENCA = " + diferenca);
		 */

		/*-------URI 1008---------
		 * Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
			hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
			decimais.
		 */

		int a, b;
		double c, salario;

		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextDouble();

		salario = c * b;

		System.out.println("NUMBER = " + a);
		System.out.printf("SALARY = U$ %.2f%n", salario);

		sc.close();
	}

}
