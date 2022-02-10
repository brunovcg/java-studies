package templatemethod;

public class TreinamentoFim extends Treinamento{

    @Override
    public void preparoFisico() {
        System.out.println("Preparo fisico final");
        
    }

    @Override
    public void jogoTreino() {
        System.out.println("Jogo Treino final");
        
    }
    
}
