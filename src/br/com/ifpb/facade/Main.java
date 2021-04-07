package br.com.ifpb.facade;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("##### Configurando subsistemas #####");
        SistemasFacade fachada = new SistemasFacade();
        fachada.inicializarSubsistemas();

        System.out.println("##### Utilizando subsistemas #####");
        fachada.renderizarImagem("imagem.png");
        fachada.reproduzirAudio("teste.mp3");
        fachada.lerInput();
    }
}
