import java.util.Scanner;

public class MensagemDoDia {
    public static void main(String[] args)  {
        //selecionando o bloco de codigo que vai ser executado usando if (se)
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 10:");
        int numero = scanner.nextInt();
        //operadores relacionais =  relacionam um valor com outro 
        // >,<, <=,>=, ==, !=
        //operador logico and && ;; 1 falso é tudo falso 
        //operador logico or ||
        
        //entre 1 e 5
        if (numero >=1 && numero<=5){
            System.out.println("quem avisa amigo é");
        // entre 6 e 10
        } else if (numero >=6 && numero<=10){
            System.out.println("voce é o que voce come");
        // fora do intervalo
        } else {
        System.out.println("Informe uma opção válida");
        }
    }
}
