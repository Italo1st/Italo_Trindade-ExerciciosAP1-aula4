//ex1aula4 Italo Trindade

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        System.out.println("======= Menu de opções ======");
        System.out.println("1-Domingo ");
        System.out.println("2-Segunda ");
        System.out.println("3-Terça ");
        System.out.println("4-Quarta ");
        System.out.println("5-Quinta ");
        System.out.println("6-Sexta ");
        System.out.println("7-Sábado ");
        System.out.println("=============================");

        Scanner e=new Scanner(System.in);

        int menu_dias = e.nextInt();

        switch(menu_dias){
            case 1:
                System.out.println("O dia escolhido foi Domingo ");
                break;
            case 2:
                System.out.println("O dia escolhido foi Segunda ");
                break;
            case 3:
                System.out.println("O dia escolhido foi Terça ");
                break;
            case 4:
                System.out.println("O dia escolhido foi Quarta ");
                break;
            case 5:
                System.out.println("O dia escolhido foi Quinta ");
                break;
            case 6:
                System.out.println("O dia escolhido foi Sexta ");
                break;
            default:
                System.out.println("O dia escolhido foi Sábado ");
                break;
        }
        e.close();
    }
}