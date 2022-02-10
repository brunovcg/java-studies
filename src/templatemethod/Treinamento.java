package templatemethod;

public abstract class Treinamento {

    //TEMPLATE METHOD
    // final modificar de acesso que faz com o que o elemento que esteja utilizando não possa ser extendido/ reescrito

    final void treinoDiario() {
        preparoFisico();
        jogoTreino();
        treinoTatico();
    }

    public abstract void preparoFisico();

    public abstract void jogoTreino();

    public final void treinoTatico() {
        System.out.println("Treino tatico...");

    };


    
}
