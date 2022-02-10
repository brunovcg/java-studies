import java.util.Scanner;



public class funcoes {
    
// imprimindo em ordem contraria ao informado

static String frutas[];
static Scanner teclado = new Scanner(System.in);


public static void main(String[] args) {

    int qtd;

    System.out.println("Informe a quantidade de frutas");
    qtd = Integer.parseInt(teclado.nextLine());

    cadastrar(qtd);
    mostrar(qtd);
    
    teclado.close();

//-------- outro exemplo ----------------------------------------------------------------

    System.out.println("--- Outro Exemplo!!! ---");

    int valor1 = 2, valor2 =4;

    System.out.println(soma(valor1, valor2));
}

    static void cadastrar(int qtd){
        frutas = new String[qtd];   
        for (int i = 0; i < qtd; i++){   
            System.out.println("informe a " + (i+1) + "a fruta");
            frutas[i] = teclado.nextLine();
        }
        System.out.println("SAIDA ABAIXO"); 
    }


    static void mostrar(int qtd){
        for (int i = qtd-1; i >= 0; i--){
            System.out.println(frutas[i]);
        }
    }


    static int soma(int v1, int v2) {
        return v1 + v2;
    }

}
