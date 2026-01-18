public class Tapete extends Produto{
    public Tapete(double preco, String nome, int quantia){
        super(preco, nome, quantia);
    }
    public void produzir(int macacos){
        quantia = macacos;
    }
    public double vender(){
        double valorFinal = quantia * preco;
        return valorFinal;
    }
}
