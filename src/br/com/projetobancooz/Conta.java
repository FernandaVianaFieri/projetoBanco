package br.com.projetobancooz;

public abstract class Conta {
	
	

	protected int nrConta;
	private int nrAgencia;
	private String nrBanco;
	protected double vlSaldo;
	
	
	
	public Conta () {
		
	}
	public Conta (int nrConta, int nrAgencia, String nrBanco, double vlSaldo) {
		this.nrConta = nrConta;
		this.nrAgencia = nrAgencia;
		this.nrBanco = nrBanco;
		this.vlSaldo = vlSaldo;
		
	}
	
	public abstract boolean saca (double valor);
	
	public void deposita (double valor ) 
	{this.vlSaldo -= valor;}
	
	@Override
	public String toString() {
		return "Conta [nrConta=" + nrConta + ", nrAgencia=" + nrAgencia + ", nrBanco=" + nrBanco + ", vlSaldo="
				+ vlSaldo + "]";
	}
	
	
}
