package TDD;

import br.com.value.jogo.dominio.Participante;
import br.com.value.jogo.servico.Juiz;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/** * * @author Saboia */
public class ConsistenciaParticipante {
        private Juiz juiz;
	private Participante participante;

	@Test
	public void criarJulgamentoComParticipanteVazio(){
		this.juiz = new Juiz();
		this.participante = new Participante("");
                Assert.assertNotEquals(0, this.participante.ValidaNome().length());
	}
        
        @Test
	public void criarJulgamentoComUmDigito(){
		this.juiz = new Juiz();
		this.participante = new Participante("A");
                Assert.assertNotEquals(0, this.participante.ValidaNome().length());
	}
        
        @Test
	public void criarJulgamentoComParticipanteCamposVazio(){
		this.juiz = new Juiz();
                this.participante = new Participante("     ");        
                Assert.assertNotEquals(0, this.participante.ValidaNome().length());
	}
        
        @Test
	public void criarJulgamentoComParticipanteAceitavel(){
		this.juiz = new Juiz();
                this.participante = new Participante("José");
                Assert.assertEquals(0, this.participante.ValidaNome().length());
                
	}
}
