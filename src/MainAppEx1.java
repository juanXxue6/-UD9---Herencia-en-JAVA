import java.util.ArrayList;

public class MainAppEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double sumaLavadoras = 0;
		double sumaTelevision = 0;
		double sumaTotal = 0;
		 
		
		ArrayList<Electrodomesticos> listaElectrodomesticos = new ArrayList<>();
		
			listaElectrodomesticos.add(new Television(900,122));
			listaElectrodomesticos.add(new Electrodomesticos(250,"negro", "A",33));
			listaElectrodomesticos.add(new Lavadora(250,"gris", "C",33,33));
			listaElectrodomesticos.add(new Electrodomesticos(789,"Rosa", "D",66));
			listaElectrodomesticos.add(new Television(500,53));
			listaElectrodomesticos.add(new Lavadora());
			listaElectrodomesticos.add(new Lavadora(250,"negro", "S",33,33));
			listaElectrodomesticos.add(new Electrodomesticos(100,33));
			listaElectrodomesticos.add(new Television());
			listaElectrodomesticos.add(new Television(544,"Blanco", "C",65,45,true));
		
			
			// recorremos la array list para sumar los valores de los objetos
			for (Electrodomesticos e : listaElectrodomesticos) {
				
				if (e instanceof Television) {
					sumaTelevision += e.PrecioFinal();
				}
				
				else if (e instanceof Lavadora) {
					sumaLavadoras += e.PrecioFinal();
				}else {
					sumaTotal += e.PrecioFinal();
				}

				
			}
		
			sumaTotal += sumaTelevision  + sumaLavadoras;

			System.out.println("Suma total de las lavadoras: " + sumaLavadoras + "€");
			System.out.println("Suma total de las televisiones: " + sumaTelevision + "€");
			System.out.println("Suma total de los electrodomesticos: " + sumaTotal + "€");
		
		
	}

}
