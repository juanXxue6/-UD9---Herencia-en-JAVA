package ejercicio5;

public abstract class Persona {

	private static final char HOMBRE = 'H';
	private static final char MUJER = 'M';
	
	
	protected String nombre;
	protected int edad;
	protected char sexo;

	
	
	public Persona(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;

	}

	protected abstract boolean ausencia();
	
	
	
	
}
