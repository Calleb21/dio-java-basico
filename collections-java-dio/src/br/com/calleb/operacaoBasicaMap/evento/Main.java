package br.com.calleb.operacaoBasicaMap.evento;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    
    public static void main(String[] args) {
        AgendaEvento agendaEvento = new AgendaEvento();

        agendaEvento.adicionarEvento(LocalDate.of(2022, Month.APRIL, 23), "Evento 1", "Atração 1");
        agendaEvento.adicionarEvento(LocalDate.of(2004, Month.JULY, 13), "Evento 2", "Atração 2");
        agendaEvento.adicionarEvento(LocalDate.of(2024, Month.FEBRUARY, 3), "Evento 3", "Atração 3");

        agendaEvento.exibirAgenda();
        agendaEvento.obterProximoEvento();
    }
}
