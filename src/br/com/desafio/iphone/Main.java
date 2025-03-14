package br.com.desafio.iphone;

import br.com.desafio.iphone.model.Iphone;

public class Main {
    public static void main(String[] args) {

        Iphone iphone = new Iphone();

        iphone.selecionarMusica("Salmo 126 - Ministério Zoe");
        iphone.tocar();
        iphone.pausar();

        System.out.println("==================================");

        iphone.ligar("1199999999");
        iphone.atender();
        iphone.iniciarCorreiorVoz();

        System.out.println("==================================");

        iphone.exibirPagina("https://www.google.com.br");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}