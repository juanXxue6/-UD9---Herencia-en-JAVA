package ejercicio3;

public class MainAPPEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Libro aux= new Libro("9439443831123","Java Experience","Jose Marin",223);
		Libro aux1= new Libro("943944380341","Java Fullstack","Jose Marin",224);
		
		aux.ToString();
		aux1.ToString();
		if(aux1.GetNumeroPaginas()>aux.GetNumeroPaginas()) {
			System.out.println("El libro "+aux1.GetTitulo()+" tiene mas paginas que el libro "+aux.GetTitulo()+" con un total de "+aux1.GetNumeroPaginas()+" paginas");
		}else if(aux1.GetNumeroPaginas() == aux.GetNumeroPaginas()) {
			System.out.println("El libro "+aux1.GetTitulo()+"  tiene las mimas paginas que el libro "+aux.GetTitulo()+" con un total de "+aux1.GetNumeroPaginas()+" paginas");
		}
		else {
			System.out.println("El libro "+aux.GetTitulo()+"  tiene mas paginas que el libro "+aux1.GetTitulo()+" con un total de "+aux.GetNumeroPaginas()+" paginas");
		}
	}	

}
