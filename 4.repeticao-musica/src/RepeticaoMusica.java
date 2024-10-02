import java.util.Scanner;

public class RepeticaoMusica {
    public static void main(String[] args) {
        //controle de repeticao
        // enquanto algo estiver acontecendo algo continua acontecendo
        boolean repeat = true;

        // == comparacao , = atribuicao
        while(repeat == true){
            System.out.println("Tocar Música");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Devo repetir a musica? (responda digitando true ou false)");
            repeat = scanner.nextBoolean();
        }

        System.out.println("Encerrando");
    }
}
