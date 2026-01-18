public class Cacar{
    public int macacos;
    public double custoCaca;

    public void cacarMacaco(int horas){
        macacos = (horas - 3);
        custoCaca = horas/2;
    }

    public int showMacacos(){
        return macacos;
    }
}