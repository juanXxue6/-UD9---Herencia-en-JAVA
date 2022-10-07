package ejercicio4;

import java.util.ArrayList;

public class MainAppEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Raices> operaciones = new ArrayList<>();
		
		operaciones.add(new Raices(1, -5, 6));
		operaciones.add(new Raices(1, -2, 1));
		operaciones.add(new Raices(1, 1, 1));
		operaciones.add(new Raices(7, 21, -28));
		
		for (Raices e : operaciones) {
			System.out.println("*-----------------------*");
			e.Calcular();

		}
		
		

	}

}
