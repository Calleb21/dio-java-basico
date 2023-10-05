package br.com.calleb;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Description of br.com.calleb.Pessoa
 * Created by calle on 05/10/2023.
 */
public class Pessoa {

    private String nome;
    private LocalDate nascimento;

    public Pessoa(String nome, LocalDate nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public int getIdade() {
        return (int) ChronoUnit.YEARS.between(this.nascimento, LocalDate.now());
    }

    public boolean ehMaiorDeIdade() {
        return getIdade() >= 18;
    }
}
