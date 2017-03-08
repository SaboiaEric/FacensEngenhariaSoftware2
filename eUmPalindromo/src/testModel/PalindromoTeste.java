package testModel;
import static org.junit.Assert.*;
import org.junit.Test;
import model.Palindromo;
public class PalindromoTeste {
	@Test
    public void VerificarSeUmPalindromoEVerdadeiro() throws Exception{
            String palavra = "Ana";
            Palindromo palindromo = new Palindromo();
            boolean verificacao = palindromo.eUmPalindromo(palavra);
            assertEquals(true,verificacao);
    }
    
	@Test(expected = ArithmeticException.class)
    public void VerificarSeUmPalindromoEFalso() throws Exception{
            String palavra = "Frederico";
            Palindromo palindromo = new Palindromo();
            boolean verificacao = palindromo.eUmPalindromo(palavra);
            assertEquals(false,verificacao);
    }
    
}

