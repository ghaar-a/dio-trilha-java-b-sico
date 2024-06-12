import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Criar um objeto scanner na classe Scanner para avaliar as entradas do cliente
        Scanner scanner = new Scanner(System.in);
        //Exibir as mensagens para o usuário
        // Obter pela scanner os valores digitados no terminal 
        System.out.println("Por favor, digite o seu nome completo");
        String nomeCliente = scanner.nextLine();        

        System.out.println("Agora digite o numero da agencia");
        String agencia = scanner.next();

        System.out.println("Agora digite o numero da conta");
        int conta = scanner.nextInt();

        System.out.println("Por fim, digite o saldo");
        double saldo = scanner.nextDouble();
        // Fechar o objeto scanner 
        scanner.close();
        // Exibir a mensagem de confirmação 
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque");
    }
}