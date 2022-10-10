package ejercicio5;

import java.util.ArrayList;

public class Aula {

	private static final String[] MOTIVOS_NO_CLASE = {"No se encuentra disponible el profesor",
			"el profesor se encuentra en el aula equivocada", "No se cumple el minimo de alumnos", "Otros"};
	
	//valores del constructor
	private int id;
	private int maxAlumnos;
	private String materia;
	private Profesor profesor;
	private ArrayList<Alumno> alumnosAula;
	
	//valores internos
	private String motivoNoClase;
	private boolean aulaDisponible;
	
	
	
	public Aula(int id, ArrayList<Alumno> alumnosAula, Profesor profesor, String materia) {
		this.id = id;
		this.alumnosAula = alumnosAula;
		this.maxAlumnos = alumnosAula.size();
		
		this.materia = materia;
		this.profesor = profesor;
		
		//verificamos que el aula este disponible para su clase
		this.aulaDisponible = PuedeClase();
	}
	
	
	
	public boolean PuedeClase() {
		
		//si la capacidad delk aula es impar, para redondear a la alza
		int minimoAlumnos = (int) Math.round(maxAlumnos/2);
		int alumnosPresentes = 0;
				
			
				if(!profesor.isPresente()) {
					if((profesor.getMaterias().equals(materia))) {
						
							for (Alumno alumno : alumnosAula) {	
								
								//si es true el alumno falta
								//System.out.println(alumno.ausencia());
								
								if(!alumno.isPresente()) {
									
									alumnosPresentes++;
								}	
							}
							//compobamos si hay un minimo de alumnos para dar clase
							if(minimoAlumnos <= alumnosPresentes) {
								return true;
							}else {
								motivoNoClase = MOTIVOS_NO_CLASE[2];
								return false;
							}
						
					}else {
						motivoNoClase = MOTIVOS_NO_CLASE[1];
						return false;
					}
					
				}else {
					motivoNoClase = MOTIVOS_NO_CLASE[0];
					return false;
				}
							
				
	}
	
	
	public void ToString() {
		
		if(aulaDisponible) {
		System.out.println("El aula con el identificador " + id + "  puede dar clase");
		
			EnseñarNotas();
		}
		else {
			System.out.println("El aula con el identificador " + id + " no puede dar clase por el siguiente motivo: "
					+ motivoNoClase);
		}
	}
	
	private void EnseñarNotas() {
		int alumnasAprobadas = 0;
		int alumnosAprobados = 0;
		
		
		for (Alumno a : alumnosAula) {
			if((Character.toUpperCase(a.sexo) == 'M') && a.getCalificacionActual() >= 5 ) {
				alumnasAprobadas++;
			}else if((Character.toUpperCase(a.sexo) == 'H') && a.getCalificacionActual() >= 5) {
				alumnosAprobados++;
				
			}
		}
		
		System.out.println("La cantidad de alumnas aprobadas son: " + alumnasAprobadas);
		System.out.println("La cantidad de alumnos aprobadas son: " + alumnosAprobados);
	}

}
