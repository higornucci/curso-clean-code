package metodos;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmailTeste {

	@Test
	public void deve_validar_um_email() {
		String email = "higornucci@gmail.com";
		
		assertTrue(ValidaEmail.validar(email));
	}
	
	@Test
	public void deve_invalidar_um_email() {
		String email = "higornuccigmail.com";
		
		assertTrue(!ValidaEmail.validar(email));
	}
}
