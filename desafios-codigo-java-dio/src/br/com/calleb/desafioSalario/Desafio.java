package br.com.calleb.desafioSalario;

import java.util.Scanner;

/**
 * @author Calleb Camargo
 */
public class Desafio {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o sálario: ");
        float valorSalario = sc.nextFloat();

        System.out.println("Digite o valor dos benefícios: ");
        float valorBeneficios = sc.nextFloat();

        float valorImposto = 0;
        if(valorSalario >= 0 && valorSalario <= 1100) {
            valorImposto = 0.05f * valorSalario;
        } else if(valorSalario >= 1100.01 && valorSalario <= 2500.00) {
            valorImposto = 0.10f * valorSalario;
        } else {
            valorImposto = 0.15f * valorSalario;
        }

        float saida = valorSalario - valorImposto + valorBeneficios;
        System.out.println("\nO valor total é de R$:" + String.format("%.2f", saida));
    }
}
