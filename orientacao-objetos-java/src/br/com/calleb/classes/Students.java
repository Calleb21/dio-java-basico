package br.com.calleb.classes;

public class Students {
        private String nome;
        private String sexo;
        private int idade;
        
        public Students(String nome, String sexo, int idade) {
                this.nome = nome;
                this.sexo = sexo;
                this.idade = idade;
        }

        public void ler() {
                System.out.println(nome + " está lendo algo.");
        }

        public void estudar() {
                System.out.println(nome + " está estudando algo.");
        }

        public void aniversario() {
                idade++;
                System.out.println(nome + " agora tem " + idade + " anos de idade.");
        }

        public void faixaEtaria() {
                if (idade > 0 && idade <= 10) {
                        System.out.println(nome + " é uma criança");
                } else if (idade > 10 && idade <= 15) {
                        System.out.println(nome + " é um pré adolescente");
                } else if (idade > 15 && idade <= 20) {
                        System.out.println(nome + " é um adolescente");
                } else if (idade > 20 && idade <= 60) {
                        System.out.println(nome + " é um adulto");
                } else {
                        System.out.println(nome + " é um idoso");
                }
        }

        public void serie() {
                if (idade > 10 && idade <= 15) {
                        System.out.println(nome + " está no ensino fundamental.");
                } else if (idade > 15 && idade <= 19) {
                        System.out.println(nome + " está no ensino médio.");
                } else if (idade > 19 && idade <= 25) {
                        System.out.println(nome + " está na faculdade");
                } else {
                        System.out.println("Idade não condiz com os paramêtros de ensino");
                }
        }

        public String getNome() {
                return nome;
        }

        public void setNome(String nome) {
                this.nome = nome;
        }

        public String getSexo() {
                return sexo;
        }

        public void setSexo(String sexo) {
                this.sexo = sexo;
        }

        public int getIdade() {
         System.out.println(nome + " tem " + idade + " anos");
         return idade;
        }

        public void setIdade(int idade) {
                this.idade = idade;
        }
}
