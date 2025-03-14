package br.com.desafio.iphone.model;

import br.com.desafio.iphone.interfaces.AparelhoTelefonico;
import br.com.desafio.iphone.interfaces.NavegadorInternet;
import br.com.desafio.iphone.interfaces.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void tocar() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.printf("Selecionando a música: %s\n", musica);
    }


    @Override
    public void ligar(String numero) {
        System.out.printf("Ligando para: %s\n", numero);

    }

    @Override
    public void atender() {
        System.out.printf("Atendendo chamada..\n");
    }

    @Override
    public void iniciarCorreiorVoz() {
        System.out.printf("Iniciando correior de voz..\n");
    }


    @Override
    public void exibirPagina(String url) {
        System.out.printf("Exibindo página: %s\n", url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.printf("Nova aba adicionada no navegador.\n");
    }

    @Override
    public void atualizarPagina() {
        System.out.printf("Página atualizada.\n");
    }
}
