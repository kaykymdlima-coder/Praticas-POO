import java.util.Scanner;
public class Exec {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        Produto pro[] = new Produto[2];
        pro[0] = new Oleo(25, "Oleo", 0 );
        pro[1] = new Tapete(35, "Tapete de Macaco", 0);
        Loja loja = new Loja(30);
        Cliente cli = new Cliente("Kayky", "40028922");
         //aponto pro ojeto caçada para pode atribuir macacos pros produtos
        Cacar caçada = new Cacar();
        int opc = -1;
        while(opc!=0){
            System.out.println("1-Caçar. 2-Prod.Oleo. 3-Prod.Tapete. 4-Pedido. 5-ShowAll. 0-Close.");
            opc = sc.nextInt();
            //limpar o scanner
            sc.nextLine();
            if(opc == 1){
                //se nn por o try-catch aq, ele nn reconhece a exception e da erro na linha cacada.cacar
                try{
                System.out.println("---Caçando Macacos---");
                System.out.print("Por quantas horas? ");
                int horas = sc.nextInt();
                sc.nextLine();
                caçada.cacarMacaco(horas, loja);
                loja.saldo-= caçada.custoCaca;
                System.out.println("Foram pegos: "+caçada.showMacacos());

                } catch (SaldoBaixoNengue erro){
                    System.err.println(erro.getMessage());
                }
            }else if(opc == 2){
                System.out.println("---Produzindo...---");
                pro[0].produzir(caçada.macacos);
                //macacos acabam depois da produção
                caçada.macacos = 0;
                System.out.println(pro[0].apresentarQuantia());
            }else if(opc == 3){
                System.out.println("---Produzindo...---");
                pro[1].produzir(caçada.macacos);
                //macacos acabam depois da produção
                caçada.macacos = 0;
                System.out.println(pro[1].apresentarQuantia());

            }else if(opc==4){
                System.out.println("---Fazendo Pedido: 0-Oleo. 1-Tapete.---");
                int indicePedido = sc.nextInt();
                sc.nextLine();
                System.out.println("---Cliente faz a compra---");
                System.out.println(loja.pedido(cli, pro[indicePedido]));

            }else if(opc == 5){
                System.out.println(pro[0].apresentarQuantia());
                System.out.println(pro[1].apresentarQuantia());
                System.out.println(loja.showSaldo());      
            }
            
        }
        sc.close();
    }
}
