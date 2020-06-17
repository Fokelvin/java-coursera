public class Paciente {
	double peso, altura;

	public Paciente (double pesoAtual, double alturaAtual) {
		peso = pesoAtual;
		altura = alturaAtual;
	}

	public double calcularIMC() {
		return peso / (altura * altura);		
	}
	
	public String diagnostico() {
		double resultadoCalculoIMC = calcularIMC();
		
		String retornoDiagnostico = null;		
		
		if (resultadoCalculoIMC < 16) {
			retornoDiagnostico = "Baixo peso muito grave = IMC abaixo de 16 kg/m²";
			
		} else if (resultadoCalculoIMC >= 16 && resultadoCalculoIMC < 16.99) {
			retornoDiagnostico = "Baixo peso grave = IMC entre 16 e 16,99 kg/m²";
			
		} else if (resultadoCalculoIMC >= 17 && resultadoCalculoIMC < 18.48) {
			retornoDiagnostico = "Baixo peso = IMC entre 17 e 18,49 kg/m²";
		
		} else if (resultadoCalculoIMC >= 18.5 && resultadoCalculoIMC < 24.99) {
			retornoDiagnostico = "Peso normal = IMC entre 18,50 e 24,99 kg/m²";
		
		} else if (resultadoCalculoIMC >= 25 && resultadoCalculoIMC < 29.99) {
			retornoDiagnostico = "Sobrepeso = IMC entre 25 e 29,99 kg/m²";
			
		} else if (resultadoCalculoIMC >= 30 && resultadoCalculoIMC < 34.99) {
			retornoDiagnostico = "Obesidade grau I = IMC entre 30 e 34,99 kg/m²";
		
		} else if (resultadoCalculoIMC >= 35 && resultadoCalculoIMC < 39.99) {
			retornoDiagnostico = "Obesidade grau II = IMC entre 35 e 39,99 kg/m²";
			
		} else if (resultadoCalculoIMC >= 40) {
			retornoDiagnostico = "Obesidade grau III (obesidade mórbida) = IMC igual ou maior que 40 kg/m²";
		}
		
		return retornoDiagnostico;
	}
	
	public void imprimir() {
		System.out.println(
			"-------------------------------------------------------------\n"+
			"O paciente com peso = " + peso + ", altura = " + altura + "\n" +
			"Resultado calculo IMC = " + calcularIMC() + "\n" +
			"Diagnostico: " + diagnostico() + "\n"
		);
	}
}
