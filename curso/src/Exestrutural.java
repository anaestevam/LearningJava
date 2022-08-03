
import java.util.Scanner; //Alocar na memoria
public class Exestrutural {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		//-------1---------
		int a;
		int b;
		
		System.out.println("Digite valor de A:");
		a = sc.nextInt(); //receber o valor a partir do teclado nextLine ler a linha inteira
		System.out.println("Digite valor de B:");
		b = sc.nextInt(); //receber o valor a partir do teclado
		int soma = a + b;
		System.out.println("Resultado da soma: " + soma);
		
		//-------2---------
		double c;
		double raio;
		double pi = 3.14159;
		
		System.out.println("Digite valor de A:");
		c = sc.nextDouble(); //receber o valor a partir do teclado nextLine ler a linha inteira
		raio = pi * Math.pow(c, 2.0);
		
		System.out.println("Resultado da area: " + raio);
		
		sc.close();
	}

}
