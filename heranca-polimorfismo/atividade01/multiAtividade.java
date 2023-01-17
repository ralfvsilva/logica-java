package atividade01;

public class multiAtividade {
    public static void main(String[] args) {

        package atividade01;

        public class Cliente {

            private String nome;
            private String sobrenome;
            private String dataNasc;
            private boolean cartao;

            public Cliente(String nome, String sobrenome, String dataNasc, boolean cartao) {
                this.nome = nome;
                this.sobrenome = sobrenome;
                this.dataNasc = dataNasc;
                this.cartao = cartao;
            }

            public void visu(){
                System.out.println("\nNome: " + this.getNome() + this.getSobrenome() + "\nData de nascimento: " + this.getDataNasc());
            }

            public void setNome(String nome){
                this.nome = nome;
            }

            public String getNome(){
                return nome;
            }

            public String getSobrenome() {
                return sobrenome;
            }

            public void setSobrenome(String sobrenome) {
                this.sobrenome = sobrenome;
            }

            public String getDataNasc() {
                return dataNasc;
            }

            public void setDataNasc(String dataNasc) {
                this.dataNasc = dataNasc;
            }

            public boolean isCartao() {
                return cartao;
            }

            public void setCartao(boolean cartao) {
                this.cartao = cartao;
            }
        }
        package atividade01;

        public class PessoaFisica extends atividade01.Cliente {

            private int ipva;
            private String cpf;

            public PessoaFisica(String nome, String sobrenome, String dataNasc, boolean cartao, int ipva, String cpf) {
                super(nome, sobrenome, dataNasc, cartao);
                this.ipva = ipva;
                this.cpf = cpf;
            }

            @Override
            public void visu(){
                super.visu();
                System.out.println("\nNome: " + this.getNome() + " " + this.getSobrenome() + "\nCPF: " + this.getCpf() + "\nData de nascimento: " + this.getDataNasc() + "\nCartão? " + this.isCartao() + "\nValor ipva: " + this.getIpva());
            }

            public int getIpva() {
                return ipva;
            }

            public void setIpva(int ipva) {
                this.ipva = ipva;
            }

            public String getCpf() {
                return cpf;
            }

            public void setCpf(String cpf) {
                this.cpf = cpf;
            }


        }
        package atividade01;

        public class PessoaJuridica extends atividade01.Cliente {

            private String cnpj;
            private boolean mei;

            public PessoaJuridica(String nome, String sobrenome, String dataNasc, boolean cartao, String cnpj, boolean mei) {
                super(nome, sobrenome, dataNasc, cartao);
                this.cnpj = cnpj;
                this.mei = mei;
            }

            @Override
            public void visu(){
                super.visu();
                System.out.println("\nNome: " + this.getNome() + " " + this.getSobrenome() + "\nCNPJ: " + this.getCnpj() + "\nData de nascimento: " + this.getDataNasc() + "\nCartão? " + this.isCartao() + "\nMei: " + this.isMei());
            }

            public String getCnpj() {
                return cnpj;
            }

            public void setCnpj(String cnpj) {
                this.cnpj = cnpj;
            }

            public boolean isMei() {
                return mei;
            }

            public void setMei(boolean mei) {
                this.mei = mei;
            }
        }
    package atividade01;

        public class TestaCliente {
            public static void main(String[] args) {

                atividade01.Cliente cliente1 = new atividade01.Cliente("Ralf ", "Silva", "12/01/1999", true);
                atividade01.Cliente cliente2 = new atividade01.Cliente("Jonas ", "Santos", "25/03/1995", false);
                atividade01.PessoaFisica c3 = new atividade01.PessoaFisica("Isabela", "Souza", "18/05/1989", false, 1999, "761.854.931-04");
                atividade01.PessoaFisica c4 = new atividade01.PessoaFisica("Fernanda", "Soares", "13/11/2000", true, 2350, "325.427.851-23");
                atividade01.PessoaJuridica c5 = new atividade01.PessoaJuridica("Isabela", "Souza", "18/05/1989", false, "04.128.563/0001-10", false);
                atividade01.PessoaJuridica c6 = new atividade01.PessoaJuridica("Fernanda", "Soares", "13/11/2000", true, "12.528.708/0001-07", true);


                cliente1.visu();
                cliente2.visu();
                c3.visu();
                c4.visu();
                c5.visu();
                c6.visu();

            }
        }
    }
}
