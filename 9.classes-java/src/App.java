public class App {
    public static void main(String[] args) throws Exception {
        //variavel nao esta associada a um objeto = nao foi instanciada
        Usuario usuario1 = null;
        System.out.println(usuario1);

        Usuario usuario = new Usuario(
            "Franciele",
            "franciele123",
            "fran@email.com"
        );

        Usuario usuario2 = new Usuario(
            "Franciele2",
            "franciele1234",
            "fran2@email.com"
        );

        System.out.println(usuario.isAtivo());
        System.out.println(usuario2.isAtivo());
        System.out.println(Usuario.getLimiteCarateres);
        



    }
}
