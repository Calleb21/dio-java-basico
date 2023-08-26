package br.com.calleb;

import java.util.Scanner;

/**
 * @author Calleb
 */
public class ContaTermianl {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor digite o nome do cliente: ");
        String nomeCliente = sc.nextLine();

        System.out.println("Po favor digite o nome da Agencia: ");
        String nomeAgencia = sc.nextLine();

        System.out.println("Por favor digite o número da conta: ");
        int numeroConta = sc.nextInt();

        System.out.println("Por favor digite o saldo: ");
        double saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar sua conta " + numeroConta
                + " em nosso banco, sua agência é " + nomeAgencia + " e seu saldo de R$:" + saldo
                + " já está disponível para saque.");

        sc.close();
    }
}
