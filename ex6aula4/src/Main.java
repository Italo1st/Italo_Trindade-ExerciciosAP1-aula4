import java.util.Scanner;
// ex6aula4 Italo Trindade
public class Main {
    public static void main(String[] args) {
        Scanner e=new Scanner(System.in);

        System.out.println("--------- Cardápio lanchonete---------");
        System.out.println("=======================================");
        System.out.println("CÓDIGO: | PRODUTO:          |   PREÇO: ");
        System.out.println("100     | Cachorro quente   |    R$1,20 ");
        System.out.println("101     | Bauru simples     |    R$1,30 ");
        System.out.println("102     | Bauru c/ ovo      |    R$1,50 ");
        System.out.println("103     | Hamburguer        |    R$1,20 ");
        System.out.println("104     | Cheeseburguer     |    R$1,30 ");
        System.out.println("105     | Refrigerante      |    R$1,00 ");
        System.out.println("=======================================");

        System.out.println(" Digite o código do produto desejado: ");

        int codigoprod = e.nextInt();

        switch (codigoprod){
            case 100 :
                System.out.println("Qual a quantidade do produto desejada? ");

                double quantidade = e.nextDouble();
                double preco = (quantidade*1.20);
                System.out.printf("O(s) produto(s) escolhido(s) foi/foram, Cachorros quentes, e o preço total a se pagar é de: R$ %.2f%n " , preco );

                break;

            case 101 :
                System.out.println("Qual a quantidade do produto desejada? ");

                quantidade = e.nextDouble();
                preco = (quantidade*1.30);
                System.out.printf("O(s) produto(s) escolhido(s) foi/foram, Bauru simples , e o preço total a se pagar é de: R$ %.2f%n " , preco );

                break;

            case 102 :
                System.out.println("Qual a quantidade do produto desejada? ");

                quantidade = e.nextDouble();
                preco = (quantidade*1.50);
                System.out.printf("O(s) produto(s) escolhido(s) foi/foram, Bauru c/ ovo, e o preço total a se pagar é de: R$ %.2f%n " , preco );

                break;

            case 103 :
                System.out.println("Qual a quantidade do produto desejada? ");

                quantidade = e.nextDouble();
                preco = (quantidade*1.20);
                System.out.printf("O(s) produto(s) escolhido(s) foi/foram, Hamburguer , e o preço total a se pagar é de: R$ %.2f%n " , preco );

                break;

            case 104 :
                System.out.println("Qual a quantidade do produto desejada? ");

                quantidade = e.nextDouble();
                preco = (quantidade*1.30);
                System.out.printf("O(s) produto(s) escolhido(s) foi/foram, Cheeseburguer , e o preço total a se pagar é de: R$ %.2f%n " , preco );

                break;

            case 105 :
                System.out.println("Qual a quantidade do produto desejada? ");

                quantidade = e.nextDouble();
                preco = (quantidade*1.00);
                System.out.printf("O(s) produto(s) escolhido(s) foi/foram, Refrigerante , e o preço total a se pagar é de: R$ %.2f%n " , preco );

                break;

            default:
                System.out.println("Erro!");

        }e.close();
    }
}