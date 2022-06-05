import java.util.Scanner;public class Ex3 {
    public static void main(String[] args) {
        System.out.println ("Informe seu nome ");
        Scanner in = new Scanner (System.in);

        String nome = in.nextLine();

        System.out.println("Agora, informe sua idade ");
        Scanner on = new Scanner(System.in);

        String idade = on.nextLine();

        System.out.println("Olá " + nome + ", sua idade é " + idade + "anos!");

    }
}
