import java.util.Scanner;

public class PrimeiraQuestao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] diasSemana = {
                "Domingo",
                "Segunda",
                "Terça",
                "Quarta",
                "Quinta",
                "Sexta",
                "Sábado"
        };
        int escolhaUsuario = sc.nextInt();

        if (escolhaUsuario < 1 || escolhaUsuario > 7) {
            System.out.println("Dia inválido. Tente novamente");
        } else {
            String diaUsuario = diasSemana[escolhaUsuario - 1];
            System.out.println("o usuário escolheu o dia: " + diaUsuario);
        }
    }
}
