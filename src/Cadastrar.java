
import java.util.Scanner;

public class Cadastrar extends Produto {

    public Cadastrar()
    {
        super("", 00, 0);


    }

    public void solicitacaoCadastro()
    {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o nome do produto que voce deseja cadastrar: ");
        setName(scanner.nextLine());

        System.out.print("Digite o valor do produto R$");
        setPreco(scanner.nextDouble());

        System.out.print("Digite a quantidade de produtos: ");
        setQuantia(scanner.nextInt());

    }

    
    
}
