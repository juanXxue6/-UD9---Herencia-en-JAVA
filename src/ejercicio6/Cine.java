package ejercicio6;

import java.util.ArrayList;
import java.util.Iterator;

public class Cine {
	
	public static final char[] CHARS = {'A','B','C','D','E','F'}; 
	

	private int filas = 9;
	private int columnas = 12;
	public char[][] tamañoCine = new char[filas][columnas];
	private Pelicula pelicula;
	private double precio;
	private ArrayList<Espectador> espectadores;
	
	
	public Cine() {
		
	}
	
	
	public Cine(Pelicula pelcula, double precio, ArrayList<Espectador> espectadores) {
		this.pelicula = pelcula;
		this.precio = precio;
		this.espectadores = espectadores;
		
		LlenarCine();
	}
	
		
	public void LlenarCine() {
		int decreciente = 0;
		int indexChars = 0;
		
		//filas
		for (int i = 0; i < tamañoCine.length; i++) {
			//columnas
			for (int j = 0; j < tamañoCine[i].length; j++) {
				int aux = tamañoCine.length - decreciente;
				
				if(j%2 == 0) {
					tamañoCine[i][j] = (char) (aux+'0');
				}else {
					tamañoCine[i][j] = CHARS[indexChars];
					indexChars++;
				}
								
			}
			decreciente++;
			indexChars = 0;
		}
		
			
	}
	
	
	public void EnseñarCine() {
		
		for (int i = 0; i < tamañoCine.length; i++) {
			for (int j = 0; j < tamañoCine[i].length; j++) {
				System.out.print(tamañoCine[i][j] + " ");
			}
		System.out.println();
		}
	}
	
	
	public void AsignarAsiento() {
		int fila = 0;
		char columna = ' ';
		
		for (Espectador a : espectadores) {
			
			fila = (int) ((Math.random() * (filas - 1)) + 1);
			
		}
		
	}
	
	
}
