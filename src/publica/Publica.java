package publica;

import encapsulamento.Cliente;

// se for buscar aldo em outro pacote, tem que passar o import e la colocar o public.

public class Publica {

    public static void main(String[] args){
        Cliente cli = new Cliente("angelina","av bv");
        System.out.println(cli.nome);
    }
    
}
