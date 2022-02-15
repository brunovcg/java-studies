package trycatch;

public class programa36 {

    public static void main(String[] args){
        int numeros[] = new int[5];


        for (int i =0; i< numeros.length; i++){
            numeros[i] = (i + 3) * 2;
        }

        // bug de proprosito  posição 5 não existe numeros[5]; 
        for (int i =0; i<= numeros.length; i++){
            try{
                    System.out.println(numeros[i]);
            } catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Você está tentando uma posição que não existe!");

                // finally mesmo com catch ou catch
            } finally {
                System.out.println("Continua o processo...");
            }
        }
    }
    
}
