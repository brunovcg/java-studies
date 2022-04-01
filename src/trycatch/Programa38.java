package trycatch;

import java.util.Scanner;

public class Programa38 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe n1");
        int n1= teclado.nextInt();

        System.out.println("Informe n2");
        int n2= teclado.nextInt();

        try{

            System.out.println(divisao(n1,n2));
        }
        catch(Exception e){
            System.out.println("Não foi possivel Executar a divisão");

            e.printStackTrace(); // fala do erro
            e.getMessage(); // menagdem do erro

        }

        teclado.close();


    }


    // exige tratamento com try catch ao utilizar o throws Exception

    // public static int divisao(int n1, int n2) throws Exception {

      // * ja determinar o erro
      public static int divisao(int n1, int n2) {

        if (n2 == 0) {
          throw new IllegalArgumentException();
        }
            return n1/n2;
    }

    //ou

    public static int divisao2(int n1, int n2) throws Exception {

      if (n2 == 0) {
        throw new Exception("O divisor não pode ser zero!");
      }
          return n1/n2;
  }

  public static int divisao3(int n1, int n2) throws DivisorZeroException {

    if (n2 == 0) {
      throw new DivisorZeroException();
    }
        return n1/n2;
}




  
    
}
