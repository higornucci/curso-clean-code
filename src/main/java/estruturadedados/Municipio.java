package estruturadedados;

public class Municipio {
	private static final String UF = "MS";

	private String nome;

	public Municipio(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public String getUf() {
		return UF;
	}
}
