package fundamentos;

public class NotacaoPonto 
{
	public static void main(String[] args) 
	{
		String s = "Bom dia Moça";
		//A ordem dos passos influencia no resultado
		s = s.replace("Moça", "Senhora"); // esse método substitui uma palavra por outra
		s = s.toUpperCase(); //esse método deixa todas as letras armazenadas na string maiusculas
		s = s.concat("!!!"); // esse método funciona para concatenar uma string em outra...
		int Tamanho = s.length(); // esse método mostra quantos caracteres possuí na frase, contando com os espaços
		
		System.out.println(s);
		
		System.out.println(Tamanho);
		
		System.out.println("Leo".toUpperCase());//Os métodos também podem ser usados dessa forma
		
		String y = "Bom Dia X".replace("X", "Emanuel").toUpperCase().concat("!!!"); //também podemos utilizar dessa forma
		System.out.println(y);
		
		//Tipos primitivos não tem o operador "."
		int a = 3;
		System.out.println(a);
	}
}
