public abstract class Produto implements Vendivel{
    //como a Classe Pai produto já implementa Vendivel, as classes filhas são obrigadas a usar, a pai não
    public double preco;
    public String nome;
    public int quantia;

    public Produto(double preco, String nome, int quantia){
        this.preco = preco;
        this.nome = nome;
        this.quantia = quantia;
    }
    //o parametro int algo é necessario pois é uma sobrescrita
    public abstract void produzir(int algo);
    public String apresentarQuantia(){
        String txt = "O produto: "+nome+", tem em estoque "+quantia;
        return txt;
    }
}