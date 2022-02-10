package atributosestaticos;

/*
Atributos estaticos onde os valores são compartilhados entre as classes
*/

public class programa34 {

    public static void main(String[] args){

        Conta c1 = new Conta( "Angelina Jolie");
        System.out.println(c1.getNumero());
        System.out.println(c1.getCliente());

        Conta c2 = new Conta("Felicity");
        System.out.println(c2.getNumero());
        System.out.println(c2.getCliente());

        System.out.println("----x-----");

        System.out.println(c1.contador);
        System.out.println(c2.contador);
        System.out.println(Conta.contador);

    }    
}
