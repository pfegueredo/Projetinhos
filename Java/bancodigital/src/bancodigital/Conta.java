package bancodigital;

public class Conta implements IConta {

	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	
	protected Cliente cliente;
	
	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	@Override
	public void sacar(double valor) {
		this.saldo -= valor;
		
	}

	@Override
	public void depositar(double valor) {
		this.saldo += valor;
		
	}

	@Override
	public void transferir(Conta conta, double valor) {
		if (this.saldo > valor) {
			this.saldo -= valor;
			conta.saldo += valor;
		}		
	}
	
	@Override
	public void imprimirExtrato() {
		System.out.println(String.format("Titular: %s ", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d ", this.agencia));
		System.out.println(String.format("Numero: %d ", this.numero));
		System.out.println(String.format("Saldo: %.2f ", this.saldo));
		System.out.println("");
	}

	
}
