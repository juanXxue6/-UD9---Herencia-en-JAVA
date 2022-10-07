
public class Ejercicio3 {

	private String isbn;
	private String titulo;
	private String autor;
	private int numeroPaginas;
	
	
	
	
	
	
	
	public Ejercicio3(String isbn, String titulo, String autor, int numeroPaginas) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.numeroPaginas = numeroPaginas;
	}

	public String getIsbn() {
		return isbn;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	
	public String getTitulo() {
		return titulo;
	}
	
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	
	public String getAutor() {
		return autor;
	}
	
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	
	public int getNumeroPaginas() {
		return numeroPaginas;
	}
	
	
	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
	
	public void ToString() {
		
		System.out.println("El " + titulo + " con " + isbn +
				" creado por el " + autor + " tiene " + numeroPaginas);
	}
	
	
	
	
	

}
