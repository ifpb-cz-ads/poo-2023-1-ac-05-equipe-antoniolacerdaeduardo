import java.util.Scanner;

public class BMQuestao07 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int x;
        System.out.println("Informe um número inteiro: ");
        x = leitura.nextInt(); 
        int y = x;
        do {
            if (x % 2 == 0) {
                y = x / 2;
            } else {
                y = (3 * x) + 1;
            }
            System.out.print(y);
            if (y > 1) { 
                System.out.print(" -> ");
            }
            x = y;
        }while (x > 1) ;
    }
}
