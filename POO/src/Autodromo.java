

public class Autodromo {
	public static void main(String[] args) {
		Carro jeep = new Carro();
		jeep.setChassi("425646456765");
		//jeep.ligar();
		
		Moto z400 = new Moto();
		z400.setChassi("9890090897");
		//z400.ligar();
		
		Veiculo coringa = z400;
		coringa.ligar();
	}
	 
}
