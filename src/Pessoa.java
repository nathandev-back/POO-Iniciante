
import java.util.Scanner;

public class Pessoa {

    public static void InformacoesPessoais()
    {
        String nome;
        int idade;

        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite seu nome");
        nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        idade = scanner.nextInt();

        System.out.print("Perfeito, Seja bem vindo %s, voce tem %d anos");
        System.out.print("Me tire uma duvida, voce esta fazendo aniversario hoje? ");
        

        boolean opcaoValida = true;

        String aniversarioUsuario = scanner.nextLine();
        String minuscula = aniversarioUsuario.toLowerCase();

        if (aniversarioUsuario == "sim")
        {
            
        }



        
        


    }
}