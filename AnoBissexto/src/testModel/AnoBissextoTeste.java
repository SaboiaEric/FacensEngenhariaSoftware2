package testModel;
import static org.junit.Assert.*;
import org.junit.Test;
import model.AnoBissexto;

public class AnoBissextoTeste {
	@Test
	public void TestarAnoDeEntrada() throws Exception{
		int ano = 2016;
		AnoBissexto anoBissexto = new AnoBissexto();
        boolean resultado = anoBissexto.calculaAnoBissexto(ano);
        assertEquals(true,resultado);
	}
	@Test
	public void TestarTipoDeEntrada() throws Exception{
		String ano = "2014";
		AnoBissexto anoBissexto = new AnoBissexto();
        boolean resultado = anoBissexto.calculaAnoBissexto(Integer.parseInt(ano));
        assertEquals(false,resultado);
	}
	@Test
	public void TestarErroDeEntrada() throws Exception{
		String ano = "500";
		AnoBissexto anoBissexto = new AnoBissexto();
        boolean resultado = anoBissexto.calculaAnoBissexto(Integer.parseInt(ano));
        assertEquals(false,resultado);
	}
}
