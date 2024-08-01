package dadosdeatleta;

import java.util.Scanner; // Objeto java padrão para receber dados atraves do console.

public class principal{

public static void main(String[] args) {
	// TODO Auto-generated method stub

	 Scanner entradaDeDados = new Scanner (System.in); // Objeto java padrão para receber dados atraves do console.
	 
	 String nome;// Variavel que recebe uma cadeia de caracteres.
	 
	 System.out.println("Digite o nome do atleta:"); // Trecho de codigo usado para apresentar a mensagem para o usario.
	 
	 nome= entradaDeDados.next(); // Estou armazenando o valor digitado pelo usuario na variavel nome.
	 
	 System.out.println("meu nome é: " + nome);
	 
	 
}
}
