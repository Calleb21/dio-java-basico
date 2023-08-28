package br.com.calleb.excepcionais;

import java.text.NumberFormat;
import java.text.ParseException;

/**
 * @author Calleb
 */
public class ExemploExcecao {
    public static void main(String[] args) {
        try {
            Number valor = NumberFormat.getInstance().parse("a1.75");
            System.out.println();
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
