public class Chamado {

    String usuario;
    String problema;
    String status;

    public Chamado(String usuario, String problema) {
        this.usuario = usuario;
        this.problema = problema;
        this.status = "Aberto";
    }

    public void mostrarChamado() {
        System.out.println("Usuário: " + usuario);
        System.out.println("Problema: " + problema);
        System.out.println("Status: " + status);
        System.out.println("---------------------");
    }
}