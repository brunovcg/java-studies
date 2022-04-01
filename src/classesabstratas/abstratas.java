package classesabstratas;

import herancaepolimorfismo.Pessoa;

public class abstratas {

    // Classe abstrata é um recurso que proporciona um bloqueio na criação de objetos de objetos


    // pode ter: - atributos, metodos, metodos abstratos.

    /*
    metodos abstratos são metodos que não possuem implementação, possue apenas apenas declaração, 
    obrigatoriamente as classes que herdam desta classe ou metodo, precisam implementar esses metodos
    */
    

    public static void main(String[] args){
        
        Pessoa maria = new Pessoa("Bruno", 1988);

        System.out.println(maria);


        CC ccDeBruno = new CC("bruno", "123");

        Poupa poupaDeBruno = new Poupa("bruno", "123");


        // ! Não pode criar um objeto da classe abstrata

        // Conta contaDeBruno = new Conta("bruno2");

        



    }
    
}
