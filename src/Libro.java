
public class Libro {

	private String isbn;
	private String titulo;
	private String autor;
	private int numeroPaginas;

	
	public Libro(String isbn, String titulo, String autor, int numeroPaginas) {
		
		//ComprobarISBN(numeroPaginas);
		
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.numeroPaginas = numeroPaginas;
	}

	public String GetIsbn() {
		return isbn;
	}
	
	public void SetIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	
	public String GetTitulo() {
		return titulo;
	}
	
	
	public void SetTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	
	public String GetAutor() {
		return autor;
	}
	
	
	public void SetAutor(String autor) {
		this.autor = autor;
	}
	
	
	public int GetNumeroPaginas() {
		return numeroPaginas;
	}
	
	
	public void SetNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
	
	public void ToString() {
		
		System.out.println("El " + titulo + " con " + isbn +
				" creado por el " + autor + " tiene " + numeroPaginas);
	}
	
	
	/*private void ComprobarISBN(long isbn) {
		
		if(String.valueOf(isbn).length() != 10 && String.valueOf(isbn).length() != 13) {
			
			System.out.println("Longitud del ISBN no valido, introduzca uno valido");
		}
		
		
	}*/
	
	
	

}
