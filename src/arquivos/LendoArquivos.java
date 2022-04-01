package arquivos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LendoArquivos {

  public static void main(String[] args){

    try{
      FileReader stream = new FileReader("teste.txt");

      BufferedReader leitor = new BufferedReader(stream);

      String linha;
      
      linha = leitor.readLine();

      while(linha!= null){
        System.out.println(linha);
        linha = leitor.readLine();
      }

      leitor.close();
      stream.close();      

    } catch(FileNotFoundException e){


      System.out.println("Arquivo não localizado");
    } catch(IOException e){
      System.out.println("Erro ao ler");

    }

  }
  
}
