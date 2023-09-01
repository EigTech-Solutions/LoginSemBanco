import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Validacao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        List<String> usuarios = new ArrayList<>();
        usuarios.add("Pedro Prado");

        List<String> senhas = new ArrayList<>();
        senhas.add("123");

        System.out.println("""
                ------------------------------
                |          EigTech           |
                ------------------------------
                | Digite o usuário:          |
                """);
        String user = leitor.nextLine();

        System.out.println("""
                ------------------------------
                | Digite a senha:            |
                """);
        String senha = leitor.nextLine();

        for (int i = 0; i < usuarios.size(); i++) {

            if(user.equals(usuarios.get(i)) && senha.equals(senhas.get(i))){
                System.out.println("""
                    ------------------------------
                    |        Bem Vindo           |
                    ------------------------------
                    """);
            } else {
                System.out.println("""
                    ------------------------------
                    |Usuário ou senha incorretos |
                    ------------------------------
                    """);
            }
        }
    }
}
