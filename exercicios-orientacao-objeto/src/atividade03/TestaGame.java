package atividade03;

public class TestaGame {
    public static void main(String[] args) {

    Produto p1 = new Produto(325, "Mario Kart 8 Deluxe", "Corrida", 324, "Físico");
    Produto p2 = new Produto(326, "The Legend of Zelda: Breath of the Wild", "Mundo aberto", 89, "Digital");

    p1.visu("\nId: " + p1.getId() + "\nNome do jogo: " + p1.getNomeJogo() + "\nModelo do Jogo: " + p1.getModeloJogo() + "\nPreço: " + p1.getPreco() + "\nFormato: " + p1.getFormato());
    p2.visu("\nId: " + p2.getId() + "\nNome do jogo: " + p2.getNomeJogo() + "\nModelo do Jogo: " + p2.getModeloJogo() + "\nPreço: " + p2.getPreco() + "\nFormato: " + p2.getFormato());

    }
}
