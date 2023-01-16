package multi;

import atividade01.Cliente;
import atividade02.Funcionario;
import atividade03.Produto;
import atividade04.Farmacia;
import atividade05.Ingresso;
import atividade06.Curso;

public class ArquivoMulti {

    public static void main(String[] args) {

        package atividade01;

        public class Cliente {

            private String nome;
            private String sobrenome;
            private String cpf;
            private String dataNasc;
            private boolean cartao;

            public Cliente(String nome, String sobrenome, String cpf, String dataNasc, boolean cartao) {
                this.nome = nome;
                this.sobrenome = sobrenome;
                this.cpf = cpf;
                this.dataNasc = dataNasc;
                this.cartao = cartao;
            }

            public Cliente() {
            }

            public void visualizar(String visu){
                System.out.println(visu);
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

            public String getCpf() {
                return cpf;
            }

            public void setCpf(String cpf) {
                this.cpf = cpf;
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

        public class TestaCliente {
            public static void main(String[] args) {

                atividade01.Cliente cliente1 = new atividade01.Cliente("Ralf ", "Silva", "361.862.468-92", "12/01/1999", true);
                atividade01.Cliente cliente2 = new atividade01.Cliente("Jonas ", "Santos", "864.465.371-55", "25/03/1995", false);

                cliente1.visualizar("Nome comoleto: " + cliente1.getNome() + cliente1.getSobrenome() + "\nCPF: " + cliente1.getCpf() + "\nData de nascimento: " + cliente1.getDataNasc() + "\nPossui cartão? " + cliente1.isCartao());

                cliente2.visualizar("\nNome comoleto: " + cliente2.getNome() + cliente2.getSobrenome() + "\nCPF: " + cliente2.getCpf() + "\nData de nascimento: " + cliente2.getDataNasc() + "\nPossui cartão? " + cliente2.isCartao());
            }
        }
        package atividade02;

        public class Funcionario {

            private int id;
            private String nome;
            private String sobrenome;
            private int salario;
            private boolean adicionalNoturno;

            public Funcionario(int id, String nome, String sobrenome, int salario, boolean adicionalNoturno) {
                this.id = id;
                this.nome = nome;
                this.sobrenome = sobrenome;
                this.salario = salario;
                this.adicionalNoturno = adicionalNoturno;
            }

            public void visu(String visualizar){
                System.out.printf(visualizar);
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getNome() {
                return nome;
            }

            public void setNome(String nome) {
                this.nome = nome;
            }

            public String getSobrenome() {
                return sobrenome;
            }

            public void setSobrenome(String sobrenome) {
                this.sobrenome = sobrenome;
            }

            public int getSalario() {
                return salario;
            }

            public void setSalario(int salario) {
                this.salario = salario;
            }

            public boolean isAdicionalNoturno() {
                return adicionalNoturno;
            }

            public void setAdicionalNoturno(boolean adicionalNoturno) {
                this.adicionalNoturno = adicionalNoturno;
            }
        }
        package atividade02;

        public class TestaFuncionario {
            public static void main(String[] args) {

                atividade02.Funcionario func1 = new atividade02.Funcionario(001, "João","Lima", 2500, true);
                atividade02.Funcionario func2 = new atividade02.Funcionario(001, "Leonardo","Calmon", 4500, false);

                func1.visu("Id: " + func1.getId() + "\nNome: " + func1.getNome() + " " + func1.getSobrenome() + "\nSalário: " + func1.getSalario() + "\nPossui adicional noturno? " + func1.isAdicionalNoturno());
                func2.visu("\n\nId: " + func2.getId() + "\nNome: " + func2.getNome() + " " + func2.getSobrenome() + "\nSalário: " + func2.getSalario() + "\nPossui adicional noturno? " + func2.isAdicionalNoturno());

            }
        }
        package atividade03;

        public class Produto {

            private int id;
            private String nomeJogo;
            private String modeloJogo;
            private double preco;
            private String formato;

            public Produto(int id, String nomeJogo, String modeloJogo, double preco, String formato) {
                this.id = id;
                this.nomeJogo = nomeJogo;
                this.modeloJogo = modeloJogo;
                this.preco = preco;
                this.formato = formato;
            }

            public void visu(String visualizar){
                System.out.println(visualizar);
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getNomeJogo() {
                return nomeJogo;
            }

            public void setNomeJogo(String nomeJogo) {
                this.nomeJogo = nomeJogo;
            }

            public String getModeloJogo() {
                return modeloJogo;
            }

            public void setModeloJogo(String modeloJogo) {
                this.modeloJogo = modeloJogo;
            }

            public double getPreco() {
                return preco;
            }

            public void setPreco(double preco) {
                this.preco = preco;
            }

            public String getFormato() {
                return formato;
            }

            public void setFormato(String formato) {
                this.formato = formato;
            }
        }
        package atividade03;

        public class TestaGame {
            public static void main(String[] args) {

                atividade03.Produto p1 = new atividade03.Produto(325, "Mario Kart 8 Deluxe", "Corrida", 324, "Físico");
                atividade03.Produto p2 = new atividade03.Produto(326, "The Legend of Zelda: Breath of the Wild", "Mundo aberto", 89, "Digital");

                p1.visu("\nId: " + p1.getId() + "\nNome do jogo: " + p1.getNomeJogo() + "\nModelo do Jogo: " + p1.getModeloJogo() + "\nPreço: " + p1.getPreco() + "\nFormato: " + p1.getFormato());
                p2.visu("\nId: " + p2.getId() + "\nNome do jogo: " + p2.getNomeJogo() + "\nModelo do Jogo: " + p2.getModeloJogo() + "\nPreço: " + p2.getPreco() + "\nFormato: " + p2.getFormato());

            }
        }
        package atividade04;

        public class Farmacia {

            private String nome;
            private String sobrenome;
            private String cpf;
            private boolean cadastro;
            private int total;

            public Farmacia(String nome, String sobrenome, String cpf, boolean cadastro, int total) {
                this.nome = nome;
                this.sobrenome = sobrenome;
                this.cpf = cpf;
                this.cadastro = cadastro;
                this.total = total;
            }

            public void visu(String visualizar){
                System.out.println(visualizar);
            }

            public String getNome() {
                return nome;
            }

            public void setNome(String nome) {
                this.nome = nome;
            }

            public String getSobrenome() {
                return sobrenome;
            }

            public void setSobrenome(String sobrenome) {
                this.sobrenome = sobrenome;
            }

            public String getCpf() {
                return cpf;
            }

            public void setCpf(String cpf) {
                this.cpf = cpf;
            }

            public boolean isCadastro() {
                return cadastro;
            }

            public void setCadastro(boolean cadastro) {
                this.cadastro = cadastro;
            }

            public int getTotal() {
                return total;
            }

            public void setTotal(int total) {
                this.total = total;
            }
        }
        package atividade04;

        public class TestaFarmacia {

            public static void main(String[] args) {

                atividade04.Farmacia f1 = new atividade04.Farmacia("Maurício", "Santana", "574.279.648-77", true, 239);
                atividade04.Farmacia f2 = new atividade04.Farmacia("Abner", "Souza", "793.419.386-90", false, 22);

                f1.visu("\nNome: " + f1.getNome() + " " + f1.getSobrenome() + "\nCPF: " + f1.getCpf() + "\nPossui cadastro? " + f1.isCadastro() + "\nTotal da compra: " + f1.getTotal());
                f2.visu("\nNome: " + f2.getNome() + " " + f2.getSobrenome() + "\nCPF: " + f2.getCpf() + "\nPossui cadastro? " + f2.isCadastro() + "\nTotal da compra: " + f2.getTotal());

            }
        }
        package atividade05;

        public class Ingresso {

            private String nome;
            private String sobrenome;
            private String cpf;
            private int preco;
            private boolean cartao;

            public Ingresso(String nome, String sobrenome, String cpf, int preco, boolean cartao) {
                this.nome = nome;
                this.sobrenome = sobrenome;
                this.cpf = cpf;
                this.preco = preco;
                this.cartao = cartao;
            }

            public void visu(){
                System.out.println("\nNome: " + this.getNome() + " " + this.getSobrenome() + "\nCPF: " + this.getCpf() + "\nPreço do ingresso: " + this.getPreco() + "\nCartão? " + this.isCartao());
            }

            public String getNome() {
                return nome;
            }

            public void setNome(String nome) {
                this.nome = nome;
            }

            public String getSobrenome() {
                return sobrenome;
            }

            public void setSobrenome(String sobrenome) {
                this.sobrenome = sobrenome;
            }

            public String getCpf() {
                return cpf;
            }

            public void setCpf(String cpf) {
                this.cpf = cpf;
            }

            public int getPreco() {
                return preco;
            }

            public void setPreco(int preco) {
                this.preco = preco;
            }

            public boolean isCartao() {
                return cartao;
            }

            public void setCartao(boolean cartao) {
                this.cartao = cartao;
            }
        }
        package atividade05;

        public class TestaIngresso {

            public static void main(String[] args) {

                atividade05.Ingresso ing1 = new atividade05.Ingresso("Maria", "Quitéria", "325.479.850-53", 33, true);
                atividade05.Ingresso ing2 = new atividade05.Ingresso("Gabriela", "Silva", "127.537.931-04", 21, true);

                ing1.visu();
                ing2.visu();
            }
        }
        package atividade06;

        public class Curso {

            private String nomeAluno;
            private String nomeCurso;
            private String area;
            private int valor;
            private String cpf;

            public Curso(String nomeAluno, String nomeCurso, String area, int valor, String cpf) {
                this.nomeAluno = nomeAluno;
                this.nomeCurso = nomeCurso;
                this.area = area;
                this.valor = valor;
                this.cpf = cpf;
            }

            public void visu(){
                System.out.println("\nNome do aluno: " + this.getNomeAluno() + "\nNome do curso: " + this.getNomeCurso() + "\nÁrea do curso: " + this.getArea() + "\nValor do curso: " + this.getValor() + "\n " + this.getCpf());
            }

            public String getNomeAluno() {
                return nomeAluno;
            }

            public void setNomeAluno(String nomeAluno) {
                this.nomeAluno = nomeAluno;
            }

            public String getNomeCurso() {
                return nomeCurso;
            }

            public void setNomeCurso(String nomeCurso) {
                this.nomeCurso = nomeCurso;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
            }

            public int getValor() {
                return valor;
            }

            public void setValor(int valor) {
                this.valor = valor;
            }

            public String getCpf() {
                return cpf;
            }

            public void setCpf(String cpf) {
                this.cpf = cpf;
            }
        }
        package atividade06;

        public class TestaCurso {

            public static void main(String[] args) {

                atividade06.Curso c1 = new atividade06.Curso("Ralf", "Engenharia de Software", "Tecnologia", 257, "012.345.678-90");
                atividade06.Curso c2 = new atividade06.Curso("Alexia", "Recursos Humanos", "Gestão de pessoas", 324, "098.765.432-11");

                c1.visu();
                c2.visu();
            }
        }

    }
}
