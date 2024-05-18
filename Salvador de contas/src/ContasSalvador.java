import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ContasSalvador {

    public static void main(String[] args) throws IOException {
        FileWriter arq = new FileWriter("C:\\contas.txt");
        PrintWriter gravarArq = new PrintWriter(arq);

        Scanner teclado = new Scanner(System.in);

        System.out.println("Quantas contas você quer salvar? ");
        int salvar = teclado.nextInt();
        teclado.nextLine();
        gravarArq.println("Salvador de Contas");
        for (int i = 1; i <= salvar; i++) {
            System.out.println("Salvador de Contas");
            perguntas(gravarArq, teclado);
        }

        gravarArq.close();
        teclado.close();
    }

    static void perguntas(PrintWriter gravarArq, Scanner teclado) {
        System.out.println("--------------------------");

        System.out.print("Digite o seu nome: ");
        String nome = teclado.nextLine();

        System.out.print("Digite o seu email: ");
        String email = teclado.nextLine();

        System.out.print("Coloque sua senha: ");
        String senha = teclado.nextLine();

        System.out.print("Coloque a sua idade: ");
        String idade = teclado.nextLine();

        System.out.println("--------------------------");
        gravarArq.println("--------------------------");
        gravarArq.println("Nome: " + nome);
        gravarArq.println("Email: " + email);
        gravarArq.println("Senha: " + senha);
        gravarArq.println("Idade: " + idade);
        gravarArq.println("--------------------------");
    }
}
