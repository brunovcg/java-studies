package executaveisjar;
// Gerando executaveis JAR - Java Archive

import java.util.Scanner;

import encapsulamento.Cliente;
import encapsulamento.Conta;

public class Principal {

    static Cliente cliente = new Cliente("Angelina", "Av. BV. 92");
    static Conta conta = new Conta(1,200,300, cliente);
    static Scanner teclado = new Scanner(System.in);
    
    // javadoc
    /**
     * Método para realizar deposito
     * @param valor a ser depositado
     */

    public static void depositar(){
        System.out.println("-----------DEPOSITO--------------");
        System.out.println("Informe valor deposito:");
        float valor = teclado.nextFloat();
        conta.depositar(valor);
        System.out.println("-----------------------------");
    }

    public static void sacar(){
        System.out.println("-----------Sacar--------------");
        System.out.println("Informe valor saque:");
        float valor = teclado.nextFloat();
        conta.sacar(valor);
        System.out.println("-----------------------------");
    }

    public static void consultar (){
        System.out.println("-----------CONSULTA----------");
        System.out.println("Saldo: " + conta.getSaldo());
        System.out.println("-----------------------------");
    }

    public static void main(String[] args){

        int opcao = 0;

        System.out.println("Bem vindo ao Banco");

        do {
            System.out.println("Selecione");
            System.out.println("1 - Sacar");
            System.out.println("2 - Depositar");
            System.out.println("3 - Consulta");
            System.out.println("0 - EXIT");

            opcao = teclado.nextInt();

            switch (opcao) {
                case 1: 
                    sacar();
                    break;
                case 2: 
                    depositar();
                    break;
                case 3: 
                    consultar();
                    break;
                case 0: 
                System.out.println("----FINALIZADO----");
                    break;
                default: 
                    System.out.println("opcao invalida");
                    break;
            }

        } while (
            opcao >0
        );
        teclado.close();
    }
    
}
