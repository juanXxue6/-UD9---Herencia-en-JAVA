package ejercicio5;

public class Profesor extends Persona  {

	private String materias;
	private boolean presente;

	
	public Profesor(String nombre, int edad, char sexo,String materias) {
		super(nombre,edad,sexo);
		this.materias = materias;
		this.presente = ausencia();
	}


	@Override
	protected boolean ausencia() {
		int random = (int) (Math.random()*10 + 1);
		if(random == 2) {
			return true;
		}else {
			return false;
		}
	}

	public String getMaterias() {
		return materias;
	}


	public boolean isPresente() {
		return presente;
	}




	
	
	
}
