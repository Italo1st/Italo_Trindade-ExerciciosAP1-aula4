import java.util.Scanner;

//ex4aula4 Italo Trindade
public class Main {
    public static void main(String[] args) {

        System.out.println(" digite seu salário: ");


        Scanner e=new Scanner(System.in);


        double salario =e.nextDouble();
        double aumento, novosalario;


        System.out.println("==============================");
        System.out.println("qual o seu plano de trabalho? ");
        System.out.println("------------------------------");
        System.out.println("Plano[A]");
        System.out.println("Plano[B]");
        System.out.println("Plano[C]");
        System.out.println("==============================");

        char plano_trabalho =Character.toUpperCase(e.next().charAt(0));

        switch (plano_trabalho){
            case 'A':
            aumento=(salario*0.1);
            novosalario=(salario + aumento);
                System.out.printf("Seu novo salário é R$ %.2f%n ", novosalario );
            break;

            case 'B':
                aumento=(salario*0.15);
                novosalario=(salario + aumento);
                System.out.printf("Seu novo salário é R$ %.2f%n ", novosalario );
                break;

            case 'C':
                aumento=(salario*0.2);
                novosalario=(salario + aumento);
                System.out.printf("Seu novo salário é R$ %.2f%n ", novosalario );
                break;

            default:
                System.out.println("erro!");

        }e.close();
    }
}