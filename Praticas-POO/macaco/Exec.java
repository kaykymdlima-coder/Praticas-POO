public class Exec {
    public static void main(String args[]){
        Produto pro[] = new Produto[2];
        pro[0] = new Oleo(25, "Oleo", 0 );
        pro[1] = new Tapete(35, "Tapete de Macaco", 0);
        Loja loja = new Loja();
        Cliente cli = new Cliente("Kayky", "40028922");

        System.out.println("---Caçando Macacos e Produzindo itens---");
        //aponto pro ojeto caçada para pode atribuir macacos pros produtos
        Cacar caçada = new Cacar();

        //caçar para tapetes
        caçada.cacarMacaco(24);
        System.out.println(caçada.showMacacos());
        loja.saldo-= caçada.custoCaca;
        pro[1].produzir(caçada.macacos);
        //macacos acabam depois da produção
        caçada.macacos = 0;
        System.out.println(pro[1].apresentarQuantia());

        //vaçar para oleo
        caçada.cacarMacaco(12);
        System.out.println(caçada.showMacacos());
        loja.saldo-= caçada.custoCaca;
        pro[0].produzir(caçada.macacos);
        //macacos acabam depois da produção
        caçada.macacos = 0;
        System.out.println(pro[0].apresentarQuantia());

        System.out.println("---Cliente faz a compra---");
        System.out.println(loja.pedido(cli, pro[0]));
        System.out.println(pro[0].apresentarQuantia());
        System.out.println(pro[1].apresentarQuantia());
        System.out.println(loja.showSaldo());
    }
}
