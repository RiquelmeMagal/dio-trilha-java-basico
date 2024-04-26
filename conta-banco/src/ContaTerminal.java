import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da conta: ");
        int numero = sc.nextInt();

        System.out.println("Digite o numero da agencia: ");
        String agencia = sc.next();

        System.out.println("Nome do titular da conta: ");
        String nome = sc.next();

        sc.next();
        System.out.println("Saldo da conta: ");
        double saldo = sc.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");


        sc.close();
    }
}
