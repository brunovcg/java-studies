package orientacaoobjetos;

public class Construtor {

    // por default a JVM, cria um construtor padrão (construtor vazio)
    // pode ter mais de um construtor por classe

    public static void main(String[] args){
        Pessoa pessoa1 = new Pessoa(); // Metodo Construtor, sempre tem o mesmo nome da classe

        pessoa1.nome = "Alguem";
        pessoa1.ano_nascimento = 1980;
        pessoa1.email = "felicity@gmail.com";


        Pessoa pessoa2 = new Pessoa("Angelina","Angelina@gmail.com", 1976);

        System.out.println(pessoa2.nome);

    }
    
}
