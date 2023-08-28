package br.com.calleb.cases;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author Calleb
 */
public class ProcessoSeletivo {

    public static void main(String[] args) {
        String[] candidatos = { "Felipe", "Marcia", "Julia", "Joao", "Rafael" };
        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando) {
                tentativasRealizadas++;
            } else {
                System.out.println("CONTATO REALIZADO COM SUCESSO");
            }
        } while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu)
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVA");
        else
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NÚMERO MAXIMO TENTATIVAS "
                    + tentativasRealizadas + " REALIZADA");
    }

    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static void imprimirSelecionados() {
        String[] candidatos = { "Felipe", "Marcia", "Julia", "Joao", "Rafael" };
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento\n");
        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de número  " + (indice + 1) + " é " + candidatos[indice]);
        }
        System.out.println("\nForma abreviada de intereção for each\n");

        for (String candidato : candidatos) {
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }

    static void selecaoCandidatos() {
        String[] candidatos = { "Felipe", "Marcia", "Julia", "Joao", "Rafael", "Guilherme", "Bruna", "Rafaella",
                "Camargo", "Bianca" };
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendito();
            System.out.println(
                    "O candidato " + candidato + " solicitou este valor de salário R$:" + salarioPretendido + ". ");
            if (salarioBase >= salarioPretendido) {
                System.out.println("O canditado " + candidato + " foi selecionado para a vaga.");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendito() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PAR O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
