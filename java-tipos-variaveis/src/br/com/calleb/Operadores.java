package br.com.calleb;

/**
 * @author Calleb
 */
public class Operadores {

    public static void main(String[] args) {
        // String concatenacao = "?";
        // int numero = 5;
        // int numero2 = 5;
        // boolean variavel = true;
        // int a, b;
        // int numero3 = 3;
        // int numero4 = 4;
        // String nome1 = "Calleb";
        // String nome2 = new String("Camargo");
        boolean condicao1 = true;
        boolean condicao2 = true;

        /**
         * Referente ao String concatenacao = "?";
         * 
         * System.out.println(concatenacao);
         * 
         * concatenacao = 1 + 1 + 1 + "1";
         * System.out.println(concatenacao);
         * 
         * concatenacao = 1 + 1 + "1" + 1;
         * System.out.println(concatenacao);
         * 
         * concatenacao = "1" + 1 + 1 + 1;
         * System.out.println(concatenacao);
         * 
         * concatenacao = "1" + (1 + 1 + 1);
         * System.out.println(concatenacao);
         **/

        /**
         * Referente ao int numero = 5;
         * 
         * numero = - numero;
         * System.out.println(numero);
         * 
         * numero = numero * -1;
         * System.out.println(numero);
         **/

        /**
         * Referente ao int numero = 5;
         * 
         * //numero = numero2 + 1
         * //numero2++;
         * System.out.println(numero2 ++);
         * System.out.println(numero2);
         **/

        /**
         * Referente ao boolean variavel = true;
         * 
         * System.out.println(!variavel);
         * 
         * variavel = !variavel;
         * System.out.println(variavel);
         **/

        /**
         * Referente ao int a, b;
         * 
         * a = 5;
         * b = 5;
         * 
         * // Outra maneira de verificar a expressão booleana
         * String resultado = a == b ? "verdadeiro" : "falso";
         * 
         * /**
         * String resultado = "";
         * if (a == b) {
         * resultado = "Verdadeiro";
         * } else {
         * resultado = "falso";
         * }
         * 
         * System.out.println(resultado);
         **/

        /**
         * Referente ao int numero3 = 3 e int numero4 = 4;
         * 
         * if(numero3 < numero4) {
         * System.out.println("A nossa condição é verdadeira");
         * } else if(numero3 > numero4){
         * System.out.println("A nossa condição é falsa");
         * } else {
         * System.out.println("Os números são iguais");
         * }
         * 
         * boolean simNao = numero3 == numero4;
         * System.out.println("numero3 é igual ao numero4? " + simNao);
         * 
         * simNao = numero3 != numero4;
         * System.out.println("numero3 é diferente de numero4?" + simNao);
         * 
         * simNao = numero3 > numero4;
         * System.out.println("numero3 é maior que numero4?" + simNao);
         * 
         * simNao = numero3 < numero4;
         * System.out.println("numero3 é menor que numero4?" + simNao);
         **/

        /**
         * Referente ao nome1 = "Calleb" e nome2 = "Camargo";
         * 
         * System.out.println(nome1.equals(nome2));
         */

        if (condicao1 && condicao2) {
            System.out.println("As condições são verdadeiras");
        }

        if (condicao1 || condicao2) {
            System.out.println("Uma das condições são verdadeiras");
        }
        
        System.out.println("Fim");
    }
}
