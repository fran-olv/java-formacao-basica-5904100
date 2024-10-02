import java.util.Scanner;

public class EstudanteApp {
    public static void main(String[] args) {
       int idade = 18;
       char inicialDoNome = 'F';
       char inicialDoSobrenomenome='O';
       double media=10.0; //decimal
       boolean aprovado=true;
       String nome = "Franciele";
       String sobrenome = "Oliveira";

       

       System.out.println(inicialDoNome);
       System.out.println(inicialDoSobrenomenome);
       System.out.println(media);
       System.out.println(aprovado);
       System.out.println(nome);
       System.out.println("Franciele");
       System.out.println(nome + " " + sobrenome);
       System.out.println(inicialDoNome + " " + inicialDoSobrenomenome);
//concatenacao com String
       System.out.println(
        idade + ", " 
        + inicialDoNome + ", "
        + inicialDoSobrenomenome + ", "
        + media + ", "
        + aprovado + ", "
        + nome + ", "
        + sobrenome        
        );

        //operador de acesso .
        // charAt = acessar um caracter em uma determinada posicao, indice inicia por 0
        System.out.println(nome.charAt(0)); //primeira letra
        System.out.println(nome.charAt(1)); //segunda letra

        // length = tamanho da string
        System.out.println(nome.length());

        //imprimir a ultima letra
        System.err.println(nome.charAt(nome.length()-1));

        //equals = comparar string
        System.out.println(nome.equals(sobrenome));
        System.out.println(nome.equals("Franciele"));

        //Scanner = entrada de valores
        Scanner scanner = new Scanner(System.in); //comecar a ouvir
        media = scanner.nextDouble(); //obter o que foi digitado e colaca numa variavel

        System.out.println(media);
        

    }
}
