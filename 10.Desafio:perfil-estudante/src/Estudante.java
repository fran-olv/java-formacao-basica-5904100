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

 public class Estudante{
    public String nome;
    int anoParaFormatura;
    double media;


    public Estudante(String nome, int anoParaFormatura, double media){
        this.nome=nome;
        this.anoParaFormatura=anoParaFormatura;
        this.media=media;
    }

    public void setAnoParaFormatura(int anoParaFormatura){
        this.anoParaFormatura=anoParaFormatura;
    }
 }