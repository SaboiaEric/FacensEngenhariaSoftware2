import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args){
        Palindromo p = new Palindromo();
        System.out.println(p.eUmPalindromo(JOptionPane.showInputDialog("Digite a palavra")));
    }
}
