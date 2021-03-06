
public class Paciente {
	
	double imc;
	
	public Paciente(double peso, double altura, String nome) {
		double resultado = calcularIMC(peso, altura);
		String diagnosticoFinal = diagnostico(resultado); 
		System.out.println("O resultado do IMC do "+ nome +" � : " + diagnosticoFinal);
	}
	
	public double calcularIMC(double peso, double altura){
		imc = (peso) / (altura * altura);
		return imc;
	}

	
	public String diagnostico(double imc){
		if(imc < 16){
			return "baixo peso muito grave";
		}else if (imc >= 16 && imc < 17) {
			return "baixo peso grave";
		}else if (imc >= 17 && imc < 18.5){
			return "baixo peso";
		}else if (imc >= 18.5 && imc < 25){
			return "peso normal";
		}else if (imc >= 25 && imc < 30){
			return "sobrepeso";
		}else if (imc >= 30 && imc < 35){
			return "obesidade grau I";
		}else if (imc >= 35 && imc < 40){
			return "obesidade grau II";
		}else if (imc >= 40){
			return "obsesidade grau III (obsesidade m�rbida";
		}
		return "N�o foi poss�vel calcular";
		}
	}
	
	
