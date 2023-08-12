package bancodigital;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		menu();
		Cliente cliente1 = new Cliente("Paulo");
		
		Conta poupanca = new ContaPoupanca(cliente1);
		Conta cc = new ContaCorrente(cliente1);
		
		poupanca.depositar(100);
		poupanca.sacar(50);
		poupanca.transferir(cc, 20);
		
		poupanca.imprimirExtrato();
		cc.imprimirExtrato();
	}
	
	
	public static void menu() {
		System.out.println("===\tSISTEMA BANCARIO FEGUEREDO\t===\n");
		
		System.out.println("Digite um número para escolher uma operação:\n");
		System.out.println("1 - Verificar saldo");
		System.out.println("2 - Realizar depósito");
		System.out.println("3 - Realizar saque");
		System.out.println("4 - Transferir");
		System.out.println("");
		Scanner entrada = new Scanner(System.in);
		int opcao = entrada.nextInt();
		
		switch (opcao) {
		case 1: {
			System.out.println("verificar saldo");
		}
		case 2: {
			System.out.println("Realizar depósito");
		}
		default:
			System.out.println("O valor é inválido");
		}
	}

}
