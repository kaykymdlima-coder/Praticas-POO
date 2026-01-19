public class Cliente {
    private String nome;
    private String cpf;
    //não precisa do get e set pra usar o construtor
    public Cliente(String nome, String cpf){
        this.nome = nome; this.cpf = cpf;
    }
    //coloquei set e get pra evitar birra do enyo
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public String getNome(){
        return nome;
    }
    public String getCpg(){
        return cpf;
    }
}