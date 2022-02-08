import java.util.Scanner;

public class repeticao {

    public static void main(String[] args){

        // int idade = 4;

        // String nome;

        //     // para receber dados do teclado

        //     Scanner teclado = new Scanner(System.in);

        //     System.out.println("Informe seu nome: ");
        //     nome = teclado.nextLine();

        //     System.out.println("Informe sua idade: ");
        //     idade = teclado.nextInt();


        //     System.out.println(nome + " tem " + idade + " anos");

        //     teclado.close();

// ------------------------------------------------------------------------------------------------
// 1. USANDO O WHILE
     

        int idade2 = 0;

            while (idade2 < 10) {

                System.out.println("idade é: " + idade2);

                idade2 = idade2 + 1;

            }


//----------------------------------------------------------------------------------------------------------------------------------------------------------------
// 2. USANDO O WHILE COM ENTRADA DO TECLADO

        int idade3 = 0;

            
        Scanner teclado2 = new Scanner(System.in);
            
            while (idade3 < 10) {

                System.out.println("Informe idade: ");

                idade3 = Integer.parseInt(teclado2.nextLine());

                if (idade3 > 10) {
                    System.out.println("Acabou");
                }                        
            }
        
        teclado2.close();
                  
 

// --------------------------------------------------------------------------------------------------------------------
// 3. USANDO O DO WHILE
    int number = 0;

    do {              
        System.out.println("Print " + number);

        number = number + 1;


    } while ( number < 10 );


// -----------------------------------------------------------------------------------------------------------------------
// 3. USANDO FOR


    int idadeFor = 0;


    for (int i = 0; i < 5 ; i++){

        idadeFor = idadeFor+1;

        System.out.println("idade FOR = " + idadeFor);


    }


    }
    
}

