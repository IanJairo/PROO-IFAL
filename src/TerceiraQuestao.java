import java.util.Scanner;

public class TerceiraQuestao {

    public static Boolean ehBissexto(int ano) {
        if (ano % 4 == 0) {
            if (ano % 100 == 0) {
                if (ano % 400 == 0) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ano = sc.nextInt();

        Boolean typeYear = ehBissexto(ano);

        System.out.println((typeYear) ? "O ano É bissexto" : "O ano NÃO é bissexto");


    }
}
