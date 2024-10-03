/*
 * Crie um programa com uma questão de múltipla escolha.
 * A pergunta deverá ter 3 alternativas de resposta, com apenas uma correta.
 * O usuário vai poder escolher a alternativa correta.
 * O programa deve informar se o usuário acertou ou errou, e também qual a
 * alternativa correta.
 */

import java.util.Scanner;

public class QuizComErros {

    //erros de compilacao = erros de sintaxe = erros que aparecem antes de se executar o programa

    public static void main(String[] args) {
        String pergunta = "qual é a versão mais atual do Java LTS? ";
        String alternativa1 = "1 - java 8 ";
        String alternativa2 = "2 - java 17 ";
        String alternativa3 ="3 - java 21 ";
        int respostaCerta = 3;

        System.out.println(pergunta);
        System.out.println(alternativa1);
        System.out.println(alternativa2);
        System.out.println(alternativa3);

        System.out.println("Digite 1, 2 ou 3");
        Scanner scanner = new Scanner(System.in);
        int resposta = scanner.nextInt();
        if(resposta == respostaCerta){
            System.out.println("Parabéns! Você acertou! ");
        }else {
        System.out.println("Que pena a resposta certa é: "+ alternativa3);
        }
    }
}
