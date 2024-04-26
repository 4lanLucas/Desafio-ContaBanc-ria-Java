import model.Client;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número da conta: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite sua agência: ");
        String agency = sc.nextLine();
        System.out.print("Digite seu nome: ");
        String name = sc.nextLine().toUpperCase();
        System.out.print("Digite o saldo da conta: ");
        Double balance = sc.nextDouble();

        Client client = new Client(number, agency, name, balance);

        System.out.print("Olá " + client.getClientName());
        System.out.print(", obrigado por criar uma conta em nosso banco, sua agência é " + client.getAgency());
        System.out.print(", conta " + client.getNumber());
        System.out.print(" e seu saldo " + client.getBalance() + " já está disponível para o saque");

    }
}