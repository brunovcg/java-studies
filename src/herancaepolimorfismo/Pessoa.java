package herancaepolimorfismo;

 // mãe, pai, superclasse, generica, base


 // se for abastrata não instancia
// public abstract class Pessoa {

    public  class Pessoa {

    private String nome;
    private int ano_nascimento;

    public Pessoa(String nome, int ano) {
        this.nome = nome;
        this.ano_nascimento = ano;
    }


    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getAno(){
        return this.ano_nascimento;
    }

    public void setAno(int ano){
        this.ano_nascimento = ano;
    }

    public String toString() {
        return this.getNome()+ " - " + this.getAno();
    }


    // exemplo de overloading
    public void mensagem(){
        System.out.println("Óla");
    }
    public void mensagem(String msg){
        System.out.println(msg);
    }


    // declaração metodo abstrato, so pode se a classe for abastract, vai ter que declarar em todos os filhos

    // public abstract void outra_mensagem(String text);


}
