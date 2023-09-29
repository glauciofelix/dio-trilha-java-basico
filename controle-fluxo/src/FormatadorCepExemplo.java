
public class FormatadorCepExemplo {
	public static void main(String[] args) {
		try {
			String cepFormatado = formartarCep("237654");
			System.out.println(cepFormatado);
		} catch (CepInvalidoException e) {
			// TODO Auto-generated catch block
			System.err.println("O cep não corresponde com as regras de negocios");
		}
	}
	static String formartarCep(String cep) throws CepInvalidoException {
		if (cep.length() != 8) {
			throw new CepInvalidoException();
		}
			//simular um cep formatado
			return "23.765-064";
	}
}
