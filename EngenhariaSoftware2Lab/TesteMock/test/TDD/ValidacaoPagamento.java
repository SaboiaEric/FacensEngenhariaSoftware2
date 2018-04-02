package TDD;

import br.com.value.jogo.dominio.Pagamento;
import org.junit.Assert;
import java.util.Calendar;

import org.junit.Test;

/** * * @author Lauren Ferreira */
public class ValidacaoPagamento {
        private Pagamento pagamento;
        
        @Test
    	public void realizarPagamentoComValorZero(){
        	Calendar horarioAtual = Calendar.getInstance();
        	double valor = -100.0;
    		this.pagamento = new Pagamento(valor, horarioAtual);
                    Assert.assertEquals(1, this.pagamento.ValidaValorPagamento());
    	}
        
        @Test
    	public void realizarPagamentoComValorNegativo(){
        	Calendar horarioAtual = Calendar.getInstance();
        	double valor = -100.0;
    		this.pagamento = new Pagamento(valor, horarioAtual);
                    Assert.assertEquals(2, this.pagamento.ValidaValorPagamento());
    	}
        
        @Test
    	public void realizarPagamentoComValorValido(){
        	Calendar horarioAtual = Calendar.getInstance();
        	double valor = 50.0;
    		this.pagamento = new Pagamento(valor, horarioAtual);
                    Assert.assertEquals(2, this.pagamento.ValidaValorPagamento());
    	}

}
