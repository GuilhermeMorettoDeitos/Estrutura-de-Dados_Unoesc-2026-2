package Aula2707;

public class Cliente {

    private int id;
    private String nome;
    private String email;
    private String endereco;
    private String telefone;

    public Cliente(int id, String nome, String email, String endereco, String telefone){
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String toString(){
        return "Cliente: " + nome + " - " + email + " - " + endereco + " - " + endereco;
    }

}
