package entities;

public class Banco {
	private int number;
	private String nome;
	private double balance;
	
	public Banco(int number, String nome) {
		super();
		this.number = number;
		this.nome = nome;
	}
	
	public Banco(int number, String nome, double balance, double initialDeposit) {
		super();
		this.number = number;
		this.nome = nome;
		this.balance = balance;
		deposit(initialDeposit);
	}

	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
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
	
	public String toString() {
		return "Banco [number=" + number + ", nome=" + nome + ", balance=" + balance + "]";
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}
	
}
