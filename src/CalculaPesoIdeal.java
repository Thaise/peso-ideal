import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculaPesoIdeal {

	public static void main(String[]args) {	
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite seu sexo(F - feminino / M- masculino): ");
		String sexo = entrada.nextLine();
		
		System.out.print("Digite seu peso: ");
		double peso = entrada.nextDouble();
		
		System.out.print("Digite sua altura: ");
		double altura = entrada.nextDouble();
		
		System.out.println(calculoImc(peso, altura, sexo));	
		
		desejaContinuar();
	}
	
	private static void desejaContinuar() {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Deseja fazer outro cálculo? Se  sim digite Ok, se não digite N.");
		String continuar = entrada.nextLine();
		
		if("Ok".equalsIgnoreCase(continuar)){
			main(null);
		}else if("N".equalsIgnoreCase(continuar)){
			System.out.println("Você escolheu sair.");
		}else{
			System.out.println("Opção inválida! Digite Ok para continuar ou digite N para sair.");
			main(null);
		}
		
	}

	public static String calculoImc(double peso, double altura, String sexo) {
		
		DecimalFormat df = new DecimalFormat("###,##0.00");
		
		double imc = (peso / (altura * altura));
		String formatoDecimal = df.format(imc);
		String finalImc = formatoDecimal.replace(",", ".");
		
		String resultado = "";
		
		if(imc < 19 && "F".equalsIgnoreCase(sexo)){
			resultado = "IMC = "+finalImc+" - Seu IMC indica: Abaixo do Peso.";
		
		}else if(imc < 20 && "M".equalsIgnoreCase(sexo) ){
			resultado = "IMC = "+finalImc+" - Seu IMC indica: Abaixo do Peso.";
		
		}else if(imc >= 19 && imc <= 23.9 && "F".equalsIgnoreCase(sexo)){
			resultado = "IMC = "+finalImc+" - Seu IMC indica: Peso Normal.";
		
		}else if(imc >= 20 && imc <= 24.9 && "M".equalsIgnoreCase(sexo)){
			resultado = "IMC = "+finalImc+" - Seu IMC indica: Peso Normal.";
		
		}else if(imc >= 24.0 && imc <= 28.9 && "F".equalsIgnoreCase(sexo)){
			resultado = "IMC = "+finalImc+" - Seu IMC indica: Obesidade Leve.";
		
		}else if(imc >= 25.0 && imc <= 29.9 && "F".equalsIgnoreCase(sexo)){
			resultado = "IMC = "+finalImc+" - Seu IMC indica: Obesidade Leve.";
		
		}else if(imc >= 29.0 && imc <= 38.9 && "F".equalsIgnoreCase(sexo)){
			resultado = "IMC = "+finalImc+" - Seu IMC indica: Obesidade Moderada.";
		
		}else if(imc >= 30.0 && imc <= 39.9 && "M".equalsIgnoreCase(sexo)){
			resultado = "IMC = "+finalImc+" - Seu IMC indica: Obesidade Moderada.";
		
		}else if(imc >= 39.0 && "F".equalsIgnoreCase(sexo)){
			resultado = "IMC = "+finalImc+" - Seu IMC indica: Obesidade Grave ou Mórbida.";
		
		}else{
			resultado = "IMC = "+finalImc+" - Seu IMC indica: Obesidade Grave ou Mórbida.";
		
		}
		
		return resultado;
	}

}
