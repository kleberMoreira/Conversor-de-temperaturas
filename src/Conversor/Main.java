package Conversor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	
	public static void main(String[] args) throws IOException 
	{
	
	int numeroEscolhido;
	double resultado = 0, valorParaConverter;
		
	Conversor meuConversor = new Conversor();
	
	//Preparando o teclado para a leitura
	InputStreamReader leituraEntrada = new InputStreamReader(System.in);
	BufferedReader leitor = new BufferedReader(leituraEntrada);
	
	//Interação com o usuário
	String escolha = "Qual conversão solicitada?\n"
	+ "1 - Celsius para Fahrenheit \n"
	+ "2 - Fahrenheit para Celsius	\n"		
	+ "3 - kelvin para Celsius \n"
	+ "4 - Celsius para kelvin \n"		
	+ "5 - Kelvin para Fahrenheit \n"
	+ "6 - Fahrenheit para kelvin \n";
	
	//Impressão na tela da operação desejada
	System.out.println(escolha);
	
	//Leitura do numero escolhido
	numeroEscolhido = Integer.parseInt(leitor.readLine());
	
	System.out.println("Digite o valor que deseja converter:");
	valorParaConverter = Double.parseDouble(leitor.readLine());
	
	
	switch(numeroEscolhido)
		{
	
	case 1: resultado = meuConversor.celsiusParaFahrenheit(valorParaConverter); break;
	case 2: resultado = meuConversor.fahrenheitParaCelsius(valorParaConverter); break; 
	case 3: resultado = meuConversor.kelvinParaCelsius(valorParaConverter); break;
	case 4: resultado = meuConversor.celsiusParaKelvin(valorParaConverter); break;
	case 5: resultado = meuConversor.kelvinParaFahrenheit(valorParaConverter); break;
	case 6: resultado = meuConversor.fahrenheitParaKelvin(valorParaConverter); break;
	default: System.out.println("Erro!!!. Opção inválida");
		}
	
		System.out.println("O resultado para a conversão solicitada é:" + resultado);
	}	
}			
			
	
	
	
	
