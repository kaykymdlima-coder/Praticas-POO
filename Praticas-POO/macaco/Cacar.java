public class Cacar{
    public int macacos;
    public double custoCaca;

    public void cacarMacaco(int horas, Loja loja) throws SaldoBaixoNengue {
        if(loja.saldo < horas/2){
            throw new SaldoBaixoNengue("Saldo ta baixo nengue: "+ loja.saldo);
        }
        macacos = (horas - 3);
        custoCaca = horas/2;
    }

    public int showMacacos(){
        return macacos;
    }
}