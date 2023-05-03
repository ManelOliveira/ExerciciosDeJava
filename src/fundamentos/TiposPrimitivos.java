package fundamentos;

public class TiposPrimitivos 
{
	public static void main(String[] args) 
	{
		//informações do funcionario
		
		//tipos numéricos inteiros, a diferença desses tipos é a capacidade de armazenamento
		
		byte AnosDeEmpresa = 23;
		short NumeroDeVoos = 542;
		int Id = 56789;
		long PontosAcumulados = 3_234_845_223L;
		
		//tipos numéricos reais
		
		float salario = 11_445.44f; //o "F" serve para demonstrar que esse literal representa um float
		double VendasAcumuladas = 2_991_797_103.01;
		
		//tipo booleano
		boolean EstaDeFerias = false; //true
		
		//tipo caractere
		char status = 'A'; //só aceita uma letra
		
		//Dias de empresa
		System.out.println(AnosDeEmpresa * 365);
		
		//Numero de voos
		System.out.println(NumeroDeVoos / 2);
		
		//Pontos por real
		System.out.println(PontosAcumulados / VendasAcumuladas);
		
		System.out.println(Id + ": ganha-> " + salario);
		System.out.println("Férias? " + EstaDeFerias);
		System.out.println("Status: " + status);
	}
}
