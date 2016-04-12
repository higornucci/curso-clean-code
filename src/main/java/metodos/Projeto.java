package metodos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Projeto {

	private Date prazoFinal;
	private List<ItemDeBacklog> itensDeBacklog = new ArrayList<>();
	private boolean emAndamento;
	
	public int calcularNumeroDeDiasParaAcabar() {
		return 0;
	}
	
	public void adicionar(ItemDeBacklog itemDeBacklog) {
		itensDeBacklog.add(itemDeBacklog);
	}
	
	public void adicionar(ItemDeBacklog itemDeBacklog, Funcionario funcionario) {
	}
	
	public void adicionar(ItemDeBacklog itemDeBacklog, Funcionario funcionario, Setor setor) {
	}
	
	public void setIniciado(boolean iniciado) {
		this.emAndamento = iniciado;
	}
}
