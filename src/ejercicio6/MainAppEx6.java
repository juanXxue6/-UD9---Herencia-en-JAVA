package ejercicio6;

import java.util.ArrayList;

public class MainAppEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pelicula pelicula = new Pelicula("Django", 160,16,"Tarantino");
		
		ArrayList<Espectador> espectadores = new ArrayList<Espectador>();
				espectadores.add(new Espectador("Carol", 20, 40));
				espectadores.add(new Espectador("Carmen", 12, 67));
				espectadores.add(new Espectador("Donnie", 56, 5));
		
		
		Cine cine = new Cine(pelicula,20,espectadores);
		
		
		cine.LlenarCine();
		cine.EnseñarCine();
		
		
		
		
		
		
		
	}

}
