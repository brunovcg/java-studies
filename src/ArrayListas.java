import java.util.ArrayList;


public class ArrayListas {


  public static void main(String[] args) {

    ArrayList lista = new ArrayList();


    //add

    lista.add("olá");
    lista.add("bruno");
    lista.add("JS");
    lista.add("Python");
    lista.add("Django");

    //get

  System.out.println(lista.get(0));

    //remove

    lista.remove(0);


    System.out.println(lista.get(0));


    //set

    lista.set(0, "rodox");

    System.out.println(lista.get(0));

    System.out.println(lista.size());

    System.out.println(lista.indexOf("rodox"));
    // se não achar ele volta -1

    //tambem tem o lastIndexOf

    
    System.out.println(lista.subList(0, 3));
    //vai do 0 ate antes do 2,
   
    
  }

  
  
}
