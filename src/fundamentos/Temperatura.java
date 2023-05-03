package fundamentos;

public class Temperatura 
{
	public static void main(String[] args) 
	{
		// Exercício > (°F - 32) x 5/9 = °C
		
		final double Ajuste = 32;
		final double Fator = 5/9.0;
		
		double F = 86;	
		double Celsius = (F-Ajuste) * Fator;
		
		System.out.println("O resultado é: " + Celsius + "°C.");
		
		F = 150;	
		Celsius = (F-Ajuste) * Fator;
		
		System.out.println("O resultado é: " + Celsius + "°C.");
		
	}
}
