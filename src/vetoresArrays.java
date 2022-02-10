public class vetoresArrays {
    
    public static void main (String[] args){

        // declarando um array
        int vetor[];

        // declatando e especificando o tamanho do array       
        int numeros[] = new int[5];

        // declarando, especificando e inicializando o array

        int array3[] = {1,2,3,5,6};

        float array4[] = new float[5];

        String nomes[] = new String[3];

        char chares[] = new char[4];

        String nomes2[] = {"bruno", "gouveia"};



        // declarando automatique


        int auto[] = new int[10];

        
        for (int i = 0; i < auto.length ; i++){
            auto[i] = i+ 3;       
        }

        System.out.println("--------------x------------------");

        // vetores ou array possuem tamanho fixo não podem ser aumentados nem diminuidos
        // os vetores ou arrays possuem tipos fixos, e não aceitam tipos variados

        System.out.println(auto[0]);
        System.out.println(auto[9]);
        
        int terra[] = new int[10];

        for (int i = 0; i < terra.length ; i++){
            terra[i] = (int)Math.round(Math.random()*100);

            System.out.println(terra[i]);
        }


    }
}
