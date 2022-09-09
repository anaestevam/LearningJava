package application;
import java.util.Scanner;
import java.util.Locale;

import entities.Aluno;
import entities.Employee;
import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Aluno a = new Aluno();
		
		System.out.print("Name: ");
		a.nome = sc.nextLine();
		System.out.print("Nota primeira unidade: ");
		a.unidade1 = sc.nextDouble();
		System.out.print("Nota segunda unidade: ");
		a.unidade2 = sc.nextDouble();
		System.out.print("Nota terceira unidade: ");
		a.unidade3 = sc.nextDouble();
		
		System.out.println();
		System.out.println("FINAL GRADE =  " + a);
		System.out.println();
		
		if(a.notafinal()<60) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", a.missingPoints());
		}else {
			System.out.println("PASS");
		}
		
		//Questão do salário
		/*
		Employee a = new Employee();
		double porcentagem;
		
		System.out.print("Name: ");
		a.name = sc.nextLine();
		System.out.print("Gross Salary: ");
		a.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		a.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: %s" + a);
		System.out.println();
		
		System.out.print("Which percentage to increase salary?");
		porcentagem = sc.nextDouble();
		a.increaseSalary(porcentagem);
		
		System.out.println("Update data: %s" + a);
		*/
		//Questão do Retângulo
		/*
		Rectangle a = new Rectangle();
		
		System.out.println("Enter rectangle width and heigth: ");
		
		a.width = sc.nextDouble();
		a.height = sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n", a.area());
		System.out.printf("PERIMETER = %.2f%n", a.perimeter());
		System.out.printf("DIAGONAL = %.2f%n", a.diagonal());
		*/
		sc.close();
	}

}
