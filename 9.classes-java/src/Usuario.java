public class Usuario{
     //ATRIBUTO DE INSTANCIA = variam a cada instancia
    public String username;
    public String password;
    public String email;
    public boolean ativo;

     //ATRIBUTO DE CLASSE = COMUM A TODAS INSTANCIAS CRIADAS A PARTIR DA CLASSE = TEM STATIC E TEM O FINAL PORQUE EH UMA CONSTANTE E ELE EH FINAL
    public static final int NUMERO_CARACTERES_USERNAME=10;

    public Usuario(String username, String password, String email){
        this.username=username;
        this.password=password;
        this.email=email;
    }

    public boolean isAtivo(){
        return ativo;
    }
    // com static pertence a classe acessado pela classe 
    // sem static pertence pertence ao objeto acessado pelo objeto
    public static int getLimiteCarateres(){
        return NUMERO_CARACTERES_USERNAME;
    }
}