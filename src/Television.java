
public class Television extends Electrodomesticos {
	private static final int RESOLUCION = 20;
	
	private int resolucion;
	private boolean sintonizador;

	
	public Television() {
		super();
		this.resolucion = RESOLUCION;
		this.sintonizador=false;
	}


	public Television(int precio, int peso) {
		super(precio, peso);
		this.resolucion = RESOLUCION;
		this.sintonizador=false;
	}
	
	
	public Television(int precio, String color,String consumoEnergetico, int peso, int resolucion, boolean sintonizador) {
		super(precio,color,consumoEnergetico, peso);
		this.resolucion = resolucion;
		this.sintonizador=sintonizador;
	}

	public int getResolucion() {
		return resolucion;
	}


	public void setResolucion(int resolucion) {
		this.resolucion = resolucion;
	}


	public boolean isSintonizador() {
		return sintonizador;
	}


	public void setSintonizador(boolean sintonizador) {
		this.sintonizador = sintonizador;
	}


	@Override
	public double PrecioFinal() {
		double aux = super.PrecioFinal();
		
		if(resolucion > 40) {
			aux = aux+(aux*0.3);
		}
		
		if(sintonizador) {
			aux += 50;
		}
		return aux;
	}
	

}

