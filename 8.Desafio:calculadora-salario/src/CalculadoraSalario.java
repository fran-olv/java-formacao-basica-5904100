/*
 * Crie um programa que calcule o salário do empregado.
 * O programa deve ler:
 *      - O número de horas trabalhadas na semana.
 *      - O preço da hora do empregado.
 */

import java.util.Scanner;

public class CalculadoraSalario {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Digite o valor da hora:");
       double horas = scanner.nextDouble();
       System.out.println("Quantas horas trabalhadas?");
       double preco = scanner.nextDouble();

       System.out.println(SalarioDaSemana(horas, preco));

    }

    public static double SalarioDaSemana(double horas, double preco){
        return (horas*preco);
    }
}
