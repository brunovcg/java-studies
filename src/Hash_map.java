import java.util.HashMap;

public class Hash_map {

  public static void main(String[] args) {

    HashMap dados = new HashMap();


    dados.put("RM12345", "André");
    dados.put("RM12325", "Bruno");


   // ! tem o .replace tb, pode usar o .put mas se não tiver o pull cria e o replace volta null



   System.out.println(dados);

        System.out.println(dados.values());

        System.out.println(dados.keySet());

  }
  
}
