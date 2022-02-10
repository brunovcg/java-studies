package templatemethod;

public class TreinamentoInicio extends Treinamento{

    @Override
    public void preparoFisico() {
        System.out.println("Preparo fisico inicial");
        
    }

    @Override
    public void jogoTreino() {
        System.out.println("Jogo Treino inicial");
        
    }
    
}
