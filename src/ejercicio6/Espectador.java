package ejercicio6;

public class Espectador {

	private String nombre;
	private int edad;
	private double dinero;
	
	private String asientoAsignado;
	
	public Espectador(String nombre, int edad, double dinero) {
		this.nombre = nombre;
		this.edad = edad;
		this.dinero = dinero;
	}

	public String getAsientoAsignado() {
		return asientoAsignado;
	}

	public void setAsientoAsignado(String asientoAsignado) {
		this.asientoAsignado = asientoAsignado;
	}
	
	
}
