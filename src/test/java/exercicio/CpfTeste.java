package exercicio;

import static org.junit.Assert.*;

import org.junit.Test;

public class CpfTeste {

	@Test
	public void deve_validar_um_cpf() {
		String cpf = "35522080892";
		
		assertTrue(CPFValidate.isCPF(cpf));
	}
	
	@Test
	public void deve_invalidar_um_cpf() {
		String cpf = "35522080891";
		
		assertTrue(!CPFValidate.isCPF(cpf));
	}
}
