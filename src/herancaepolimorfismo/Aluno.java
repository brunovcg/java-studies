package herancaepolimorfismo;

public class Aluno extends Pessoa{

    // especifica, filha/o, subclasse

    private String ra;

    public Aluno (String nome, int ano_nascimento, String ra){
        super(nome, ano_nascimento);
        this.ra = ra;

    }

    public String getRa(){
        return this.ra;
    }

    public void setRa(String ra){
        this.ra = ra;
    }

    // polimorfismo, pegando o to String da classe pai e alterando, por exemplo usando esse metodo
    // Overloading ou sobrecarga de metodo, ocorre quando sobreescrevemos um metodo na mesma classe de declaração
    public String toString() {
        return super.toString() + " - " + this.ra;
    }

    
    
}
