public class tiposDadosNumeReais {
    

    public static void main(String[] args) {

        // tipos primarios ou primitivos
            long num0 = 99999; // muito grande
            int num1 = 4345345; // inteiro para numeros maiores
            short num2 = 4; //inteiro (numeros menores, poupa memória  - Pouco utilizado
            byte numX = 4;  // inteiro ainda menor



        //tipos não primários

            Long num00 = (long) 99999; // muito grande // CAST
            Integer num3 = 98; // inteiro classe numeros maiores
            Short num4 = 2; // inteiro classe (numeros menores, poupa memória  - Pouco utilizado
            Byte numX2 = 5;  // classe inteiro ainda menor


        // tipos reais primarios

            //por padrão os numeros reais em JAVA são considerados doubles

            float preco = 23.4f;  // ocupa menos espaço memória
            double preco2 = 23.4; // ocupa mais espaço memória

        
        // tipos reais não primários


            Float preco3 = 44.5f; // Classe ocupa menos espaço memória
            Double preco4 = 44.5; // Classe ocupa mais espaço memória


            System.out.println("long => " + num0);
            System.out.println("int => " + num1);
            System.out.println("short => " + num2);
            System.out.println("byte => " + numX);
            System.out.println("Byte => " + numX2);
            System.out.println("Integer => " + num3);
            System.out.println("Long => " + num00);
            System.out.println("Short => " + num4);
            System.out.println("float => " + preco);
            System.out.println("double => " + preco2);
            System.out.println("Float => " + preco3);
            System.out.println("Double => " + preco4);


            System.out.println("-----------x--------------");


            System.out.println("long/Long => " + Long.SIZE + " bits");
            System.out.println("int/Integer => " + Integer.SIZE + " bits");
            System.out.println("short/Short => " + Short.SIZE + " bits");
            System.out.println("byte/Byte => " + Byte.SIZE + " bits");

            System.out.println("-----------x--------------");

            
            System.out.println("long/Long  SUPORTA entre      " + Long.MIN_VALUE + "  e  " + Long.MAX_VALUE);
            System.out.println("int/Integer SUPORTA entre      " + Integer.MIN_VALUE + "  e  " + Integer.MAX_VALUE);
            System.out.println("short/Short SUPORTA entre     " + Short.MIN_VALUE + "  e  " + Short.MAX_VALUE);
            System.out.println("byte/Byte  SUPORTA entre       " + Byte.MIN_VALUE + "  e  " + Byte.MAX_VALUE);


    }

}
