package br.com.value.jogo.dominio;

import java.util.Calendar;

public class Pagamento {

	private double valor;
	private Calendar data;

	public Pagamento(double valor, Calendar data) {
		this.valor = valor;
		this.data = data;
	}
	public double getValor() {
		return valor;
	}
	public Calendar getData() {
		return data;
	}
	
	public int ValidaValorPagamento(){
	    
	    if(valor == 0) {
	    	System.out.println("Valor do pagamento nao deve ser 0");
	    	return 1;
	    }
	    if(valor <= 0) {
	    	System.out.println("Valor do pagamento deve ser positivo");
	    	return 2;
	    }
	    return 0;
	}
}

