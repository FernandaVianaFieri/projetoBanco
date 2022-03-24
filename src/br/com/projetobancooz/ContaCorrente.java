package br.com.projetobancooz;

public class ContaCorrente extends Conta{
	
	
	private double chequeEspecial;
	

	
	public ContaCorrente (int nrConta , int nrAgencia, String nrBanco, double vlSaldo, double chequeEspecial) {
		
		this.chequeEspecial = chequeEspecial;
		
	}
	
	
	
	public double  getVlSaldo () {
		return this.chequeEspecial + this.vlSaldo;
	}




	@Override
	public boolean saca(double valor) {
		double limiteTotal = this.chequeEspecial + this.vlSaldo;
		
		if (limiteTotal > 0 && limiteTotal >= valor && valor >0) {
			this.vlSaldo -= valor;
			return true;
		}
		else {
			System.err.println("O valor desejado é maior que o seu limite disponivel");
		}
		return false;
	}
	
	public void deposita (double valor) {
		this.vlSaldo += valor;
	}



	@Override
	public String toString() {
		return super.toString()  + "  ContaCorrente {" + 
	"chequeEspecial=" + chequeEspecial + 
	"Limite Total = R$" + getVlSaldo()+
	'}'; 
	}
	
	
}