package interfaces;


/*
 interfaces são conhecidas como contratos.
 */



public class Programa33 {


    public static void main(String[] args){
        

        Ventilador ventinho = new Ventilador();

        
        ventinho.getLigado();
        
        ventinho.ligar();

        ventinho.getLigado();


        System.out.println(ventinho.MARCA);

    }
    
}
