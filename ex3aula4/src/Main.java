//ex3aula4 Italo Trindade

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("======== menu ========");
        System.out.println("em qual período estuda?");
        System.out.println("-----------------------");
        System.out.println("M");
        System.out.println("V");
        System.out.println("N");
        System.out.println("========================");

        Scanner e=new Scanner(System.in);

        char periodo_estudo = Character.toUpperCase(e.next().charAt(0));

        switch (periodo_estudo){
            case 'M':
                System.out.println("Você estuda no período Matutino ");
            break;

            case 'V':
                System.out.println("Você estuda no período Vespertino ");
            break;

            case 'N' :
                System.out.println("Você estuda no perído noturno ");

            default:
                System.out.println("erro! ");

        }e.close();
    }
}