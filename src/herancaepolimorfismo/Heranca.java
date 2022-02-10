package herancaepolimorfismo;

public class Heranca {

    public static void main(String[] args){


        Pessoa p1 = new Pessoa("Bruno", 1988);
        
        System.out.println(p1.getNome());

        Aluno a1 = new Aluno("Brenda", 1991, "notinhas");

        System.out.println(a1.getNome());


        Professor prof1 = new Professor("Jao", 1980, "12345"); 

        System.out.println(prof1.getNome());

        System.out.println(a1);


        // chamando os Overloading

        p1.mensagem();

        p1.mensagem("Oi Bruno");
    }
    
}
