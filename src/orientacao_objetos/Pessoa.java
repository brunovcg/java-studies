package orientacao_objetos;

public class Pessoa {

    String nome, email;
    int ano_nascimento;


// O JVM cria o abaio automaticamente = construtor, se criar um construtor a JVM não cria mais o default
    public Pessoa(){

    }

    public Pessoa(String nome, String email, int ano_nascimento){
        this.nome = nome;
        this.email = email;
        this.ano_nascimento = ano_nascimento;
    }
    
}
