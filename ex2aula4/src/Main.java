//ex2aula4 Italo Trindade

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("=========== Menu ==========");
        System.out.println("Escolha o numero raferente a seu mês ");
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");
        System.out.println("6");
        System.out.println("7");
        System.out.println("8");
        System.out.println("9");
        System.out.println("10");
        System.out.println("11");
        System.out.println("12");
        System.out.println("=====================================");

        Scanner e=new Scanner(System.in);

        int escolhaMes = e.nextInt();

        switch (escolhaMes){
            case 1:
                System.out.println("O mês escolhido foi Janeiro ");
            break;

            case 2:
                System.out.println("O mês escolhido foi Fevereiro ");
                break;

            case 3:
                System.out.println("O mês escolhido foi Março ");
                break;

            case 4:
                System.out.println("O mês escolhido foi Abril ");
                break;

            case 5:
                System.out.println("O mês escolhido foi Maio ");
                break;

            case 6:
                System.out.println("O mês escolhido foi Junho ");
                break;

            case 7:
                System.out.println("O mês escolhido foi Julho");
                break;

            case 8:
                System.out.println("O mês escolhido foi Agosto ");
                break;

            case 9:
                System.out.println("O mês escolhido foi Setembro ");
                break;

            case 10:
                System.out.println("O mês escolhido foi Outubro ");
                break;

            case 11:
                System.out.println("O mês escolhido foi Novembro ");
                break;

            case 12:
                System.out.println("O mês escolhido foi Dezembro ");
                break;

            default:
                System.out.println("erro");
                break;

        }e.close();
    }
}