package fundamentos;

public class AreaCircunferencia 
{
	public static void main(String[] args) 
	{
		double Raio = 3.4;
		final double Pi = 3.14159;
		
		double Area = Pi * Raio * Raio;
		
		System.out.println("Área = " + Area + " m2.");
		
		Raio = 10;
		Area = Pi * Raio * Raio;
		
		System.out.println("Área = " + Area + " m2.");
		
	}
}
