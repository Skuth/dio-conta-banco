import java.util.Scanner;

public class AccountTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        
        System.out.println("Por favor, digite o número da conta: ");
        int number = scanner.nextInt();

        System.out.println("Por favor, digite o número da agência: ");
        String agency = scanner.next();

        System.out.println("Por favor, digite o seu nome: ");
        String name = scanner.next();

        System.out.println("Por favor, digite o seu saldo: ");
        double balance = scanner.nextDouble();

        scanner.close();
        
        Account account = new Account(
            number,
            agency,
            name,
            balance
        );

        System.out.println(account);
    }
}
