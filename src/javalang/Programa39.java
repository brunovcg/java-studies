package javalang;

import encapsulamento.Conta;
import encapsulamento.Cliente;

// Classe Object: mãe de todas as classes

/*
A classe Object faz parte do pacote java.lang
*/

public class Programa39 {
    public static void main (String[] args){

        Cliente cliente1 = new Cliente("Angelina", "Rua Japecanga");
        Cliente cliente2 = new Cliente("Felicity", "Rua Maracapane");

        Conta c1 = new Conta(1,1000,2000, cliente1);
        Conta c2 = new Conta(1,100,200, cliente2);

        Caixa prateleira = new Caixa();

        prateleira.adicionar(c1);
        prateleira.adicionar(c2);
        // Conta conta = prateleira.pegar(0);
        System.out.println(prateleira.pegar(0).getSaldo());
    }
    
}
