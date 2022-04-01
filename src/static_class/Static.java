package static_class;

public class Static {

  public static void main(String[] args){

    // ? A classe armazena os atributos ou metodos da classe que estejam static, fica vinculado a classe como um todo não ao objeto.

    AcessoCatraca c1 =  new AcessoCatraca();
    AcessoCatraca c2 =  new AcessoCatraca();

    c1.entrar("André");

    c2.entrar("Luke");

    int entradas = AcessoCatraca.recuperarTotal();

    System.out.println(entradas);
  }
  
}
