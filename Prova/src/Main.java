import java.util.ArrayList;
import java.util.Scanner;

class Jogador {
    private String nome;
    private int votos;
    public Jogador(String nome) {
        this.nome = nome;
        this.votos = 0;
    }
    public String getNome() {
        return nome;
    }
    public int getVotos() {
        return votos;
    }
    public void incrementaUmVoto() {
        this.votos++;
    }
}
public class Main {
    public static void main(String[] args) {
        ArrayList<Jogador> jogadores = cadastrarJogadores();
        votar(jogadores);
        Jogador eliminado = apurarVotos(jogadores);
        System.out.println("Se eu conseguir mover montanhas, se eu conseguir surfar um tsunami, \n" +
                " se eu conseguir domar o sol, se eu conseguir fazer o mar virar sertão, e o sertão virar mar, \n " +
                "se eu conseguir dizer o que eu nunca vou conseguir dizer, aí terá chegado o dia em que eu vou conseguir " +
                "\nte eliminar com alegria. Com " + eliminado.getVotos() + " votos, é você quem sai " + eliminado.getNome());
    }
    public static ArrayList<Jogador> cadastrarJogadores() {
        ArrayList<Jogador> jogadores = new ArrayList<>();

        jogadores.add(new Jogador("Alane Dias"));
        jogadores.add(new Jogador("Beatriz Reis"));
        jogadores.add(new Jogador("Davi Brito"));
        jogadores.add(new Jogador("Deniziane Ferreira"));
        jogadores.add(new Jogador("Fernanda Bande"));
        jogadores.add(new Jogador("Giovanna Lima"));
        jogadores.add(new Jogador("Giovanna Pitel"));
        jogadores.add(new Jogador("Isabelle Nogueira"));
        jogadores.add(new Jogador("Juninho"));
        jogadores.add(new Jogador("Leidy Elin"));
        jogadores.add(new Jogador("Lucas Henrique"));
        jogadores.add(new Jogador("Lucas Luigi"));
        jogadores.add(new Jogador("Lucas Pizane"));
        jogadores.add(new Jogador("Marcus Vinicius"));
        jogadores.add(new Jogador("Matteus Amaral"));
        jogadores.add(new Jogador("Maycon Cosmer"));
        jogadores.add(new Jogador("MC Bin Laden"));
        jogadores.add(new Jogador("Michel Nogueira"));
        jogadores.add(new Jogador("Nizam"));
        jogadores.add(new Jogador("Raquele Cardozo"));
        jogadores.add(new Jogador("Rodriguinho"));
        jogadores.add(new Jogador("Thalyta Alves"));
        jogadores.add(new Jogador("Vanessa Lopes"));
        jogadores.add(new Jogador("Vinicius Rodrigues"));
        jogadores.add(new Jogador("Wanessa Camargo"));
        jogadores.add(new Jogador("Yasmin Brunet"));
        return jogadores;
    }
    public static void votar(ArrayList<Jogador> jogadores) {
        Scanner scanner = new Scanner(System.in);
        String voto;
        System.out.println("Bem - vindo ao sistema de votação do BBB");
        System.out.println("Digite o nome do jogador em quem você vota " +
                "para sair da casa (digite 'sair' para encerrar os votos):");

        while (true) {
            voto = scanner.nextLine();
            if (voto.equalsIgnoreCase("sair")) {
                break;
            }

            boolean jogadorEncontrado = false;

            for (Jogador jogador : jogadores) {
                if (jogador.getNome().equalsIgnoreCase(voto)) {
                    jogador.incrementaUmVoto();
                    jogadorEncontrado = true;
                    break;
                }
            }
            if (!jogadorEncontrado) {
                System.out.println("Jogador não encontrado. Por favor, digite o nome novamente:");
            }
        }
    }

    public static Jogador apurarVotos(ArrayList<Jogador> jogadores) {
        Jogador eliminado = null;
        int maiorVotos = 0;

        for (Jogador jogador : jogadores) {
            if (jogador.getVotos() > maiorVotos) {
                maiorVotos = jogador.getVotos();
                eliminado = jogador;
            }
        }

        return eliminado;
    }
}
