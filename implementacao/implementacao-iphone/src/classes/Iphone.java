package classes;

import interfaces.AparelhoFotografico;
import interfaces.AparelhoTelefonico;
import interfaces.NavegadorNaInternet;
import interfaces.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, AparelhoFotografico, NavegadorNaInternet {
    @Override
    public void tirarFoto() {
        System.out.println("Tirar Foto no Iphone");
    }

    @Override
    public void verFoto() {
        System.out.println("Ver Foto no Iphone");
    }

    @Override
    public void darUmZoom() {
        System.out.println("Dar um zoom na foto no Iphone");
    }

    @Override
    public void ligar() {
        System.out.println("Fazer ligação no Iphone");
    }

    @Override
    public void atender() {
        System.out.println("Atender ligação no Iphone");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciar correio de voz no Iphone");
    }

    @Override
    public void enviarMensagemDeTexto() {
        System.out.println("Enviar mensagem de texto no Iphone");
    }

    @Override
    public void lerMensagemDeTexto() {
        System.out.println("Ler mensagem de texto no Iphone");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibir página no Iphone");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionar nova aba no Iphone");
    }

    @Override
    public void removerAba() {
        System.out.println("Remover aba no Iphone");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizar página no Iphone");
    }

    @Override
    public void tocar() {
        System.out.println("Tocar música no Iphone");
    }

    @Override
    public void pausar() {
        System.out.println("Pausar música no Iphone");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionar música no Iphone");
    }
}
