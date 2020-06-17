import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteCalculoIMC {
	@Test
	void calculaIMC() {
		Paciente p = new Paciente(85, 1.90);		
		assertEquals(23.545706371191137, p.calcularIMC());
	}
	
	@Test
	void diagnostico() {
		Paciente p = new Paciente(58, 1.67);		
		assertEquals("Peso normal = IMC entre 18,50 e 24,99 kg/m²", p.diagnostico());
	}
}
