package entities;

public class Aluno {
	public String nome;
	public double unidade1;
	public double unidade2;
	public double unidade3;
	
	public double notafinal() {
		return (unidade1 + unidade2 + unidade3) / 3;
	}
	
	public double missingPoints() {
		if(notafinal()<60) {
			return 60 - notafinal();
			
		}else {
			return 0;
		}
	}
	
	public String toString() {
		return String.format("%.2f%n", notafinal());
	}

}
