public class Oleo extends Produto{
    public Oleo(double preco, String nome, int quantia){
        super(preco, nome, quantia);
    }
    public void produzir(int macacos){
        quantia = macacos * 3;
    }
    //a vender é implemento de vendivel, que esta implementado na classe pai, o msm para tapete
    public double vender(){
        double valorFinal = quantia * preco; 
        return valorFinal;
    }
}