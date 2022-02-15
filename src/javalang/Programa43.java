package javalang;

// ler arquivo
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Programa43 {

    public static void main(String[] args){
        try {
            Scanner ler = new Scanner(new FileInputStream("saida.txt"));

            // para ler mais de uma linha
            while (ler.hasNextLine()){
                String linha = ler.nextLine();
                System.out.println(linha);
            }

            ler.close();
        } catch (FileNotFoundException e) {
          
           System.out.println("arquivo não encontrado");
        }
    }
    
}
