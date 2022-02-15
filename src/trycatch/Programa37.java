package trycatch;

import java.util.Scanner;

public class Programa37 {

    public static void main(String[] args){

        Scanner tecado = new Scanner(System.in);

        System.out.println("Informe Dividendo da divisão:");
        int num1 = tecado.nextInt();

        System.out.println("Infome Divisor da divisão:");
        int num2 = tecado.nextInt();

        try{

            System.out.println("o resutado dessa divisão é: " + num1/num2);
        }
        catch(ArithmeticException e){
            System.out.println("Não é possivel dividir um número por " + num2 + "!");
        }

        tecado.close();
    }
    
}
