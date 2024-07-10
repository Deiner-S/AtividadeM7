

package Classes;

/**
 * @author Deiner.Rodrigues
 * 
 */


public class Automoveis {
	
	private String modelo;
	private String marca;
	private String ano;
	private int portas;
	private int velocidadeMaxima;
	private int consumo;
	
	
	//=====================================
	//	get/set modelo	
	public String getModelo(){
		return modelo;
	}
	
	public void  setModelo(String modelo){
		this.modelo = modelo;
	}	
	
	

	//=====================================
	//	get/set marca	
	public String getMarca(){
		return marca;
	}
	
	public void  setMarca(String marca){
		this.marca = marca;
	}
	
	

	//=====================================
	//	get/set ano	
	public String getAno(){
		return ano;
	}
	
	public void  setAno(String ano){
		this.ano = ano;
	}
	
	

	//=====================================
	//	get/set portas
	public int getPortas(){
		return portas;
	}
	
	public void  setPortas(int portas){
		this.portas = portas;
	}
	
	

	//=====================================
	//	get/set Potencia
	public int getVelocidadeMaxima(){
		return velocidadeMaxima;
	}
	
	public void  setVelocidadeMaxima(int velocidadeMaxima){
		this.velocidadeMaxima = velocidadeMaxima;
	}
	
	
	//=====================================
		//	get/set Potencia
		public int getConsumo(){
			return consumo;
		}
		
		public void setConsumo(int consumo){
			this.consumo = consumo;
		}
	
	
	
	/**
	 * 
	 */	
	public int deslocamentoPontoAPonto(int velocidade, int distancia) {
		
		if(velocidade > this.velocidadeMaxima){
			
			velocidade = this.velocidadeMaxima;
			
		}
		
		return distancia / velocidade; 
		
		
	}
	
	

}
