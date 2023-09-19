package br.com.calleb.desafios.desafioCofre;

import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tipoCofre = scanner.nextLine();
        

        if (tipoCofre.equalsIgnoreCase("digital")) {
             int senha;
             int confirmacaoSenha;

             senha = scanner.nextInt();
             confirmacaoSenha = scanner.nextInt();

             if (senha == confirmacaoSenha) {
                CofreDigital cofreDigital = new CofreDigital(senha);
                cofreDigital.imprimirInformacoes();
                System.out.println("Cofre aberto!");
             } else {
                CofreDigital cofreDigital = new CofreDigital(senha);
                cofreDigital.imprimirInformacoes();
                System.out.println("Senha incorreta!");
             }
        } else if (tipoCofre.equalsIgnoreCase("fisico")) {
            CofreFisico cofreFisico = new CofreFisico();
            cofreFisico.imprimirInformacoes();
        } else {
            System.out.println("Tipo de cofre inválido.");
        }

        scanner.close();
    }
}
