package classesabstratas;

public class CC extends Conta{

  String vip;

  public CC (String cliente, String vip){

    super(cliente);
    this.vip = vip;

  }


  //! consigo verificar saldo por que ele esta protected
  public double verificar(){
    return saldo;
  }

  

  
}
