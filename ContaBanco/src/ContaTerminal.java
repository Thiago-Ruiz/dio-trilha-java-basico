import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta!");
        int Numero = myObj.nextInt();
        myObj.nextLine();
        
        System.out.println("Por favor, digite o número da Agência!");
        String Agencia = myObj.nextLine();

        System.out.println("Por favor, digite o nome do Cliente!");
        String NomeCliente = myObj.nextLine();

        System.out.println("Por favor, informe o saldo da conta");
        float Saldo = myObj.nextFloat();

        System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + Numero + " e seu saldo " + Saldo + " já está disponível para saque.");
    }
}


