package generics;
import java.util.ArrayList;

public class generics {


  public static void main(String[] args) {

    // ArrayList teste = new ArrayList();
    ArrayList<String> teste = new ArrayList<String>();

  // aceita OBJETOS

    teste.add("bruno");
    teste.add("gouveia");

    //! Não Aceita mais esse camarada
    // teste.add(33);

    System.out.println(teste);

    for (int i = 0; i < teste.size(); i++) {



      //* Não precisa mais
      // String nome = (String) teste.get(i);

      String nome = (String) teste.get(i);

      System.out.println(nome.toUpperCase());
    }


    ArrayList <Carros> meusCarros= new ArrayList<Carros>();

    // meusCarros.add("ola");
    meusCarros.add(new Carros("monza", "1988"));

    System.out.println(meusCarros);


  }
  
}


