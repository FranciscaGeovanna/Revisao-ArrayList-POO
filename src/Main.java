import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean comecar = true;
		GerenciadorLivro g1 = new GerenciadorLivro();
		
		while(comecar == true) {
			System.out.println("\nEscolha uma das opções abaixo...");
			System.out.println("1 - Adicionar livro");
			System.out.println("2 - Remover livro");
			System.out.println("3 - Exibir detalhes de um livro");
			System.out.println("4 - Listar todos os livros");
			System.out.println("5 - Sair do programa");
			int op = scanner.nextInt();
			
			if(op == 1) {
				System.out.println("Informe o título do livro que quer adcionar: ");
				scanner.nextLine();
				String titulo = scanner.nextLine();
				
				System.out.println("Informe o autor do livro que quer adcionar: ");
				String autor = scanner.nextLine();
				
				System.out.println("Informe o ano do livro que quer adcionar: ");
				int ano = scanner.nextInt();
				scanner.nextLine();
						
				g1.addLivro(titulo, ano, autor);
			}
			else if(op == 2) {
				System.out.println("Informe o título do livro: ");
				String t = scanner.next();
				scanner.nextLine();
				int retorno = g1.removerLivro(t);
				if(retorno == 1) {
					System.out.println("Livro removido!");
				} else {
					System.out.println("Não foi possível remover o livro!");
				}
			}
			else if(op == 3) {
				System.out.println("Informe o título do livro: ");
				String t = scanner.next();
				scanner.nextLine();
				int retorno = g1.exibirLivro(t);
				if(retorno != 1) {
					System.out.println("\nLivro não encontrado!");
				} else {
					System.out.println("\nLivro removido!");
				}
			}
			else if(op == 4) {
				g1.exibirListaLivros();
			} else {
				System.out.println("\nEncerrando programa...");
				break;
			}
		}
		scanner.close();
	}

}