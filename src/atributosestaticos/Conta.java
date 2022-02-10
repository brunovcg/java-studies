package atributosestaticos;

public class Conta {

    private int numero;
    private String cliente;

    public static int contador = 1;

    public Conta(String cliente){
        this.numero = contador;
        this.cliente = cliente;
        Conta.contador = Conta.contador + 1;
        // this.contador = this.contador ++; 
        
        // ele recomenda usar estatico
    }

    public int getNumero(){
        return this.numero;
    }

    public String getCliente(){
        return this.cliente;
    }
    
}
