public class Celular {
    public static void main(String[] args) {
        ReprodutorMusical reprodutor = new ReprodutorMusical();
        reprodutor.selecionarMusica("Minha música favorita");
        reprodutor.tocar();
        reprodutor.pausar();

        AparelhoTelefonico telefone = new AparelhoTelefonico();
        telefone.ligar("123456789");
        telefone.atender();
        telefone.iniciarCorreioVoz();

        NavegadorInternet navegador = new NavegadorInternet();
        navegador.exibirPagina("https://www.google.com.br");
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();

    }
}
