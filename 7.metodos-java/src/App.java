public class App {
    public static void main(String[] args) throws Exception {
        alarmeHoraDoLanch();
        double media1= calcularMedia(7.0,8.0,9.0);
        if (media1 >= 7.0){
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }

        System.out.println(potenciacao(2,2));
        System.out.println(potenciacao(3,2));
    }

    public static void alarmeHoraDoLanch(){
        System.out.println("Hora do lanche!");
    }

    //void = vazio, quando o metodo nao retorna valores
    public static double calcularMedia(double nota1, double nota2, double nota3){
        double media = (nota1 + nota2 + nota3)/3;
        return media;
    }

    public static double potenciacao(int base, int potencia){
       return Math.pow(base, potencia);
       
    }
}
