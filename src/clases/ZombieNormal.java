package clases;

public class ZombieNormal {
	// Atributos de la Clase
		int vida = 10;
		int ataque = 10;
		int defensa = 3;
		int[] ubicacion;
		String simbolo = "ZN";
		
		// Metodos de la Clase
		public void desplegarInformacion() {
			System.out.println("Vida: " + vida);
			System.out.println("Ataque: " + ataque);
			System.out.println("Defensa: " + defensa);
			System.out.println("Simbolo: " + simbolo);
			System.out.println("/////////////////////////");
		}
	}
