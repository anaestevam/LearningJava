package application;

import java.util.Scanner;
import java.util.*;
import java.io.*;
import java.math.*;
import entities.Aluguel;

public class Program1 {
	
	/*Aula de vetores*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Aluguel[] aluguel = new Aluguel[10];
		
		int n;
		
		System.out.print("How many rooms will be rented? ");
		 n = sc.nextInt();
		
		//ArrayList<Aluguel> aluguel = new ArrayList<Aluguel>();
		
		
		
		for(int i=1; i<=n; i++) {
			
			System.out.println();
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Room: ");
			int room = sc.nextInt();
			

			aluguel[room] = new Aluguel(name, email);
		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		
		
		for(int i=1; i<10 ;i++) {
			
			if(aluguel[i]!= null) {
				System.out.println(i + ": " + aluguel[i]);
			}
			
		}
		
		String[] vect = new String[] {"Maria", "Ana", "Lara"};
		
		for(int i=0;i<vect.length;i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println("----------------------");
		for(String obj : vect) {
			System.out.println(obj);
		}
		
		
		/*Vetores simples*/
		/*
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
		*/
		sc.close();
	}
	
		
}
