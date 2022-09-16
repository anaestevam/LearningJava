package application;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o tamanho do vetor: ");
		int num = sc.nextInt();
		
		double[] vetor = new double[num];
		
		for(int i=0;i<num;i++) {
			vetor[i] = sc.nextDouble();
		}
		
		for(int i=0;i<num;i++) {
			System.out.print(vetor[i] + ",");
		}
		
		double soma = 0.0;
		
		for(int i=0;i<num;i++) {
			soma += vetor[i];
		}
		
		System.out.println();
		double media_vetor = soma / num;
		System.out.printf("A média dos elementos do vetor: %.2f", media_vetor);
		
		sc.close();
	}
	
		
}
