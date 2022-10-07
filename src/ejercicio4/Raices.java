package ejercicio4;

public class Raices {

	private double a;
	private double b;
	private double c;
	
	
	
	public Raices(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	private double GetDiscriminate() {
		double aux;
		aux = (Math.pow(b, 2) - 4*a*c);	
		return aux;
	}
	
	
	private boolean TieneRaices(double discriminador) {
		
		if(discriminador > 0) 
		return true;
		else 
			return false;
	}
	
	
	private boolean TieneRaiz(double discriminador) {
		
		if(discriminador == 0) 
		return true;
		else 
			return false;
		
	}
	
	private void obtenerRaices(double discriminador) {
		double[] solutions = new double[2];
		
		solutions[0] = (-b+(Math.sqrt(discriminador)))/(2* a);
		solutions[1] = (-b-(Math.sqrt(discriminador)))/(2* a);
		
		System.out.println("Solucion 1: " + solutions[0]);
		System.out.println("Solucion 2: " + solutions[1]);
	}
	
	private void obtenerRaiz() {
		double solution = 0;
		
		solution = (-b)/(2* a);
		
		System.out.println("La solucion es: " + solution);
		
	}
	
	
	public void Calcular() {
		double discriminador;
		
		discriminador = GetDiscriminate();
		
		if(TieneRaices(discriminador)) {
			obtenerRaices(discriminador);
			
		}else if (TieneRaiz(discriminador)) {
			obtenerRaiz();
		}else {
			System.out.println("No tiene solucion");
		}
		
		
	}
	
}
