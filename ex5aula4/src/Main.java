import java.util.Scanner;
// ex5aula4 Italo Trindade
public class Main {
    public static void main(String[] args) {
        Scanner e=new Scanner(System.in);


        System.out.println("======================");
        System.out.println("Digite o 1° numero: ");
        System.out.println("=====================");

        double numero1 =e.nextDouble();


        System.out.println("======================");
        System.out.println("Digite o 2° numero: ");
        System.out.println("=====================");

        double numero2= e.nextDouble();


        System.out.println("============================");
        System.out.println("Informe a operação desajada:");
        System.out.println("-----------------------------");
        System.out.println("Opção [M]");
        System.out.println("Opção [S]");
        System.out.println("Opção [P]");
        System.out.println("Opção [D]");
        System.out.println("=============================");

        char opcoes = Character.toUpperCase(e.next().charAt(0));

        switch (opcoes) {
            case 'M':
                double media = (numero1+numero2)/2;

                System.out.printf(" A media entre os numeros digitados é %.2f%n " , media);
            break;

            case 'S':
                double diferenca;

                if (numero1>numero2){
                    diferenca= numero1-numero2;
                    System.out.println(" A diferença entre o " + numero1 + " e " + numero2 + " é " + diferenca);
                }else {
                    diferenca= numero2-numero1;
                    System.out.println(" A diferença entre o " + numero2 + " e " + numero1 + " é " + diferenca);
                }
                break;

            case 'P':
                double produto = numero1*numero2;
                System.out.println(" O produto entre os numeros digitados é: " + produto );

                break;

            case 'D':
                double divisao = numero1/numero2;
                System.out.println(" O resultado da divisão do 1° numero pelo 2° numero é : " + divisao);

                break;

            default:
                System.out.println(" Erro!");
        }e.close();

    }
}