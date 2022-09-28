package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Salary;

public class Program2 {

	public static void main(String[] args) {
		/* Aula de List */
		
		Scanner sc = new Scanner(System.in);
		
		List<Salary> list = new ArrayList<>();
		
		int n;
		
		System.out.print("Quantos salarios deseja registrar? ");
		 n = sc.nextInt();
		 
		 for(int i=1; i<=n;i++) {
			 
			System.out.println();
			System.out.println("Empregado #" + i + ":");
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salario: ");
			double value = sc.nextDouble();
			
			Salary emp = new Salary(id,name,value);
			list.add(emp);
		 }
		
		System.out.println();
		System.out.print("Digite o id do funcionario para incrementar o salario : ");
		int idsalary = sc.nextInt();
		
		Integer pos = position(list, idsalary);
		
		if (pos == null) {
			System.out.println("Este ID não existe!");
		}else {
			System.out.print("Digite a porcentagem: ");
			double percent = sc.nextDouble();
			list.get(pos).increaseSalary(percent);
		}
		
		 System.out.println();
		 System.out.println("Liste os empregados:");
		 
		 for (Salary e : list) {
			 System.out.println(e);
		 }
				
		 
		 
		/*
		List<String> list = new ArrayList<>();
		list.add("Ana");
		list.add("Bruno");
		list.add("Carla");
		list.add("Alex");
		list.add(2,"Fabia"); //adiciona a posicao 2
		
		
		for(String obj : list) {
			System.out.println(obj);
		}
		System.out.println("-------------");
		System.out.println("Tamanho da lista: " + list.size());
		System.out.println("-------------");
		
		list.remove(3);
		list.removeIf(obj -> obj.charAt(0)=='M');
		
		for(String obj : list) {
			System.out.println(obj);
		}
		System.out.println("-------------");
		System.out.println("Index of Bruno: " + list.indexOf("Bruno"));
		System.out.println("-------------");
		List<String> result = list.stream().filter(obj -> obj.charAt(0) == 'A').collect(Collectors.toList());
		//o findFirst pega o primeiro com o 'A' filter(obj -> obj.charAt(0) == 'A').findFirst().orElse(null);
		for(String obj : result) {
			System.out.println(obj);
		}
		*/
		sc.close();
	}
	
	public static Integer position(List<Salary> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
	
	public static boolean hasId(List<Salary> list, int id) {
		Salary emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}
