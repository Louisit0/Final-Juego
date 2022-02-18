package clases;

public class PlantaNormal {
	// Atributos de la Clase
	int costeTrebol = 3;
	int vida = 30;
	int ataque = 10;
	int defensa = 5;
	String simbolo = "PN";
	
	// Metodos de la Clase
	public void desplegarInformacion() {
		System.out.println("CosteTrebol: " + costeTrebol);
		System.out.println("Vida: " + vida);
		System.out.println("Ataque: " + ataque);
		System.out.println("Defensa: " + defensa);
		System.out.println("Simbolo: " + simbolo);
		System.out.println("/////////////////////////");
	}
}
