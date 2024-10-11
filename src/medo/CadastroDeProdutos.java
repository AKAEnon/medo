package medo;

import java.util.Scanner;


import java.util.ArrayList;
import java.util.List;

public class CadastroDeProdutos {
	public static Scanner scan = new Scanner(System.in);
	public static List<Produto> lista = new ArrayList<Produto>();
	public static void main(String[] args) {
	menu();

	}
	public static void menu() {
		int op = 0;
		while (op!=3) {
			
		System.out.println("Digite o número corresponde a opção que vc quer!");
		System.out.println("1- Cadastrar novo produto");
		System.out.println("2- Exibir produtos");
		System.out.println("3- Sair");
		op = scan.nextInt();
		scan.nextLine();
		if (op==1) {
			
				System.out.println("Insira o nome: ");
			    String nome= scan.nextLine();
				System.out.println("Ïnsira o Preco: ");
				double preco = scan.nextDouble();
				System.out.println("Insira a quantidade: ");
				int quantidade = scan.nextInt();
				Produto novoProduto = new Produto(nome,preco,quantidade);
				lista.add(novoProduto);
                System.out.println("Produto cadastrado com sucesso!");
		}
		else if (op==2) {
			System.out.println("------------------------------------------------------");
			 for (int i = 0; i < lista.size(); i++) {
	            	System.out.println("Produto "+(i+1));
	                System.out.println(lista.get(i));
	                System.out.println("------------------------------------------------------");
		}	
		}
		else if (op != 3) {
            System.out.println("Opção inválida! Tente novamente.");
		}
					
	
  }
		System.out.println("Obrigado por usar nosso sistema!");
 }
}
