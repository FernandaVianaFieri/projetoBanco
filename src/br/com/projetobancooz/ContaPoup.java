package br.com.projetobancooz;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ContaPoup extends Conta {

	
	private int diaAniversario;
	private double txJuros;
	
	
	
	public ContaPoup (int nrConta, int nrAgencia, String nrBanco, double vlSaldo, int diaAniversario, double txJuros)	{
		super ( nrConta, nrAgencia,  nrBanco,  vlSaldo);
		this.diaAniversario = diaAniversario;
		this.txJuros = txJuros;
		
		
	}
	
	public double getVlSaldo () {
		
		Calendar data = Calendar.getInstance();
		SimpleDateFormat dia = new SimpleDateFormat ("dd");
		
		if (Integer.parseInt (dia.format(data.getTime()))== this.diaAniversario) {
			return this.vlSaldo + this.txJuros * this.vlSaldo;
			
		}
		else {
			return this.vlSaldo;
		}
			
			}
	

	@Override
	public boolean saca(double valor) {
				
			if (this.getVlSaldo() > 0 && getVlSaldo() >= valor && valor >0 ){
				this.vlSaldo -= valor;
				return true;
			}
			else {
				System.err.println("O valor desejado é maior que o saldo em sua conta");
				return false;
			}
	}
	
	@Override
	public void deposita (double valor) {
		this.vlSaldo += valor;
	}

	@Override
	public String toString() {
		return super.toString() +  "ContaPoup [diaAniversario= " + diaAniversario + ", txJuros= " + txJuros + "]" + "Valor do saldo " + vlSaldo;
	}
		
	
			}


