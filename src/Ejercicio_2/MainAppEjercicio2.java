package Ejercicio_2;

import java.util.ArrayList;

public class MainAppEjercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Serie> array_series = new ArrayList<Serie>(5);
		ArrayList<Videojuego> array_videojuegos = new ArrayList<Videojuego>(5);
		
		
		array_series.add(new Serie());
		array_series.add(new Serie("HBO","Jose Marin"));
		array_series.add(new Serie("GOT","Arnau"));
		array_series.add(new Serie("Breaking Bad",2,"Ciencia Ficcion","Lucia"));
		array_series.add(new Serie("AQNHQV",6,"Comedia","Juan"));
		
		array_videojuegos.add(new Videojuego());
		array_videojuegos.add(new Videojuego("CSGO",100));
		array_videojuegos.add(new Videojuego("lol",200));
		array_videojuegos.add(new Videojuego("Fallout",400,"Ciencia Ficcion","Bethesda"));
		array_videojuegos.add(new Videojuego("WOW",120,"Ciencia Ficcion","Blizzard"));
		
		//Entregamos 2 series i 2 videojuegos
		
		array_series.get(0).entregar();
		array_series.get(1).entregar();
		
		array_videojuegos.get(0).entregar();
		array_videojuegos.get(1).entregar();
		array_videojuegos.get(2).entregar();
		
		int aux=0;
		for(Serie e : array_series) {
			if(e.isEntregado()) {
				aux += 1;
			}
		}
		System.out.println("Total de series entregadas "+aux);
		
		
		int aux1=0;
		for(Videojuego e : array_videojuegos) {
			if(e.isEntregado()) {
				aux1 += 1;
			}
		}
		System.out.println("Total de series entregadas "+aux1);
		
		
		
		Serie aux_serie=new Serie();
		for(Serie e : array_series) {
			if(e.getNum_temp() > aux_serie.getNum_temp()) {
				aux_serie = e;
			}
		}
		
		System.out.println(""+aux_serie.toString());
		
		Videojuego aux_videojuego=new Videojuego();
		for(Videojuego e : array_videojuegos) {
			if(e.getHoras_estimadas() > aux_videojuego.getHoras_estimadas()) {
				aux_videojuego = e;
			}
		}
		System.out.println(""+aux_videojuego.toString());
	}
}
