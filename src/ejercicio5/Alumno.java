package ejercicio5;

public class Alumno extends Persona {


	private int calificacionActual;
	private boolean presente;
	
	
	public Alumno(String nombre, int edad, char sexo, int calificacionActual) {
		super(nombre, edad, sexo);
		this.calificacionActual = ValidarCalificacion(calificacionActual);
		this.presente = ausencia();
	}

	
	@Override
	protected boolean ausencia() {
		// TODO Auto-generated method stub
		int random = (int) (Math.random()*10 + 1);
		if(random > 5) {
			return true;
		}else {
			return false;
		}
		
	}
	
	private int ValidarCalificacion(int calificacionActual) {
		int aux = calificacionActual;
		
		if(aux < 0)
			aux = 0;
			else if(aux > 10)
				aux = 5;
		return aux;
	}


	public boolean isPresente() {
		return presente;
	}


	public int getCalificacionActual() {
		return calificacionActual;
	}



	
}
