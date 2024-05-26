public class ReprodutorMusical {

    private String musicaAtual;
    private boolean tocando;

    public void tocar() {
        if (!tocando) {
            tocando = true;
            System.out.println("Música " + musicaAtual + " começando a tocar.");
        } else {
            System.out.println("A música já está tocando.");
        }
    }

    public void pausar() {
        if (tocando) {
            tocando = false;
            System.out.println("Música " + musicaAtual + " pausada.");
        } else {
            System.out.println("Nenhuma música está tocando.");
        }
    }

    public void selecionarMusica(String musica) {
        this.musicaAtual = musica;
        System.out.println("Música " + musica + " selecionada.");
    }
}
