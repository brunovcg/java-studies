package orientacaoobjetos;
// nas classes java não se implementa a funcao main
// classe mesmo nome do arquivo

public class Classes {

        public static void main(String[] args){

            //declarando objeto
            Produto p0;

            //declarando e instanciando/inicializando do objeto
            //p1 = instancia do objeto / objeto
            Produto p1 = new Produto();

            p1.nome = "macbook";
            p1.preco = 3000f;
            p1.desconto = 15.0f;


            System.out.println("Produto "+p1.nome + " / Preço " + p1.preco);



            Pessoa pessoa1 = new Pessoa(); // construtor

            pessoa1.nome = "Bruno";
            pessoa1.email = "eu@gmail.com";
            pessoa1.ano_nascimento = 1988;

            System.out.println(pessoa1.nome);
        }
  
    
}
