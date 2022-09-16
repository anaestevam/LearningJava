package entities;

public class Banco {
	private int number;
	private String nome;
	private double balance;
	
	public Banco(int number, String nome) {
		this.number = number;
		this.nome = nome;
	}
	
	public Banco(int number, String nome, double initialDeposit) {
		this.number = number;
		this.nome = nome;
		deposit(initialDeposit);
	}

	public int getNumber() {
		return number;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}
	
	public String toString() {
		return "Banco " 
				+ number 
				+ ", nome=" 
				+ nome 
				+ ", balance $" 
				+ String.format("%.2f", balance);
	}
}
