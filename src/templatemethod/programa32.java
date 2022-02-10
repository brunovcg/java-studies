package templatemethod;

/* 
o padrão template Method define o esqueleto de um algoritmo dentro de um método, transferindo alguns de seus passos para as subclasses.
O tenplate Method permite que subclasses redefinam certos passos de um algoritimo sem alterar a estrutura do próprio algoritmo.
*/

public class programa32 {

    public static void main(String[] args){

        TreinamentoInicio tit = new TreinamentoInicio();

        tit.treinoDiario();

        System.out.println("/");

        TreinamentoFim tft = new TreinamentoFim();

        tft.treinoDiario();

    }
    
}
