package publica;

import encapsulamento.Cliente;

// se for buscar aldo em outro pacote, tem que passar o import e la colocar o public.
// o default é protected, ou seja só é visivel no pacote onde ele foi declarado. 
// public deixa exportar para outros pacotes  
// private não deixa de maneira alguma


public class Publica {

    public static void main(String[] args){
        Cliente cli = new Cliente("angelina","av bv");
        System.out.println(cli.nome);
    }
    
}
