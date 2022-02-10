package interfaces;

public class Ventilador implements IEletronico {


    private boolean ligado = false;

    @Override
    public void ligar() {
        if (!this.ligado){
            this.ligado = true;
        }
        
    }

    @Override
    public void desligar() {
        if (this.ligado){
            this.ligado = false;
        }
        
    }


    public void toggle() {
        this.ligado = !this.ligado;
    }

    public void getLigado(){
        System.out.println("Aparelho ligado? :" + this.ligado);
    }

    
}
