
public class CalculaPesoIdeal {

	public static String calculoImc(double peso, double altura, String sexo) {
		
		double imc = (Math.round(peso / (altura*altura)));
		
		String resultado = "";
		
		if(imc < 19 && "F".equals(sexo)|| imc < 20 && "M".equals(sexo) ){
			resultado = "IMC = "+imc+" - Seu IMC indica: Abaixo do Peso.";
		
		}else if(imc >= 19 && imc <= 23.9 && "F".equals(sexo)){
			resultado = "IMC = "+imc+" - Seu IMC indica: Peso Normal.";
		
		}else if(imc >= 20 && imc <= 24.9 && "M".equals(sexo)){
			resultado = "IMC = "+imc+" - Seu IMC indica: Peso Normal.";
		
		}else if(imc >= 24.0 && imc <= 28.9 && "F".equals(sexo)){
			resultado = "IMC = "+imc+" - Seu IMC indica: Obesidade Leve.";
		
		}else if(imc >= 25.0 && imc <= 29.9 && "F".equals(sexo)){
			resultado = "IMC = "+imc+" - Seu IMC indica: Obesidade Leve.";
		
		}else if(imc >= 29.0 && imc <= 38.9 && "F".equals(sexo)){
			resultado = "IMC = "+imc+" - Seu IMC indica: Obesidade Moderada.";
		
		}else if(imc >= 30.0 && imc <= 39.9 && "M".equals(sexo)){
			resultado = "IMC = "+imc+" - Seu IMC indica: Obesidade Moderada.";
		
		}else if(imc >= 39.0 && "F".equals(sexo)){
			resultado = "IMC = "+imc+" - Seu IMC indica: Obesidade Grave ou Mórbida.";
		
		}else{
			resultado = "IMC = "+imc+" - Seu IMC indica: Obesidade Grave ou Mórbida.";
		
		}
		
		return resultado;
	}

}
