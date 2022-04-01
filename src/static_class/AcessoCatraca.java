package static_class;

public class AcessoCatraca {

  private static int totalAcesso;

  private String nome;

  public void entrar(String nome){
    this.nome = nome;
    totalAcesso = totalAcesso + 1;
  }

  public static int recuperarTotal(){
    return totalAcesso;
  }
  
}
