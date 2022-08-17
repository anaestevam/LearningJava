
public class FuncoesString {

	public static void main(String[] args) {
		
		String original = "abcde FGHIJ ABC abc DEFG   ";
		
		String s1 = original.toLowerCase(); //toda string minúscula
		String s2 = original.toUpperCase(); //toda string maiúscula
		String s3 = original.trim(); //elimina os espaços da string
		String s4 = original.substring(2); //cria uma nova string a partir da posição 2
		String s5 = original.substring(2,9); //cria uma nova string entre posições 2 e 9
		String s6 = original.replace('a','x'); //cria uma nova string e troca 'a' por 'x'
		int i = original.indexOf("bc"); //informa a posição do primeiro bc
		int j = original.lastIndexOf("bc"); //informa a posição do último bc
		
		System.out.println("Original: " + original + "-");
		System.out.println("toLoweCase: " + s1);
		System.out.println("toUpperCase: " + s2);
		System.out.println("trim: " + s3 + "-");
		System.out.println("substring(2): " + s4 + "-");
		System.out.println("substring(2,9): " + s5 + "-");
		System.out.println("replace: " + s6 + "-");
		System.out.println("Index of: " + i);
		System.out.println("Last index of: " + j);
		
		/*OPERAÇÃO SPLIT*/
		
		String s = "orange apple lemon";
		
		String[] vect = s.split(" ");
		
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
	}

}
