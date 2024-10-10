
import java.util.Scanner;

public class ContaTerminal
{
    public void obterDados() {
	    
	    int numero;
	    String agencia;
	    String clienteNome;
	    double saldo = 237.48;
	    
	    Scanner leitor = new Scanner(System.in);
	    
	    System.out.println("Digite o numero da agencia:");
	    numero = leitor.nextInt();
	    
	    leitor = new Scanner(System.in);
	    
	    System.out.println("Digite o nome da agencia:");
	    agencia = leitor.nextLine();
	    
	    System.out.println("Digite seu nome completo:");
	    clienteNome = leitor.nextLine();

	    
	    System.out.println("Ola " + clienteNome + ", obrigado por criar uma conta em nosso banco, sua agencia eh " + agencia + ", conta " + numero + " e seu saldo " + saldo + " ja esta disponivel para saque");
	    }
    
	public static void main(String[] args) {
	    ContaTerminal conta = new ContaTerminal();
	    conta.obterDados();
	}
}