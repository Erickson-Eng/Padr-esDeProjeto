package br.com.ifpb.bridge;

public class Teste {
    public static void main(String[] args) {
        JanelaAbstrata janela = new JanelaDialogo(new JanelaLinux());
        janela.desenhar();
        janela = new JanelaAviso(new JanelaLinux());
        janela.desenhar();
        System.out.println("------------------------------------------------------------------------------------------------------");
        janela = new JanelaDialogo(new JanelaWindows());
        janela.desenhar();
        System.out.println("------------------------------------------------------------------------------------------------------");
        janela = new JanelaDownload(new JanelaAndroid());
        janela.desenhar();
    }
}
