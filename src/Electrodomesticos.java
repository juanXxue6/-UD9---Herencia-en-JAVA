import java.util.Hashtable;
import java.util.Scanner;

public class Electrodomesticos {

	static public Scanner sc = new Scanner(System.in);

	private static final String[] CONSUMO_ENERGETICO = { "F", "E", "D", "C", "B", "A" };
	private static final String[] COLORES_DISPONIBLES = { "blanco", "negro", "rojo", "azul", "gris" };
	
	
	private static final Hashtable<String, Integer> RELACION_PRECIO_CONSUMO = new Hashtable<String, Integer>(){{
		put("A", 100);	
		put("B", 80);	
		put("C", 60);	
		put("D", 50);	
		put("E", 30);	
		put("F", 10);	
		
	}};
				
	
	
	private static final int PESO_BASE = 5;
	private static final int PRECIO_BASE = 100;

	private double precioBase;
	private String color;
	private String consumoEnergetico;
	private int peso;
	private double PrecioFinal;

	//primer constructor por defecto
	
	public Electrodomesticos() {

		this.precioBase = PRECIO_BASE;
		this.color = CONSUMO_ENERGETICO[0];
		this.consumoEnergetico = CONSUMO_ENERGETICO[0];
		this.peso = PESO_BASE;
	}

	//constructor con peso y precio
	
	public Electrodomesticos(int precioBase, int peso) {

		this.precioBase = ValidarNumero(precioBase);
		this.color = COLORES_DISPONIBLES[0];
		this.consumoEnergetico = CONSUMO_ENERGETICO[0];
		this.peso = ValidarNumero(peso);
	}

	//constructor con todos los valores
	
	public Electrodomesticos(int precioBase, String color, String consumoEnergetico, int peso) {
		
		this.precioBase = ValidarNumero(precioBase);
		this.color = ValidarValores(color, "colores");
		this.consumoEnergetico = ValidarValores(consumoEnergetico, "energia");
		this.peso = ValidarNumero(peso);
	}

	private int ValidarNumero(int numero) {
		int numeroNuevo = numero;

		do {
			try {

				if (numeroNuevo < 0) {
					System.err.println("valor invalido, introduzca uno valido");
					numeroNuevo = Integer.parseInt(sc.nextLine());
				}

			} catch (Exception e) {
				System.err.println("Introduce un dato valido");
			}

		} while (numeroNuevo < 0);

		return numeroNuevo;
	}

	
	private String ValidarValores(String valorEnviado, String tipo) {
		
		switch (tipo.toLowerCase()) {
		
		case "energia":
						
			for (int i = 0; i < CONSUMO_ENERGETICO.length; i++) {
								
					if (valorEnviado.toLowerCase().trim().equals(CONSUMO_ENERGETICO[i].toLowerCase().trim())) {
						return valorEnviado;
					}else {
						return CONSUMO_ENERGETICO[0];
					}					
			}
									
		case "colores":
			
			for (int i = 0; i < COLORES_DISPONIBLES.length; i++) {
				
				if (valorEnviado.toLowerCase().trim().equals(COLORES_DISPONIBLES[i].toLowerCase().trim())) {
					return valorEnviado;
				}else {
					return COLORES_DISPONIBLES[0];
				}				
		}
					
		default:
			return valorEnviado;
			
		}		

	}
	
	
	public double PrecioFinal() {
		double aux = precioBase;
		
		aux += RELACION_PRECIO_CONSUMO.get(consumoEnergetico);
		
		if(precioBase >= 0 & precioBase <= 19) {
			aux += 10;
		}else if (precioBase >= 20 & precioBase <= 49) {
			aux += 50;
		}else if (precioBase >= 50 & precioBase <= 79) {
			aux += 80;
		}else if (precioBase >= 80) {
			aux += 100;
		}
		
		return aux;
	}
	
	
	
	//getters y setters

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(int precioBase) {
		this.precioBase = precioBase;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setConsumoEnergetico(String consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
	

	

}
