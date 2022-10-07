
public class Lavadora extends Electrodomesticos {

	private static final int CARGA = 5;
	
	private int carga;

	
	public Lavadora() {
		super();
		this.carga = CARGA;
	}


	public Lavadora(int precio, int peso) {
		super(precio, peso);
		this.carga = CARGA;
	}
	
	
	public Lavadora(int precio, String color, String consumoEnergetico, int peso, int carga ) {
		super(precio,color,consumoEnergetico, peso);
		this.carga = carga;
	}


	public int getCarga() {
		return carga;
	}


	@Override
	public int PrecioFinal() {
		int aux = super.PrecioFinal();
		
		if(carga >= 50) {
			aux += 50;
		}
		
		return aux;
	}
	

}
