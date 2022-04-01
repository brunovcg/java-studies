package classesabstratas;

public class Poupa extends Conta{

  String pobred;

  public Poupa(String cliente, String pobred){

    super(cliente);
    this.pobred = pobred;

  }

  //! consigo verificar saldo por que ele esta protected
  public double verificar(){
    return saldo;
  }
  
}
