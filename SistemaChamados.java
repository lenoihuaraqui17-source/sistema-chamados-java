import java.util.ArrayList;
import java.util.Scanner;

class Chamado {

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
        System.out.println("--------------------");
    }
}

public class SistemaChamados {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Chamado> chamados = new ArrayList<>();

        while (true) {

            System.out.println("1 - Abrir chamado");
            System.out.println("2 - Listar chamados");
            System.out.println("3 - Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {

                System.out.println("Nome do usuário:");
                String usuario = scanner.nextLine();

                System.out.println("Problema:");
                String problema = scanner.nextLine();

                Chamado chamado = new Chamado(usuario, problema);
                chamados.add(chamado);

                System.out.println("Chamado registrado!");

            } else if (opcao == 2) {

                for (Chamado c : chamados) {
                    c.mostrarChamado();
                }

            } else if (opcao == 3) {
                break;
            }
        }
    }
}
