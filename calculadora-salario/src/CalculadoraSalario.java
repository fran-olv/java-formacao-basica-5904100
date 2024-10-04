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
       double horas = scanner.nextDouble();
       double preco = scanner.nextDouble();

       System.out.println(SalarioDaSemana(horas, preco));

    }

    public static double SalarioDaSemana(double horas, double preco){
        return (horas*preco);
    }
}
