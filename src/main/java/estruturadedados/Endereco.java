package estruturadedados;

public class Endereco {
	private String enderecoCompleto;

	private Municipio municipio;

	private String cep;

	private Integer caixaPostal;
	
	private Estado estado;

	private Endereco(String enderecoCompleto, Municipio municipioEsperado, String cep, Integer caixaPostal, Estado estado) {
		this.enderecoCompleto = enderecoCompleto;
		this.municipio = municipioEsperado;
		this.cep = cep;
		this.caixaPostal = caixaPostal;
		this.estado = estado;
	}

	public Municipio getMunicipio() {
		return municipio;
	}

	public String getEnderecoCompleto() {
		return enderecoCompleto;
	}

	public String getCep() {
		return cep;
	}

	public String getUF() {
		return estado.getUf();
	}
	
	public Estado getEstado() {
		return estado;
	}

	public Integer getCaixaPostal() {
		return caixaPostal;
	}
}
