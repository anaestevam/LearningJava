import java.util.Locale; //para localizacao da escrita numerica
import java.util.Scanner; //Alocar na memoria
public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		double x = 10.1234;
		System.out.println("Bom dia");
		System.out.printf("%.2f%n", x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);
		
		Scanner sc = new Scanner(System.in);
		Thread.currentThread();
		
		/*int a;
		char b;
		String c;
		System.out.println("Digite uma String:");
		c = sc.next(); //receber o valor a partir do teclado nextLine ler a linha inteira
		System.out.println("Você digitou: " + c);
		Thread.sleep(2000);
		System.out.println("Digite um valor inteiro:");
		a = sc.nextInt(); //receber o valor a partir do teclado
		System.out.println("Você digitou: " + a);
		Thread.sleep(2000);
		System.out.println("Digite uma letra:");
		b = sc.next().charAt(0);  //receber o valor a partir do teclado
		System.out.println("Você digitou: " + b);*/
		
		
		float soma = 0;
		float delta = (float) 0.1;
		int n = 1000;

		for(int i = 0; i < n; i++) {
			soma += delta;
		}

		System.out.printf("%f = %f?\n", delta*n, soma);
		
		sc.close();
	}

}
