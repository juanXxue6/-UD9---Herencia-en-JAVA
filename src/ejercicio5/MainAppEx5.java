package ejercicio5;

import java.util.ArrayList;

public class MainAppEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Profesor profesorAula1 = new Profesor("Jose", 35, 'H', Materias.fisica.toString().toLowerCase());
		
		ArrayList<Alumno> alumnosAula1 = new ArrayList<Alumno>();
		
			alumnosAula1.add(new Alumno("Jaime", 12, 'H', 9));
			alumnosAula1.add(new Alumno("Carla", 13, 'M', 5));
			alumnosAula1.add(new Alumno("Alex", 12, 'H', 2));
			alumnosAula1.add(new Alumno("Marcos", 11, 'H', 6));
			alumnosAula1.add(new Alumno("Laura", 13, 'm', 1));
				
		Aula aula1 = new Aula(1, alumnosAula1, profesorAula1, Materias.fisica.toString().toLowerCase());
		
		aula1.ToString();
		
		System.out.println("----------------------------------------");
		
		Profesor profesorAula2 = new Profesor("Teresa", 55, 'M', Materias.filosofia.toString().toLowerCase());
		
		ArrayList<Alumno> alumnosAula2 = new ArrayList<Alumno>();
		
			alumnosAula2.add(new Alumno("Jaime", 12, 'H', 9));
			alumnosAula2.add(new Alumno("Laurato", 16, 'M', 0));
			alumnosAula2.add(new Alumno("Noelia", 12, 'M', 8));
			alumnosAula2.add(new Alumno("isabel", 11, 'M', 5));
			alumnosAula2.add(new Alumno("Laura", 13, 'M', 1));
			alumnosAula2.add(new Alumno("Jose", 15, 'H', 3));
			alumnosAula2.add(new Alumno("Laurato", 16, 'M', 0));
			alumnosAula2.add(new Alumno("Carlos", 12, 'H', 10));
			alumnosAula2.add(new Alumno("Rebeca", 16, 'M', 9));
			alumnosAula2.add(new Alumno("Maria", 13, 'M', 10));
				
		Aula aula2 = new Aula(2, alumnosAula2, profesorAula2, Materias.matematicas.toString().toLowerCase());
		
		Aula aula3 = new Aula(3, alumnosAula2, profesorAula2, Materias.filosofia.toString().toLowerCase());
		
		aula2.ToString();
		
		System.out.println("----------------------------------------");
		
		aula3.ToString();
		
	}

}
