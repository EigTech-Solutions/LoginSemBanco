import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Validacao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        List<String> usuarios = new ArrayList<>();
        usuarios.add("pedro.araujo@eigtech.com");
        usuarios.add("inacio.figueiredo@eigtech.com");
        usuarios.add("enzo.stane@eigtech.com");
        usuarios.add("kauanny.felix@eigtech.com");
        usuarios.add("caua.ribeiro@eigtech.com");
        usuarios.add("joao.noleto@eigtech.com");

        List<String> senhas = new ArrayList<>();
        senhas.add("1301");
        senhas.add("0508");
        senhas.add("2206");
        senhas.add("2411");
        senhas.add("2301");
        senhas.add("1303");

        Boolean logar = false;

        LocalDate data = LocalDate.now();
        LocalTime hora = LocalTime.now();

        DateTimeFormatter dataFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter horarioFormatado = DateTimeFormatter.ofPattern("HH:mm");


        System.out.println("""
                ------------------------------
                |          EigTech           |
                ------------------------------
                | Digite seu email:          |
                """);
        String user = leitor.nextLine().toLowerCase();

        System.out.println("""
                ------------------------------
                | Digite a senha:            |
                """);
        String senha = leitor.nextLine();

        for (int i = 0; i < usuarios.size(); i++) {
            if(user.equals(usuarios.get(i)) && senha.equals(senhas.get(i))){
                logar = true;
            }
        }

        if(logar){
            System.out.printf("""
                    ------------------------------
                    |         Bem Vindo          |
                    |      Você está logando     |
                    |       no nosso sistema     |
                    | ás %s do dia %s | 
                    ------------------------------
                    """,horarioFormatado.format(hora) , dataFormatada.format(data));
        } else {
            System.out.println("""
                    ------------------------------
                    |Email ou senha incorretos |
                    ------------------------------
                    """);
        }
    }
}
