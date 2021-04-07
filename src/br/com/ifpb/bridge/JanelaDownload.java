package br.com.ifpb.bridge;

import java.util.Scanner;

public class JanelaDownload extends JanelaAbstrata{


    public JanelaDownload(JanelaImplementada j) {
        super(j);
    }

    @Override
    public void desenhar() {
        String caminho;
        desenharJanela("Download");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o caminho para salvar o arquivo: ");
        caminho = scanner.nextLine();
        System.out.println("Seu arquivo será salvo em :"+ caminho);
        scanner.close();
        desenharBotao("Realizar Download");
        desenharBotao("Pausar Download");
        desenharBotao("Cancelar Download");
    }
}
