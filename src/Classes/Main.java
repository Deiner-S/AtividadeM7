/**
 * 
 */
package Classes;

/**
 * @author Deiner.Rodrigues
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Automoveis carro1 = new Automoveis();
		
		carro1.setModelo("Celta");
		carro1.setMarca("Chevrolet");
		carro1.setAno("2012");
		carro1.setPortas(4);
		carro1.setVelocidadeMaxima(157);
		carro1.setConsumo(10);
		carro1.setTanque(54);
		
		
		
		System.out.println("O tempo estimado será de " + carro1.deslocamento(200, 500) + " horas\n");
		System.out.println("O consumo medio da viagem é de: " + carro1.consumoPorKm(700) + " litros");
		
		
	}

}
