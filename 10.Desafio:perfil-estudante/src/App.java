/*
 * Você deve criar um programa que gerencie um Perfil de Estudante.
 * 
 * Para isso, crie uma classe Estudante com os seguintes membros:
 * Atributos:
 * - nome
 * - anoParaFormatura
 * - media
 * Métodos:
 * - setAnoParaFormatura(int anoParaFormatura)
 * Construtures:
 * - Padrão
 * - Canônico
 */

public class App {
    public static void main(String[] args) throws Exception {
        Estudante estudante1 = new Estudante("Fran", 2028, 9.0);
        Estudante estudante2 = new Estudante("Fran1", 2028, 9.4);

        estudante1.setAnoParaFormatura(2025);
    }
}
