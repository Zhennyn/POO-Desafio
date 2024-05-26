public abstract class Celular implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

        
        public void ligar(){
            System.out.println("LIGANDO PARA ALGUEM");

        }

        public void atender(){
            System.out.println("RECEBENDO CHAMADA");
            
        }

        public void iniciarCorreioVoz(){
            System.out.println("INICIANDO CORREIO DE VOZ");
        }

        public void tocar(){
            System.out.println("TOCANDO MUSICA");
        }

        public void pausar(){
            System.out.println("PAUSAR MUSICA");
        }

        public void selecionarMusica(){
            System.out.println("SELECIONANDO MUSICA");
        }

        public void exibirPagina(){
            System.out.println("PAGINA EM EXIBIÇÃO");
        }

        public void adicionarNovaAba(){
            System.out.println("NOVA ABA ADICIONADA");
        }

        public void atualizarPagina(){
            System.out.println("PAGINA SENDO ATUALIZADA");
        }
}
