package clases;

public class Prueba {

	public static void main(String[] args) {
		// Creacion de Objetos desde clase Plantas
		PlantaNormal plantaNormal = new PlantaNormal();
		plantaNormal.desplegarInformacion();
		
		Girasol girasol = new Girasol();
		girasol.desplegarInformacion();
		
		Carnivora carnivora = new Carnivora();
		carnivora.desplegarInformacion();
		
		Guisante guisante = new Guisante();
		guisante.desplegarInformacion();
		
		ZombieNormal zombieNormal = new ZombieNormal();
		zombieNormal.desplegarInformacion();
		
		ZombieArtillero zombieArtillero = new ZombieArtillero();
		zombieArtillero.desplegarInformacion();
		
		ZombieBlindado zombieBlindado = new ZombieBlindado();
		zombieBlindado.desplegarInformacion();
		
		Soleado soleado = new Soleado();
		soleado.desplegarInformacion();
	}

}
