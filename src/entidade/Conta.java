package entidade;

public class Conta {
	private Cliente cliente;
	private int numero;
	private double saldo;

	public Conta(Cliente cliente, int numero, double saldo) {
		this.cliente = cliente;
		this.numero = numero;
		this.saldo = saldo;
	}

	public Conta(Cliente cliente, int numero) {
		this.cliente = cliente;
		this.numero = numero;
		this.saldo = 0;
	}

	public Conta() {

	}

	public String getCliente() {
		return cliente.getNome();
	}

	public void setCliente(String nome) {
		this.cliente.setNome(nome);
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void depositar(double valor) {
		saldo += valor;
	}

	public void sacar(double valor) {
		if (this.saldo >= valor + 5) {
			saldo -= valor;
		} else {
			System.out.println("Saldo insuficiente...");
		}
	}

	private void saque(double valor) {
		this.saldo -= valor + 5;
	}

	public boolean validaSaque(double valor) {
		if (this.saldo >= valor + 5) {
			saque(valor);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Conta [cliente = " + cliente + ", numero = " + numero + ", saldo = " + saldo + "]";
	}

}
