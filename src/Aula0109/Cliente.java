package Aula0109;

public class Cliente {

    private String nome;
    private String email;

    //construtor
    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    //getters
    public String getNome(){
        return nome;
    }
    public String getEmail(){
        return email;
    }

}
