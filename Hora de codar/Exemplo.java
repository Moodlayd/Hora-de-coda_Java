import java.util.Scanner;

public class Exemplo {
    // Class ultiliza na declaração de um a classe

    public static void main (String[] args) {
        System.out.println("HEY!?");
        //exemplo do alert do java script ou então o console.log
        //qual a diferença com Ln e sem Ln
        // essa função exibe uma mensagem

        //Java  se comunica com vários sistemas diferentes sytem de uma saída (out) escrevendo (print) (hey hey)

        //print vem na mesma mesma linha
        //printLN vai pra linha de baixo

        // Não usa aspas simples no Java ex('')

        String nome = "Larissa ";
        //string é texto
        int idade = 21;
        //int número 
      //  var nome = 'Larissa'; Não pode fazer assim com aspas simples

      System.out.println("olá " + nome + " eu sei que você tem " + idade + " anos de idade ");
     

      //pra executar é javac Exemplo.java
    //java Exemplo

   // int umMaisUm = 1 + 1;

   // int tresVezesDois = 3 * 2;

    //int quatroDivididoPorDois = 4 / 2;

  //  System.out.println(umMaisUm);
   // System.out.println(tresVezesDois);
  //  System.out.println(quatroDivididoPorDois);


        System.out.println("Informe a idade do seu cachorro " );

        Scanner in = new Scanner(System.in);
        // system out saida/ in entrada

        int idadeCachorro= in.nextInt();
        idadeCachorro = idadeCachorro * 7; 
        //ex 4 é igual a 4 vezes 7=28

        System.out.println("O seu cachorro tem " + idadeCachorro + "em anos doguísticos");
    }
}