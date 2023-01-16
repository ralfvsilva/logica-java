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

        public class TestaCliente {
            public static void main(String[] args) {

                atividade01.Cliente cliente1 = new atividade01.Cliente("Ralf ", "Silva", "361.862.468-92", "12/01/1999", true);
                atividade01.Cliente cliente2 = new atividade01.Cliente("Jonas ", "Santos", "864.465.371-55", "25/03/1995", false);

                cliente1.visualizar("Nome comoleto: " + cliente1.getNome() + cliente1.getSobrenome() + "\nCPF: " + cliente1.getCpf() + "\nData de nascimento: " + cliente1.getDataNasc() + "\nPossui cartão? " + cliente1.isCartao());

                cliente2.visualizar("\nNome comoleto: " + cliente2.getNome() + cliente2.getSobrenome() + "\nCPF: " + cliente2.getCpf() + "\nData de nascimento: " + cliente2.getDataNasc() + "\nPossui cartão? " + cliente2.isCartao());
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

        public class TestaGame {
            public static void main(String[] args) {

                atividade03.Produto p1 = new atividade03.Produto(325, "Mario Kart 8 Deluxe", "Corrida", 324, "Físico");
                atividade03.Produto p2 = new atividade03.Produto(326, "The Legend of Zelda: Breath of the Wild", "Mundo aberto", 89, "Digital");

                p1.visu("\nId: " + p1.getId() + "\nNome do jogo: " + p1.getNomeJogo() + "\nModelo do Jogo: " + p1.getModeloJogo() + "\nPreço: " + p1.getPreco() + "\nFormato: " + p1.getFormato());
                p2.visu("\nId: " + p2.getId() + "\nNome do jogo: " + p2.getNomeJogo() + "\nModelo do Jogo: " + p2.getModeloJogo() + "\nPreço: " + p2.getPreco() + "\nFormato: " + p2.getFormato());

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

        public class TestaIngresso {

            public static void main(String[] args) {

                atividade05.Ingresso ing1 = new atividade05.Ingresso("Maria", "Quitéria", "325.479.850-53", 33, true);
                atividade05.Ingresso ing2 = new atividade05.Ingresso("Gabriela", "Silva", "127.537.931-04", 21, true);

                ing1.visu();
                ing2.visu();
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
