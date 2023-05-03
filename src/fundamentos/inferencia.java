package fundamentos;

public class inferencia 
{
	public static void main(String[] args) 
	{
		double a = 4.5;
		System.out.println(a);
		
		//a = "texto"; //desta forma está errado, porque o tipo dá variavel não pode mudar, neste caso tentamos colocar uma string no tipo double.
		
		var b = 1.5;
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		
		c = "Outro texto";
		System.out.println(c);
		
		//c = 4.5; //desta forma está errado.
	}
}
