public class Usuario {
	public static void main(String[] args) {
		SmartTV smartTv = new SmartTV();
		
		System.out.println("Volume Atual? " + smartTv.volume);
		
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		smartTv.aumentarVolume();
		
		System.out.println("Canal Atual? " + smartTv.canal);
		smartTv.mudarCanal(13);
		System.out.println("Canal Atual? " + smartTv.canal);
		
		System.out.println("Volume Atual? " + smartTv.volume);
		
		System.out.println("TV Ligada? " + smartTv.ligada);
		
		smartTv.ligar();
		System.out.println("Novo Status -> TV Ligada? " + smartTv.ligada);
		
		smartTv.desligar();
		System.out.println("Novo Status -> TV Ligada? " + smartTv.ligada);
		
		}
	}
