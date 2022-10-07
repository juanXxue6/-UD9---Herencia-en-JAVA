package Ejercicio_2;

public class Serie implements Entregable {
	private String titulo;
	private int num_temp;
	private boolean entregado;
	private String genero;
	private String creador;
	
	public Serie() {
		this.num_temp=3;
		this.entregado=false;
		this.titulo="";
		this.creador="";
		this.genero="";
	}
	
	public Serie(String titulo, String creador) {
		this.titulo=titulo;
		this.creador=creador;
		this.num_temp=3;
		this.entregado=false;
		this.genero="";
	}
	
	public Serie(String titulo, int num_temp, String genero, String creador) {
		this.titulo=titulo;
		this.num_temp=num_temp;
		this.genero=genero;
		this.creador=creador;
		this.entregado=false;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNum_temp() {
		return num_temp;
	}

	public void setNum_temp(int num_temp) {
		this.num_temp = num_temp;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	@Override
	public void entregar() {
		// TODO Auto-generated method stub
		this.entregado=true;
	}

	@Override
	public void devolver() {
		// TODO Auto-generated method stub
		this.entregado=false;
	}

	@Override
	public boolean isEntregado() {
		// TODO Auto-generated method stub
		return entregado;
	}

	@Override
	public void compareTo(Object a) {
		// TODO Auto-generated method stub
		Serie aux1 = (Serie)a;
		
		if(this.num_temp>aux1.num_temp) {
			System.out.println("Tiene mayor numero de temporadas la serie "+this.titulo);
		}else {
			System.out.println("Tiene mayor numero de temporadas la serie "+aux1.titulo);
		}
	}

	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", num_temp=" + num_temp + ", entregado=" + entregado + ", genero=" + genero
				+ ", creador=" + creador + "]";
	}
	
	
	
	
}