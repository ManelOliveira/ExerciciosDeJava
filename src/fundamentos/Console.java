package fundamentos;

import java.util.Scanner;

public class Console 
{
	public static void main(String[] args) 
	{
		System.out.print("Bom\n");
		System.out.print("dia\n");
		
		System.out.printf("Nome: %s\n", "EMANUEL");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite o sobrenome: ");
		String sobrenome = entrada.nextLine();//nextLine apenas quando é string
		
		System.out.print("Digite a sua idade: ");
		int idade = entrada.nextInt();//quando for inteiro usar nextInt 
		
		//System.out.println("\n\nOlá " + nome + " " + sobrenome);
		System.out.printf("%S %S tem %d anos.%n", nome, sobrenome, idade);
		
		entrada.close();//sempre fechar a entrada para economizar memória 
	}
}
