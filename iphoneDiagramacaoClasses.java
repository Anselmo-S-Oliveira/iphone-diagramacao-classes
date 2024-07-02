package iphone;

public interface iphoneDiagramacaoClasses implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    public void ligar(String numero) {
    	System.out.println("Ligando");
    }

    public void atender(String numero) {
    	System.out.println("Atentendo ligação");
    }

    public void iniciarCorreioVoz(String mensagem, String destinatario) {
    	System.out.println("No momento não posso atender, deixe sua mensagem após o beep");
    }

    public void exibirPagina(String url) {
    	System.out.println("Abrindo página na internet");
    }

    public void adicionarNovaAba(String url) {
    	System.out.println("Abrindo nova Aba");
    }

    public void atualizarPagina() {
    	System.out.println("Atualizando página");
    }

    public void tocar() {
    	System.out.println("Tocando música selecionada");
    }

    public void pausar() {
    	System.out.println("Pausando música");
    }

    public void selecionarMusica() {
    	System.out.println("Selecionando música escolhida");
    }
}