package br.com.calleb.pessoa;

public class SistemaCadastro {
    
    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa("Calleb", "15559493348");

        pessoa.setEndereco("Caldas Novas");
        System.out.println(pessoa.getNome() + "-" + pessoa.getCpf());
    }
}
