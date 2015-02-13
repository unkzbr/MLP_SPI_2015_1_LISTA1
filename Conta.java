public class Conta {
	private int numero;
	private double saldo;

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
 
	public void creditar(double saldo) {
		this.saldo += saldo;
	}

	public void debitar(double saldo) {
		
		this.saldo -= saldo;
	}
	
	public void setNum(int numero) {
		this.numero = numero;
	}
	public void transferir(double valor, Conta conta) {
		if (valor > this.saldo) { 
			System.out.println("Saldo Insuficiente");
		}
		else {
		this.debitar(valor);
		conta.creditar(valor);
		}
		
	}

	
}
