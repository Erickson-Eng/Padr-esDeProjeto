package br.com.ifpb.facade;

public class SistemaDeVideo {
    public void configurarCores() {
        System.out.println("Testando espectro de cores");
    }

    public void configurarResolucao() {
        System.out.println("Escolhendo melhor resolução");
    }

    public void renderizarImagem(String imagem) {
        System.out.println("Renderização acontecendo aguarde "+imagem);
    }
}
