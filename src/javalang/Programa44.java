package javalang;
// aidiconando mensagens sem apagar o anterior
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Programa44 {

    public static void main(String[] args)
    {
    Scanner teclado =  new Scanner(System.in);

        try {
            PrintStream escrever = new PrintStream(new FileOutputStream("saida.txt", true));
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
