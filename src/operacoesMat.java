public class operacoesMat {
    
    public static void main(String[] args) {

        int num1 = 5, num2 = 3, res;

        float num3 = 4, num4 =6, res2;


        res = num1 + num2;
        System.out.println("Soma = " + res);


        res = num1 - num2;
        System.out.println("Sub = " + res);

        res = num1 * num2;
        System.out.println("Mult = " + res);



        // vai trazer so os inteiros por que as variveis são inteiros
        res = num1 / num2;
        System.out.println("Div = " + res);

        // usando o cast para dizer que as variaveis são float, o res já é float
        res2 = (float) num1 / (float) num2;
        System.out.println("Div (real) = " + res2);

        // usando float
        res2 =  num3 / num4;
        System.out.println("Div (real) outro = " + res2);


        // módulo

        res = num1 % 5;
        System.out.println("Resto = " + res);

    }
}
