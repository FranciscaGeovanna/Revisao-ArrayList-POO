import java.util.ArrayList;

public class GerenciadorLivro {
private ArrayList<Livro> acervo = new ArrayList<Livro>();
	
	public ArrayList<Livro> getAcervo(){
		return acervo;
	}
	
	public void addLivro(String titulo, int ano, String autor) {
		Livro l = new Livro(titulo, ano, autor);
		this.acervo.add(l);
		System.out.println("\nLivro adicionado!");
	}
	
	public void addLivroArray(Livro livro) {
		acervo.add(livro);
		System.out.println("\nLivro adicionado!");
	}
	
	public int removerLivro(String titulo) {
		for(Livro livro: acervo) {
			if(livro.getTitulo().equals(titulo)) {
				acervo.remove(livro);
				return 1;
			}
		}
		return 0;
	}
	
	public int exibirLivro(String titulo) {
		for(Livro livro: acervo) {
			if(livro.getTitulo().equals(titulo)) {
				System.out.println("\n===== INFORMAÇÕES DO LIVRO SOLICITADO =====");
				System.out.println("Livro: " + livro.getTitulo() + "\nAutor(a): " + livro.getAutor() + "\nAno: " + livro.getAnoPublicacao());
				return 1;
			}
		}
		return 0;
	}
	
	public void exibirListaLivros(){
		for (Livro livro : acervo) {
			System.out.println("\n==== TODOS OS LIVROS ====");
			System.out.println("Livro: " + livro.getTitulo() + "\nAutor(a): " + livro.getAutor() + "\nAno: " + livro.getAnoPublicacao());
		}
	}
}
