import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.*;

public class SegundaQuestao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int[] numbers   = {a,b,c};
        
        Arrays.sort(numbers);


        for(int i = numbers.length-1;i>=0;i--){
            System.out.println(numbers[i]);
        }
    }
}
