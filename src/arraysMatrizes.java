public class arraysMatrizes {

    public static void main(String[] args){

        //declaração
        int matriz0[][];

        // declaração e definição
        int matriz1[][] = new int[3][3];

        //declarar, definir e inicializar
        int matriz2[][] = {{1,2,3}, {4,5,6}, {7,8,9}};


        // declarar uma matriz somente as linhas

        int matriz4[][] = new int[2][];
        matriz4[0] = new int[5];
        matriz4[1]= new int[4];


        int nova_matriz[][] = new int[3][3];
        nova_matriz[0][0] =1;
        nova_matriz[0][1] =3;
        nova_matriz[0][2] =5;
        nova_matriz[1][0] =7;
        nova_matriz[1][1] =9;
        nova_matriz[1][2] =11;
        nova_matriz[2][0] =13;
        nova_matriz[2][1] =15;
        nova_matriz[2][2] =17;

        for (int i = 0; i < nova_matriz.length; i++ ){
            for (int j = 0; j < nova_matriz[i].length; j++ ){
                System.out.println(nova_matriz[i][j]);            
            }
        }
    }    
}
