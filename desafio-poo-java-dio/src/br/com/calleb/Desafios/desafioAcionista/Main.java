package br.com.calleb.desafios.desafioAcionista;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
       // Lê os dados de Entrada conforme descrito neste Desafio.
       Scanner scanner = new Scanner(System.in);
       String dataInicial = scanner.nextLine();
       String dataFinal = scanner.nextLine();

       SistemaAcionista sistemaAcionistas = new SistemaAcionista();
       List<String> analises = sistemaAcionistas.obterAnalisesDesempenho(dataInicial, dataFinal);

       if (analises.isEmpty()) {
           System.out.println("Nenhuma análise encontrada no período especificado.");
       } else {
           for (String analise : analises) {
               System.out.println(analise);
           }
       }

       scanner.close();
   }
}
