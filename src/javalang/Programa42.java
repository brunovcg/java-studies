package javalang;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

// Escrita e leitura de arquivos
public class Programa42 {

    public static void main(String[] args){
        Scanner teclado =  new Scanner(System.in);

        try {
            PrintStream escrever = new PrintStream("saida.txt");
            System.out.println("Escreva...");
            String msg = teclado.nextLine();
            escrever.println(msg);
            escrever.close();
        }

        catch (FileNotFoundException e){
            System.out.println("Nao foi possivel encontrar o arquivo");
        }   

        teclado.close();
    }
    
}
