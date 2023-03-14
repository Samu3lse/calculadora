import java.util.Scanner;


public class Calculadora {
    public static void main(String[] args) {


        Scanner scn = new Scanner(System.in);


        int Opcao = 0;


        double Valor1;


        double Valor2;


        double Resultado;


        while (Opcao != 5) {


            switch (Opcao) {


                case 1:


                    System.out.println("Adição");


                    System.out.println("Entre com o primeiro valor:");


                    Valor1 = scn.nextDouble();


                    System.out.println("Entre com o segundo valor:");


                    Valor2 = scn.nextDouble();


                    Resultado = Valor1 + Valor2;


                    System.out.println("O Resultado é:" + Resultado);


                    break;


                case 2:


                    System.out.println("Subtração");


                    System.out.println("Entre com o primeiro valor:");


                    Valor1 = scn.nextDouble();


                    System.out.println("Entre com o segundo valor:");


                    Valor2 = scn.nextDouble();


                    Resultado = Valor1 - Valor2;


                    System.out.println("O Resultado é:" + Resultado);


                    break;


                case 3:


                    System.out.println("Multiplicação");


                    System.out.println("Entre com o primeiro valor:");


                    Valor1 = scn.nextDouble();


                    System.out.println("Entre com o segundo valor:");


                    Valor2 = scn.nextDouble();


                    Resultado = Valor1 * Valor2;


                    System.out.println("O Resultado é:" + Resultado);


                    break;


                case 4:


                    System.out.println("Divisão");


                    System.out.println("Entre com o primeiro valor:");


                    Valor1 = scn.nextDouble();


                    System.out.println("Entre com o segundo valor:");


                    Valor2 = scn.nextDouble();


                    Resultado = Valor1 / Valor2;


                    System.out.println("O Resultado é:" + Resultado);


                    break;


                case 5:


                    break;


            }


            System.out.println();


            System.out.println("Calculadora em Java");


            System.out.println();


            System.out.println("1. Adição");


            System.out.println("2. Subtração");


            System.out.println("3. Multiplicação");


            System.out.println("4. Divisão");


            System.out.println("5. Sair");


            System.out.println();


            System.out.println("Escolha a opção:");


            Opcao = scn.nextInt();


        }


    }


}
