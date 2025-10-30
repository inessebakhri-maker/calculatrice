import java.util.Scanner;

public class calculatrice2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        while (run) {

            System.out.println("Choisi une option entre 1 et 4, 5 est le STOP");
            int calculatrice = sc.nextInt();
            if (calculatrice == 5) {
                run = false;
                continue;
            }
            System.out.println("Choisi un premier numero");
            int x = sc.nextInt();

            System.out.println("Choisi un second numero");
            int y = sc.nextInt();


            int result ;

            switch (calculatrice) {

                case 1:
                    result = x + y;
                    System.out.println("C'est égal à : " + result );
                    break;

                case 2:
                    result = x - y;
                    System.out.println("C'est égal à : " + result );
                    break;

                case 3:
                    result = x * y;
                    System.out.println("C'est égal à : " + result );
                    break;

                case 4:
                    result = x / y;
                    System.out.println("C'est égal à : " + result );
                    break;

                case 5:
                    run = false;
                    break;
                default:
                    System.out.println("Essaye encore ! ");
                    break;

            }
        }



        }






    }
