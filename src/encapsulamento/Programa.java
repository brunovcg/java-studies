package encapsulamento;

public class Programa {

    public static void main(String[] args){
        Cliente joao = new Cliente("João","Av BV");
        Cliente maria = new Cliente("Maria", "Av Beira Rio");

        Conta conta_joao = new Conta(1, 100.0f, 200.0f, joao );
        Conta conta_maria = new Conta(1, 200.0f, 400.0f, maria );

        // System.out.println("Saldo João => " + conta_joao.getSaldo());
        // System.out.println("Saldo Maria => " + conta_maria.getSaldo());


        System.out.println("-----x-------");

        conta_joao.sacar(280);

        // conta_joao.saldo; não é mais visto por que é privado

    }
    
}
