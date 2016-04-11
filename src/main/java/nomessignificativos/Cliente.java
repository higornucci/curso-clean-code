package nomessignificativos;

import java.util.Date;

public class Cliente {
	private long cod_cli;
	private String pri_nome;
	private String ult_nome;
	private Date data_nasc;
	
	public Cliente(String pri_nome, String ult_nome, Date data_nasc) {
		this.pri_nome = pri_nome;
		this.ult_nome = ult_nome;
		this.data_nasc = data_nasc;
	}
	
	public long getCod_cli() {
		return cod_cli;
	}
	
	public String getPri_nome() {
		return pri_nome;
	}
	
	public String getUlt_nome() {
		return ult_nome;
	}
	
	public Date getData_nasc() {
		return data_nasc;
	}
}
