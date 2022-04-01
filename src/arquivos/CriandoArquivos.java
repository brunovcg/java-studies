package arquivos;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CriandoArquivos {

  public static void main(String[] args){


    try{

      FileWriter stream = new FileWriter("teste.txt");

      PrintWriter escritor = new PrintWriter(stream);

      escritor.println("oi, eai gravou?");
      escritor.println("teste");

      escritor.close();
      stream.close();
    } catch (IOException e){
      System.out.println("Ocorreu um erro na criação do arquivo");
    }


  }
  
}
