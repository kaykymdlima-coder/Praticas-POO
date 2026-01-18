public class Loja{
    public double saldo;
    public String pedido(Cliente cli, Produto pedido){
        String txt = "O Cliente "+cli.getNome()+" pediu o "+pedido.nome+", por: "+pedido.vender();
        saldo += pedido.vender();
        pedido.quantia = 0;
        //vender fica por ultimo pq ele zera quantia, se ele fosse antes iria atrapalhar os valores
        pedido.vender();
        return txt;
    }

    public String showSaldo(){
        return "O saldo da loja é: "+saldo; 
    }
}