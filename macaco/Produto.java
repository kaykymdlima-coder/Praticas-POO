public abstract class Produto{
    public double preco;
    public String nome;
    public int quantia;

    public Produto(double preco, String nome, int quantia){
        this.preco = preco;
        this.nome = nome;
        this.quantia = quantia;
    }
}