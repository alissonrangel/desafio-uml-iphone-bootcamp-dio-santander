package classes;

import interfaces.AparelhoTelefonico;

public class Phone implements AparelhoTelefonico {
    @Override
    public void ligar() {
        System.out.println("Fazer ligação");
    }

    @Override
    public void atender() {
        System.out.println("Atender ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciar correio de voz");
    }

    @Override
    public void enviarMensagemDeTexto() {
        System.out.println("Enviar mensagem de texto");
    }

    @Override
    public void lerMensagemDeTexto() {
        System.out.println("Ler mensagem de texto");
    }
}
