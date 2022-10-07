package Ejercicio_2;

public class Videojuego implements Entregable {
	
	private final static int HORAS_ESTIMADAS=10; 
	
	private String titulo;
	private int horas_estimadas;
	private boolean entregado;
	private String genero;
	private String companyia;
	
	public Videojuego() {
		this.horas_estimadas=HORAS_ESTIMADAS;
		this.entregado=false;
		this.titulo="";
		this.companyia="";
		this.genero="";
	}
	
	public Videojuego(String titulo, int horas_est) {
		this.titulo=titulo;
		this.horas_estimadas=horas_est;
		this.companyia="";
		this.entregado=false;
		this.genero="";
	}
	
	public Videojuego(String titulo, int horas_est, String genero, String companyia) {
		this.titulo=titulo;
		this.horas_estimadas=horas_est;
		this.genero=genero;
		this.companyia=companyia;
		this.entregado=false;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getHoras_estimadas() {
		return horas_estimadas;
	}

	public void setHoras_estimadas(int horas_estimadas) {
		this.horas_estimadas = horas_estimadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCompanyia() {
		return companyia;
	}

	public void setCompanyia(String companyia) {
		this.companyia = companyia;
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
		Videojuego aux1 = (Videojuego)a;
		
		if(this.horas_estimadas>aux1.horas_estimadas) {
			System.out.println("Tiene mayor numero de horas estimadas el videojuego "+this.horas_estimadas);
		}else {
			System.out.println("Tiene mayor numero de horas estimadas el videojuego "+aux1.horas_estimadas);
		}
	}

	@Override
	public String toString() {
		return "Videojuego [titulo=" + titulo + ", horas_estimadas=" + horas_estimadas + ", entregado=" + entregado
				+ ", genero=" + genero + ", companyia=" + companyia + "]";
	}
	
	


	
	
}
