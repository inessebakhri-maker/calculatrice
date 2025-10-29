import java.util.Scanner;

public class Calculatrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choisi une option entre 1 et 4");
        int calculatrice = scanner.nextInt();
        int addition = 1  ;
        int soustraction = 2 ;
        int multiplication = 3 ;
        int division = 4 ;

        System.out.println("Choisi un premier numero");
        int x = scanner.nextInt();
        System.out.println("Choisi un second numero");
        int y = scanner.nextInt();

        if (calculatrice == 1) {
            System.out.println(x + y);
        } else if (calculatrice == 2) {
            System.out.println(x - y);
        } else if (calculatrice == 3) {
             System.out.println(x * y);
         } else if (calculatrice == 4) {
             System.out.println(x / y);
         } else {
            System.out.println("non valid");
        }

        }

    }
