import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class Exec {
    //Manipulação de Arquivos: metodo dentro de exec e fora da main
    public static void registraCoisos(String Pedido, int showmacacos, String showsaldo, int identificador) {
        try (FileWriter fileWriter = new FileWriter("historico.txt", true);
    //esse append:true indica q é pra add ao txt e nao sobrescrever quando da run
        PrintWriter pw = new PrintWriter(fileWriter)) {
        //esse printwriter q escreve na file
        pw.println("---Atualização: "+identificador+" ---");
        pw.println("Detalhes: " + Pedido);
        pw.println("Macacos em estoque: "+showmacacos+", "+showsaldo);
        
    } catch (IOException erro) {
        System.out.println("Deu uma merda ai" + erro.getMessage());
    }
}
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        Produto pro[] = new Produto[2];
        pro[0] = new Oleo(25, "Oleo", 0 );
        pro[1] = new Tapete(35, "Tapete de Macaco", 0);
        Loja loja = new Loja(30);
        Cliente cli = new Cliente("Kayky", "40028922");
         //aponto pro ojeto caçada para pode atribuir macacos pros produtos
        Cacar caçada = new Cacar();
        int identificador = 0;
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
                System.out.println("---Fazendo Pedido---");
                System.out.println("0-Oleo. 1-Tapete");
                int indice = sc.nextInt();
                sc.nextLine();

                String resultado = loja.pedido(cli, pro[indice]); 
                System.out.println(resultado);
                //huarda em resultado pra fazer o registro
                identificador++;
                //identifica o loop
                registraCoisos(resultado, caçada.showMacacos(), loja.showSaldo(), identificador);
                
            }else if(opc == 5){
                System.out.println(pro[0].apresentarQuantia());
                System.out.println(pro[1].apresentarQuantia());
                System.out.println(loja.showSaldo());      
            }
            
        }
        sc.close();
    }
}
