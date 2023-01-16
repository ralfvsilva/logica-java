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
