import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: CONHECER E IMPORTAR A CLASSE SCANNER
        //EXBIBIR AS MENSAGENS PARA O USUARIO
        //OBTER OS VALORES INFORMADOS NO TERMINAL
        // EXIBIR AS MENSAGEM NO TERMINAL
    	    	
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Deseja abrir sua Conta em nosso Banco? S / N");
    	String resposta = sc.next();
    	
    	if(resposta.toUpperCase().equals("S") ) {
    		
    		Usuario cliente = new Usuario();
    		System.out.println("Digite seu nome: ");
    		cliente.setNome(sc.next());
    		System.out.println("Por favor, digite agora o numero de sua conta:");
    		cliente.setNumero(sc.nextInt());
    		System.out.println("Por favor, digite o numero de sua agencia incluido o digito: (EX: 1122-0)");
    		cliente.setAgencia(sc.next());
    		System.out.println("Por favor, Digite seu Saldo: ");
    		cliente.setSaldo(sc.nextDouble());
    		
    		System.out.println("Olá "+ cliente.getNome()+", obrigado por criar uma conta em nosso banco, sua agência é "+ 
    		cliente.getAgencia()+ ", conta: "+ cliente.getNumero() +" e seu saldo de " + cliente.getSaldo() +
    		" já está disponível para saque");
    	}
    	
    	System.out.println("Obrigado por visitar nossa Banco! ");
    	System.out.println("Aguadamos seu retorno em breve.");
    	
    	
    	sc.close();
    	
    }
}
