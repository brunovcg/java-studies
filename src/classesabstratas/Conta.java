package classesabstratas;

public abstract class Conta {
  

  protected double saldo;
  protected String cliente;

  Conta(String cliente){
    this.cliente = cliente;
  }


  double getSaldo(){
    return saldo;
  }

  void setSaldo(double saldo){
    this.saldo = saldo;
  }


  // ! metado abstrato

  public abstract double  verificar();


}
