
public class Livro {
	private String titulo;
	private int anoPublicacao;
	private String autor;
	
	public Livro(String titulo, int anoPublicacao, String autor){
		this.titulo = titulo;
		this.anoPublicacao = anoPublicacao;
		this.autor = autor;
	}
	
	public void setTitulo(String titulo){
		this.titulo = titulo;
	}
	public String getTitulo(){
		return titulo;
	}
	
	public void setAnoPublicacao(int ano){
		this.anoPublicacao = ano;
	}
	public int getAnoPublicacao(){
		return anoPublicacao;
	}
	
	public void setAutor(String autor){
		this.autor = autor;
	}
	public String getAutor(){
		return autor;
	}
	
	public void mostrarLivro() {
		System.out.println("Título: " + titulo + "\nAutor: " + autor + "\nAno de publicação: " + anoPublicacao);
	}
}
