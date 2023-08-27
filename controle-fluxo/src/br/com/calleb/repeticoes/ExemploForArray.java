package br.com.calleb.repeticoes;

/**
 * @author Calleb
 */
public class ExemploForArray {

    public static void main(String[] args) {
        // Em arrays o indice se inicia em 0 Zero
        String alunos[] = { "Felipe", "Jonas", "Julia", "Marcos" };

        for (int x = 0; x < alunos.length; x++) {
            System.out.println("O aluno no indice x = " + x + " é " + alunos[x]);
        }
    }
}
