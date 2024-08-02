package principal;
 
import java.util.Scanner; // Objeto java padrão para receber dados atraves do console.

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner entradaDeDados = new Scanner (System.in); // Objeto java padrão para receber dados atraves do console.
		 
		 atleta atleta = new atleta();	
		 
		 
		 System.out.println("Digite o nome do atleta:"); // Trecho de codigo usado para apresentar a mensagem para o usario.
		 atleta.setNome(entradaDeDados.next()); // Estou armazenando o valor digitado pelo usuario na variavel nome.
		 
		 
		System.out.println("digite a idade do atleta:");
		atleta.setIdade(entradaDeDados.nextInt()); 
		
		System.out.println("qual sua posicao no futebol:");
		atleta.setPosicao(entradaDeDados.next());
		
		System.out.println("qual numero de camisa voce usa");
		atleta.setCamisa(entradaDeDados.nextInt()); 
		
		System.out.println("qual sua perna dominante");
		atleta.setPernadom(entradaDeDados.next());
		
		
		
		
		
		System.out.println("meu nome é:" + atleta.getNome());
		System.out.println("minha idade e:" + atleta.getIdade());
		 System.out.println("minha Posicao e:" + atleta.getPosicao());
		System.out.println("meu numero e:" + atleta.getCamisa());
		System.out.println("minha perna dominante e a:" + atleta.getPernadom());
		
	}

}
