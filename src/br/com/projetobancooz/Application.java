package br.com.projetobancooz;

import java.util.Scanner;

public class Application {
	
	
	public static void main (String []args) {
		
		Scanner sc = new Scanner (System.in);		
		Conta [] contasCliente = new Conta [2];
		
		
		ContaCorrente cc = new ContaCorrente (110,111, " Banco teste 2 ", 20.00, 10.00);
		ContaPoup cp = new ContaPoup (110, 000, " Banco teste CP ", 10.00, 28, 0.05);
		
		
		int opcao = -1;
		int contaEscolhida = -1;
		int contador = 1;
		
		
		// popula o vetor com as contas instanciadas
		
		contasCliente [0] = cc;
		contasCliente [1] = cp;
		
		// mostra as contas do cliente
		for (Conta tipoConta : contasCliente) {
			System.out.println("\n Digite " + contador + " para a conta: \n " + tipoConta.toString());
			contador++;			
		}
		 // usuario escolhe com quais contas quer trabalhar
		System.out.println("\nInforme com qual conta deseja realizar a operação >>>");
		contaEscolhida = sc.nextInt();
		
		
		while (opcao != 0) {
			
			// apreseta as opções do menu ao usuário
			
			System.out.print(
				" ....Menu..." +
					"\n" +
					"\n 1 - Consultar Saldo" +
					"\n 2 - Depositar" +
					"\n 3 - Sacar " +
					"\n 4 - Saldo Geral " +
					"\n................." +
					"\n 0 - Sair" + 
					"\n" + 
					"\nInforme a opção desejada");
			
			// captura a opção do menu digitada pelo usuário
			opcao = sc.nextInt();
			
			
			switch (opcao) {
			
			case 1:
				for (Conta tipoConta: contasCliente) {
										
					if (tipoConta == contasCliente [contaEscolhida -1])
						System.out.println("\nSaldo da Conta "+ tipoConta.nrConta + ">>> R$" + tipoConta);
				}
				break;
				
			case 2: 
				for (Conta tipoConta : contasCliente) {
					if (tipoConta == contasCliente [contaEscolhida -1]) {
						System.out.print("Informe o valor desejado para depósito >> R$");
						double valor = sc.nextDouble();
						tipoConta.deposita(valor);		
																	
					}
				}
				
				System.out.println("Deposito efetuado com sucesso... Consulte o saldo para confirmar o valor");
				break;
				
			case 3:
				for (Conta tipoConta : contasCliente) {
					
					if (tipoConta == contasCliente [contaEscolhida -1]) {
						System.out.print("Informe o valor para saque >>> R$ ");
						double valor = sc.nextDouble();
						tipoConta.saca(valor);
					}
				}
				
				System.out.println("\nSaque efetuado com sucesso...Consulte o saldo para confirmar!");
				break;
				
			case 4: 
				
				for(Conta tipoConta : contasCliente) {
					System.out.println("Saldo da conta" + tipoConta.nrConta + ">>>R$" + tipoConta.getVlSaldo());
				}
				break;
				
				default:
					if (opcao != 0) {
						
						System.out.println("\nVocê precisa selecionar uma das opções válidas\n");
					}
			break;
			}
			System.out.println("Obrigada por utilizar nosso sistema");
						sc.close();
			
					}
	}
}
	
	