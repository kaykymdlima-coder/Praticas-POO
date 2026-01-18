public class Oleo extends Produto{
    public int litros;

    public Oleo(double preco, String nome, int quantia, int litros){
        super(preco, nome, quantia);
        this.litros = litros;
    }
}