package encapsulamento;

public class Conta {

    int numero;
    // para consegui ver, tem que usar getter and setter
    private float saldo;
    private float limite;
    Cliente cliente;


    public Conta(int numero, float saldo, float limite, Cliente cliente){
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
        this.cliente = cliente;
    }

    void sacar (float valor){

        if( this.saldo - valor >=0){
            
            System.out.println("Saldo anterior João => " + this.saldo);
            System.out.println("Sacar => " + valor);
            this.saldo = this.saldo - valor;
            System.out.println("Saldo final João => " + this.saldo);
            System.out.println("limite atual => " + this.limite);
        }

        else if (this.limite + this.saldo - valor >= 0){

            System.out.println("Saldo anterior João => " + this.saldo);
            System.out.println("Sacar => " + valor);
            System.out.println("limite => " + this.limite);

            this.saldo = this.saldo - valor;
            this.limite = this.limite + this.saldo;

            System.out.println("Saldo João novo => " + this.saldo);
            System.out.println("limite novo=> " + this.limite);
        } else{

            System.out.println("Saldo anterior João => " + this.saldo);
            System.out.println("Sacar => " + valor);
            System.out.println("limite => " + this.limite);

            System.out.println("Sem fundos");       
        }


    }


    void depositar (float valor) {
        this.saldo = this.saldo + valor;
    }

    public float getSaldo(){
        return this.saldo;
    }
    
}
