package fundamentos;

public class Wrappers {

	public static void main(String[] args) {
		//wrappers = versão orientada a objeto dos tipos primitivos

		// Scanner entrada = new Scanner(System.in);

		// byte
		Byte b = 100;
		Short s = 1000;
		// Integer i = Integer.parseInt(entrada.next()); //int
		Integer i = 10000; // int
		Long l = 100000L;

		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		Float f =123.10F;
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true"); //convertendo uma string para um valor booleano
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase()); //aqui convertemos para string e colocamos tudo em letra maiúscula

		Character c = '#'; //char
		System.out.println(c.toString());
		
		// entrada.close();
	}

}
