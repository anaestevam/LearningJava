
public class FuncoesString {

	public static void main(String[] args) {
		
		String original = "abcde FGHIJ ABC abc DEFG   ";
		
		String s1 = original.toLowerCase(); //toda string min�scula
		String s2 = original.toUpperCase(); //toda string mai�scula
		String s3 = original.trim(); //elimina os espa�os da string
		String s4 = original.substring(2); //cria uma nova string a partir da posi��o 2
		String s5 = original.substring(2,9); //cria uma nova string entre posi��es 2 e 9
		String s6 = original.replace('a','x'); //cria uma nova string e troca 'a' por 'x'
		int i = original.indexOf("bc"); //informa a posi��o do primeiro bc
		int j = original.lastIndexOf("bc"); //informa a posi��o do �ltimo bc
		
		System.out.println("Original: " + original + "-");
		System.out.println("toLoweCase: " + s1);
		System.out.println("toUpperCase: " + s2);
		System.out.println("trim: " + s3 + "-");
		System.out.println("substring(2): " + s4 + "-");
		System.out.println("substring(2,9): " + s5 + "-");
		System.out.println("replace: " + s6 + "-");
		System.out.println("Index of: " + i);
		System.out.println("Last index of: " + j);
		
		/*OPERA��O SPLIT*/
		
		String s = "orange apple lemon";
		
		String[] vect = s.split(" ");
		
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
	}

}
