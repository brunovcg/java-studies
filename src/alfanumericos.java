public class alfanumericos {

    public static void main(String[] args){

  
        char letra1 = 'a';
        // char letra1 = "a";    tudo que é colocado entre aspas duplas, o JAVA julhga como string, por isso não funciona.


        char letra2 = 97; //97 em decimal == 'a'

        
        
        String nome = "Bruno Gouveia"; // não existe o tipo primitivo String

        // para comparar 2 strings, usar o .equals, pois ele pode comparar o endereco da memoria

        // JAVA tem equalsIgnoreCase
        

        letra2 = (char) (letra2 + 1); // cast

        System.out.println("Letra1 " + letra1);
        System.out.println("Letra2 " + letra2);
        System.out.println("Nome  " + nome);

        Character letra3 = 'A';

        System.out.println("Letra3 " + letra3);

        System.out.println("char/Character  SUPORTA entre       " + Character.MIN_VALUE + "  e  " + Character.MAX_VALUE); // 0 e 65535 seria isso


        System.out.println("String " + (Character.SIZE * nome.length()) + " bits");




    }
    
}
